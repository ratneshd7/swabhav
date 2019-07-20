import { Component } from '@angular/core';
import { ProductServce } from './productservce.component';
@Component({
  templateUrl:'./productlst.component.html'
})
export class ProductlstComponent{
  buttonstatus="Hide Image"
  status:boolean= true
  result;
  constructor(private getservce:ProductServce){
    getservce.getProductlst().then((r)=> {
      //console.log(r)
      this.result=r;
    }).catch((err)=> {
      console.log(err)
    })
  }
  toggleButton(){
    if( this.status==true){
      this.buttonstatus="Show Image"
      this.status=false
    }

      else{
        this.buttonstatus="Hide Image"
        this.status=true
      }
  }
}
