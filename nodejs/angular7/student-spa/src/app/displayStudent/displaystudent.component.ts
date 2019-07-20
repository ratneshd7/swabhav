import { Component } from "@angular/core";
import { StudentService } from 'src/services/studentservice.service';
import { Router } from '@angular/router';

export const StudentData={
  id:"",
  name:"",
  age:"",
  rollNo:"",
  date:"",
  email:"",
  isMale:""
}

@Component({
  selector:'display',
  templateUrl:'displaystudent.component.html'
})

export class DisplayStudentComponent{
  result: any;
  resultLength:string;
  Student={
      name:"",
      age:"",
      rollNo:"",
      date:"",
      email:"",
      isMale:true
  }
  constructor(private studentService: StudentService,private router:Router) {
    console.log("dsaplay")
    this.result="";
    this.getStudentData();
}

getStudentData() {
    this.studentService.getStudents()
        .then((r) => {
            this.result = r;
            //console.log(this.result[1].name);
            this.resultLength=this.result.length;
        })
        .catch((err) => {
            //this.result = err;
        });
}
deleteStudent(id){
  this.studentService.deleteStudents(id)
  .then((r) => {
      this.result = r;

      this.getStudentData();

  })
  .catch((err) => {

  });
}

myindex:" ";
EditData(id)
{

    for(let index=0;index<this.result.length;index++)
    {
        if(id==this.result[index].id)
        {
            this.myindex=this.result[index].id;
            StudentData.id=this.result[index].id;
            StudentData.name=this.result[index].name;
            StudentData.age=this.result[index].age;
            StudentData.rollNo=this.result[index].rollNo
            StudentData.date=this.result[index].date
            StudentData.email=this.result[index].email;
            if(this.result[index].isMale)
            {
                StudentData.isMale="true";
            }
            else
            {
                StudentData.isMale="false";
            }
        }
    }

    this.router.navigate(['/updatestudent/'+this.myindex]);

}
}
