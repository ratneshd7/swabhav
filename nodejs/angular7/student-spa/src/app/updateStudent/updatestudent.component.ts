import { Component } from "@angular/core";
import { StudentService } from 'src/services/studentservice.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  templateUrl:'updatestudent.component.html'
})

export class UpdateStudentComponent{
  id :String;
  StudentData={
    name:"",
    age:"",
    rollNo:"",
    date:"",
    email:"",
    isMale:""
}

  constructor(private studentService: StudentService, private router: Router, private route: ActivatedRoute) {
    this.route.paramMap.subscribe(p => { this.id = p.get('id') })
    this.getStudentByID(this.id);
}

getStudentByID(id){
  this.studentService.getStudents().then((r) => {

    for(let index=0;index<r.length;index++)
    {
        if(id==r[index].id)
        {


            this.StudentData.name=r[index].name;
            this.StudentData.age=r[index].age;
            this.StudentData.rollNo=r[index].rollNo
            this.StudentData.date=r[index].date
            this.StudentData.email=r[index].email;
            if(r[index].isMale)
            {
              console.log("true")
              this.StudentData.isMale="male";
            }
            else
            {
              console.log("false")
              this.StudentData.isMale="female";
            }
        }
    }
})
.catch((err) => {

});
}
updateData(){

  let Student={
    name:"",
    age:"",
    rollNo:"",
    date:"",
    email:"",
    isMale:true
}

            Student.name=this.StudentData.name
            Student.age=this.StudentData.age;
            Student.rollNo=this.StudentData.rollNo
            Student.date=this.StudentData.date
            Student.email=this.StudentData.email;
  if(this.StudentData.isMale=="male")
  {
    console.log("true")
    Student.isMale=true;
  }
  else
  {
    console.log("false")
    Student.isMale=false;
  }

  this.studentService.updateStudents(this.id,Student).then((r)=>{
    console.log("updated datattatatata")
    this.router.navigateByUrl('/displaystudent')
  }).catch((err) => {
    console.log(" not  updated datattatatata")
  });

}
}
