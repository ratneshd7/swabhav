"use strict";
exports.__esModule = true;
var Account = /** @class */ (function () {
    function Account(account_no, accont_holder_name, balance) {
        var _this = this;
        this.getAccountDetail = function () {
            var accont_holder_detail = "Account Number is:" + _this.account_no + "\n                                         Account Holder Name:" + _this.account_holder_name + "\n                                         Balance is:" + _this.balance;
            console.log(accont_holder_detail);
        };
        this.account_holder_name = accont_holder_name;
        this.account_no = account_no;
        this.balance = balance;
    }
    return Account;
}());
exports.Account = Account;
