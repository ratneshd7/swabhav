import { Component } from "@angular/core";
import { StudentService } from 'src/services/studentservice.service';
import { Router } from '@angular/router';

@Component({
  templateUrl:'addstudent.component.html'
})
export class AddStudentComponent{
  Student={
    name:"",
    age:"",
    rollNo:"",
    date:"",
    email:"",
    isMale:true
}
constructor(private studentService: StudentService,private router:Router) {
console.log("nsde student servce")  ;
}
AddData(){
  this.studentService.addStudents(this.Student)
        .then((r) => {

            console.log(r);
            this.router.navigateByUrl('/displaystudent')
        })
        .catch((err) => {
         console.log("errror" +err);
        });

}
}
