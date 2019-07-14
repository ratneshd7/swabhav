class Circle {
    static pi = 3.14;

    static calculateArea(radius:number) {
        return this.pi * radius * radius;
    }

    calculateCircumference(radius:number):number { 
        return 2 * Circle.pi * radius;
    }
}

var area1= Circle.calculateArea(5); 
console.log(`${area1}`)
let circleObj = new Circle()
var area= circleObj.calculateCircumference(5)
console.log(`${area}`)