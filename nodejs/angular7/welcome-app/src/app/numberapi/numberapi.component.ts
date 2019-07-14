import { Component } from "@angular/core";
import { ApiHttp } from './apihttp.component';

@Component({
  selector:'app-root',
  templateUrl:'./numberapi.component.html'
})
export class NumberApi{
  apiresult=[];
  value:number;
constructor(private service:ApiHttp){

}
getService(){
  this.service.gettext(this.value) .then((r) => {
console.log(r)
    this.apiresult.push(r);
})
.catch((err) => {
  console.log(err.error.text)
});
}

}
