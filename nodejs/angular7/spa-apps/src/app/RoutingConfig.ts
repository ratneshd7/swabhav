import { Home } from './home.component';
import { About } from './about.component';
import { Career } from './career.component';
import {  Routes } from '@angular/router';

export const routes:Routes=[
  { path:'home', component:Home },
  { path:'about', component:About},
  { path:'', component:Home},
  { path:'career',  component:Career}
]

