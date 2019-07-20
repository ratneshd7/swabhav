import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable()
export class ProductServce{

  productdatalst;
  jsonUrl='assets/product.json';
constructor(private http:HttpClient){

}
getProductlst():Promise<any>
  {
      return new Promise((resolve,reject)=>
      {
          this.http.get(this.jsonUrl)
          .toPromise()
          .then((response)=>{
              //console.log("success "+response);
              this.productdatalst=response
              resolve(response);

          })
          .catch((err)=>{
              reject(err)
          })
      })

  }

  getProduct(code){
    var productObj;
    for(let i = 0; i < this.productdatalst.length; i++){
      if (this.productdatalst[i].productCode == code) {
        productObj = this.productdatalst[i];
      }

    }
    return productObj;
  }
}
