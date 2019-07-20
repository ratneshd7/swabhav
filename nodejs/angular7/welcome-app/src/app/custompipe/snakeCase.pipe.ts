import { Pipe, PipeTransform } from "@angular/core";

@Pipe({
  name:'snakeCase'
})

export class SnakeCase implements PipeTransform {
  filterdata:String=" ";
  splitvalue:String[];
  transform(value: any):String {
    console.log(value)
    this.splitvalue = value.toString().split(" ");
    let inputs:String="";
    let newinput:String="";
      for(let i=0;i<this.splitvalue.length;i++){
        if(i==0){

          inputs=this.splitvalue[i]
        }
        else if(i==1){
          newinput=this.splitvalue[i][0].toUpperCase()+this.splitvalue[i].slice(1);
          inputs=inputs+"_"+newinput;
        }
        else
        inputs=inputs+"_"+this.splitvalue[i];
      }
      console.log(inputs)
    return inputs;
  }

}
