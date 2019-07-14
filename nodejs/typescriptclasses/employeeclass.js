var Employeep = /** @class */ (function () {
    function Employeep(empName, empId) {
        var _this = this;
        this.printdetails = function () {
            var formatedString = "empName: " + _this.empName + "\n       empId: " + _this.empId;
            console.log(formatedString);
        };
        this.empName = empName;
        this.empId = empId;
    }
    return Employeep;
}());
var empl = new Employeep("Ratnesh", 1);
empl.printdetails();
