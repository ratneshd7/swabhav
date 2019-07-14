import { Component } from "@angular/core";

@Component({
selector:'app-root',
templateUrl:'./multibind.component.html'
})

export class MultibindComponent{
value:String=''
getcolor:String
changeColor(action){
  this.getcolor=action.target.value
   console.log(action.target.value)
   console.log(this.getcolor)
}
}
