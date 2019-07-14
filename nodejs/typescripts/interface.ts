interface IEmployee{
    id:Number,
    salary:Number,
    job:String,
    name:String;
}
function printDetails(employee:IEmployee[]){
 for (let e of employee) {
    console.log(e.id,e.job,e.name,e.salary);
 }
}
printDetails([{id:1001,job:"SE",name:"Ratnesh",salary:5000}])