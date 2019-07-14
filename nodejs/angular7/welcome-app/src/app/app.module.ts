import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { StudentComponent } from './student/student.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { AppComponent } from './app.component';
import { MultibindComponent } from './multibind/multibind.component';
import {FormsModule} from '@angular/forms';
import { BlueballComponent } from './Blueball/bluball.component';
import { MathService, EvenNo } from './services/evenno.component';
import { NumberApi } from './numberapi/numberapi.component';
import { ApiHttp } from './numberapi/apihttp.component';
import { HttpClientModule, HttpClientJsonpModule } from '@angular/common/http';

@NgModule({
  declarations: [
    StudentComponent,
    WelcomeComponent,
    AppComponent,
    MultibindComponent,
    BlueballComponent,
    EvenNo,
    NumberApi

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,

  ],
  providers: [MathService,ApiHttp],
  bootstrap: [AppComponent]
})
export class AppModule { }
