"use strict";
// Como podemos rodar isso em um arquivo .ts sem causar erros? 
// let employee = {};
// employee.code = 10;
// employee.name = "John";
//esse infere o tipo já na declaração, se mudar o que está sendo declarado, muda o tipo
let employee = {
    code: 10,
    name: 'John'
};
//ou
//esse é mais seguro, porque não pode trocar o tipo
let employee2 = {
    code: 10,
    name: 'John'
};
let employee3 = {
    code: 200,
    name: 'John'
};
//ou
const employeeObj = {};
employeeObj.code = 10;
employeeObj.name = 'John';
//ou
const employeeObj2 = {
    code: 10,
    name: 'John'
};
