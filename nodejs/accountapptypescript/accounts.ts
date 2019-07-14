export class Account {
    account_no:Number;
    account_holder_name:string
    balance:Number
    constructor(account_no:Number, accont_holder_name:string,balance:Number){
            this.account_holder_name=accont_holder_name;
            this.account_no=account_no
            this.balance=balance
    }
    public getAccountDetail=():void =>{
        let accont_holder_detail:string=`Account Number is:${this.account_no}
                                         Account Holder Name:${this.account_holder_name}
                                         Balance is:${this.balance}`

        console.log(accont_holder_detail)
    }
}