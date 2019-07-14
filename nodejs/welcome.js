console.log("welcome to js")
console.log(this)
console.log(global)
f1();
function f1(){
    console.log("inside f1");

}
var name="hh";
console.log(this.name)
var f2=function(){
    console.log("inside f2")
}
f2();
setTimeout(function(){
    console.log("inside timeout")
},3000)

// setInterval(function(){
//     console.log("inside interval")
// },3000)