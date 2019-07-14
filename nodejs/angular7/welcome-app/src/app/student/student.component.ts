import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './student.component.html'
// styleUrls: ['./app.component.css']
})

export class StudentComponent  {
student:IStudent={id:1,name:"Ratnesh",cgpa:8.11}
students:IStudent[]=[{id:1,name:"Ratnesh",cgpa:8.11},{id:2,name:"Ravi",cgpa:8.11},{id:3,name:"Rakesh",cgpa:8.11}]
result:IStudent[]
loadStudentData=function(event){
console.log(event)
 this.result=this.students
}
}

interface IStudent{
  id:Number,
  name:String,
  cgpa:Number
}
