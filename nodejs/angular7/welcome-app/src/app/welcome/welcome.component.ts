import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './welcome.component.html'
// styleUrls: ['./app.component.css']
})
export class WelcomeComponent {
  message:String;
  constructor(){
  this.message="Welcome to angular 8"
  }
}
