import { Component, Input } from "@angular/core";

@Component({
  selector:'star-button',
  templateUrl:'./star.component.html'
})
export class StarButton{
  @Input()
  rating:number;
  constructor(){
    this.rating=0;
  }

}
