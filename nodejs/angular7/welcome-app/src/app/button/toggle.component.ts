import { Component, Input, Output, EventEmitter } from "@angular/core";


@Component({
  selector:'toggle-button',
  templateUrl:'./toggle.component.html'
})
export class ToggleButton{
  color;
  @Input()
  textValue:String;
  state:number;
  @Input()
  onStateColor:String;
  @Input()
  offStateColor:String

  @Output()
  stateChanged=new EventEmitter();

  constructor(){
    this.textValue="Nothing";
    this.state=0;
    console.log("inside constructor")
    console.log(this.textValue)
    // this.onStateColor='gray';
    // this.offStateColor='gray';
  }
  changeState(){
    if(this.state==0){
    this.color=this.onStateColor;
    this.state=1
    this.stateChanged.emit("state changed to"+this.state)
  }
    else{
    this.color=this.offStateColor;
    this.state=0
    this.stateChanged.emit("state changed to"+this.state)
  }
  }
  ngOnInit(){
    console.log("inside ngOnInit")
    console.log(this.textValue)
  }
}
