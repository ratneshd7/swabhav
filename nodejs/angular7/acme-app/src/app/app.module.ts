import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { WelcomeComponent } from './welcome.component';
import { ProductlstComponent } from './productlst.component';
import { ProductServce } from './productservce.component';
import { HttpClientModule } from '@angular/common/http';
import { StarButton } from './star.component';
import { FormsModule } from '@angular/forms';
import { FilterPipe } from './textflter.pipe';
import { ProductDetailcomponent } from './productdetail.component';

@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    ProductlstComponent,
    ProductDetailcomponent,
    StarButton,
    FilterPipe

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ProductServce],
  bootstrap: [AppComponent]
})
export class AppModule { }
