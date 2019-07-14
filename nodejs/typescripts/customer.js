"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Customer = /** @class */ (function () {
    function Customer(id, firstname, lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    Object.defineProperty(Customer.prototype, "Id", {
        get: function () {
            return this.id;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Customer.prototype, "FullName", {
        get: function () {
            return this.firstname + " " + this.lastname;
        },
        enumerable: true,
        configurable: true
    });
    return Customer;
}());
exports.Customer = Customer;
var Address = /** @class */ (function () {
    function Address(Zipcode, Area) {
        this.Zipcode = Zipcode;
        this.Area = Area;
    }
    Object.defineProperty(Address.prototype, "address", {
        get: function () {
            return this.Area + " " + this.Zipcode;
        },
        enumerable: true,
        configurable: true
    });
    return Address;
}());
exports.Address = Address;
