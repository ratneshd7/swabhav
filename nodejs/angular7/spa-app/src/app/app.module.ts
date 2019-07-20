import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { Home } from './home.component';
import { About } from './about.component';
import { Career } from './career.component';
import { FormsModule } from '@angular/forms';
import { WelcomeComponent } from './welcome.component';
import { AppRoutingModule } from './RoutingConfig';

@NgModule({
  declarations: [
    WelcomeComponent ,
    Home,
    About,
    Career
  ],
  imports: [
    BrowserModule ,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [WelcomeComponent]
})
export class AppModule { }
