    
abstract class Person {
    name:string;
   constructor(name) {
       this.name=name
   }
   display(): void{
       console.log(this.name);
   }
   abstract getPerson(name):Person
}

class Employee extends Person {

   id:number;
   constructor(name:string,id:number){
       super(name);
       this.id=id;
   }
   getPerson():Person{
       return new  Employee(this.name,1)
   }

}
let emp = new Employee("Ratnesh",1);
 emp.display();