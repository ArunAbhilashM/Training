readinput=require('readline-sync')
function validate(empName,empAge){
     if(empName.length<5)
     console.log("Length of the name must be minimum of 5 characters");
    if(empAge<18)
    console.log("Not eligible for Job under labour laws")
}
function callValidate()
{
console.log('Enter Your Name')
empName=readinput.question()
console.log('Enter Your Age')
empAge=Number(readinput.question())
validate(empName,empAge)
}
callValidate(validate);  