export class Customer{
    constructor(private id:Number,private firstname:String,private lastname:String){

    }
    get Id(){
        return this.id;
    }
    get FullName(){
        return this.firstname+" "+this.lastname;
    }

}
export class Address{
    constructor(private Zipcode:Number,private Area:String){

    }
    get address(){
        return this.Area+" "+ this.Zipcode
    }

}