import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DisplayStudentComponent } from './displayStudent/displaystudent.component';
import { FormsModule } from '@angular/forms';
import { StudentService } from '../services/studentservice.service';
import { HttpClientModule } from '@angular/common/http';
import { GenderPipes } from '../services/genderPipe.pipe';
import { AddStudentComponent } from './addStudent/addstudent.component';
import { UpdateStudentComponent } from './updateStudent/updatestudent.component';

@NgModule({
  declarations: [
    AppComponent,
    DisplayStudentComponent,
    AddStudentComponent,
    UpdateStudentComponent,
    GenderPipes
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [StudentService],
  bootstrap: [AppComponent]
})
export class AppModule { }
