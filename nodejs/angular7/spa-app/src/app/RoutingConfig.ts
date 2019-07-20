import { Home } from './home.component';
import { About } from './about.component';
import { Career } from './career.component';
import { RouterModule, Routes } from '@angular/router';
import { NgModule } from '@angular/core';


 const routes:Routes=[
  { path:'home', component:Home },
  { path:'about', component:About},
  { path:'', component:Home},
  { path:'career',  component:Career}
]


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]

})
export class AppRoutingModule { }
