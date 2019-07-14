"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var customer_1 = require("./customer");
var c = new customer_1.Customer(1, "Ratnesh", "Dubey");
console.log(c.FullName);
var address = new customer_1.Address(400066, "Mumbai");
console.log(address.address);
