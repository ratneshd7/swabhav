import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './welcome.component.html'
// styleUrls: ['./app.component.css']
})
export class WelcomeComponent {
  message:String;
  states:String
  constructor(){
  this.message="Welcome to angular 8"
  }
  stateChangeEventHandler(e){
    console.log(e)
    this.states=e;
  }

}
