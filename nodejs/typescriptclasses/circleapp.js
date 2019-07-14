var Circle = /** @class */ (function () {
    function Circle() {
    }
    Circle.calculateArea = function (radius) {
        return this.pi * radius * radius;
    };
    Circle.prototype.calculateCircumference = function (radius) {
        return 2 * Circle.pi * radius;
    };
    Circle.pi = 3.14;
    return Circle;
}());
var area1 = Circle.calculateArea(5);
console.log("" + area1);
var circleObj = new Circle();
;
var area = circleObj.calculateCircumference(5);
console.log("" + area);
