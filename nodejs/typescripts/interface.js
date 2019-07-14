function printDetails(employee) {
    for (var _i = 0, employee_1 = employee; _i < employee_1.length; _i++) {
        var e = employee_1[_i];
        console.log(e.id, e.job, e.name, e.salary);
    }
}
printDetails([{ id: 1001, job: "SE", name: "Ratnesh", salary: 5000 }]);
