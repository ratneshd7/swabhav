class Employeep {
    empName: string;
    empId: number;
    constructor(empName: string, empId: number) {
        this.empName = empName;
        this.empId = empId;
    }
    printdetails = ():void =>{ 
       let formatedString:string = `empName: ${this.empName}
       empId: ${this.empId}`
       console.log(formatedString);

    }
}

let empl = new Employeep("Ratnesh",1)
empl.printdetails()