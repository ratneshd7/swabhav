import { Component, Injectable } from "@angular/core";

@Component({
  selector:'app-root',
  templateUrl:'./evenno.component.html'

})
export class  EvenNo{
  evennum:any[];
  value:number;
  constructor(private service:MathService)
  {}
 getService(){
          this.evennum=this.service.getresult(this.value)
          console.log(this.value)
          console.log(this.evennum)
        }
  }
  @Injectable()
export class MathService{
        count:number=0
        evenno=[];
        getresult(val){
      for(let i=0;i<=val;i++){
        if(i%2==0){
          this.evenno[this.count]=i
          this.count++
        }
}
return this.evenno
 }
}
