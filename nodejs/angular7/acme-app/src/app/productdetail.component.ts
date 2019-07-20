import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductServce } from './productservce.component';

@Component({
  templateUrl:'./productdetail.component.html'
})

export class ProductDetailcomponent{
    productData;
    result;
  constructor(private route: ActivatedRoute, servce:ProductServce ,private router:Router) {
   // this.productData  = servce.productdatalst
   this.result = servce. getProduct(this.route.snapshot.params.code);
  // or


      // for(let i = 0; i < this.productData.length; i++){
      //   if (this.productData[i].productName == this.route.snapshot.params.name) {
      //     this.result = this.productData[i];
      //   }

      // }
  }
  back(){
    this.router.navigateByUrl('/productlst')
  }
 }
