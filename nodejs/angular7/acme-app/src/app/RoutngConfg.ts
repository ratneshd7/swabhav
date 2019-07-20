import { Routes } from '@angular/router';
import { WelcomeComponent } from './welcome.component';
import { ProductlstComponent } from './productlst.component';
import { ProductDetailcomponent } from './productdetail.component';

export const routes:Routes=[
  { path:'welcome', component: WelcomeComponent},
  { path:'productlst', component:ProductlstComponent},
  { path:'productdetail/:code', component:ProductDetailcomponent},
  { path:'',  component:WelcomeComponent}
]
