// for reading user-inputs from console
readinput=require('readline-sync')
arrFun=require('./arrayFunctions')
console.log('Enter the name')
fullName=readinput.question();
console.log("Enter Your Age")
age=Number(readinput.question())
console.log("Enter the country name")
country=readinput.question();
console.log('capital of'+country+'is'+arrFun.getCapCity(country));

if(age>=18 && age<=45)
    console.log("U r eligible for grautity")
    else
    console.log("Apply for graudity")