import { Routes } from '@angular/router';
import { DisplayStudentComponent } from './displayStudent/displaystudent.component';
import { AddStudentComponent } from './addStudent/addstudent.component';
import { UpdateStudentComponent } from './updateStudent/updatestudent.component';

export const routes: Routes=[
  { path:'displaystudent',component:DisplayStudentComponent},
  { path:'',component:DisplayStudentComponent},
  {path:'addstudent',component:AddStudentComponent},
  {path:'updatestudent/:id',component:UpdateStudentComponent}
];
