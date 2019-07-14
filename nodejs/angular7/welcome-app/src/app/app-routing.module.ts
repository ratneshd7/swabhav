import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { WelcomeComponent } from './welcome/welcome.component';
import { StudentComponent } from './student/student.component';
import { MultibindComponent } from './multibind/multibind.component';
import { BlueballComponent } from './Blueball/bluball.component';
import { EvenNo } from './services/evenno.component';
import { NumberApi } from './numberapi/numberapi.component';


const routes: Routes = [{path:'welcome',component:WelcomeComponent},
                        {path:'student',component:StudentComponent},
                        {path:'multibind',component:MultibindComponent},
                        {path:'blueball',component:BlueballComponent},
                        {path:'evenno',component:EvenNo},
                        {path:'numberapi',component:NumberApi},
                      {path:'',component:WelcomeComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
