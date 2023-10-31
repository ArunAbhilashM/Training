//treatment of functions in js

function test(){
    console.log("In test");
}
add=function(n1,n2){
    console.log("adding n1 and n2")
    return n1+n2;
}
console.log(test);//prints the value of the test
console.log(test()); //function call 
var multiply=new Function("p1,p2","console.log(p1*p2);return p1*p2;");
console.log("Multiply:"+multiply);
multiply(100,200);
v=add(10,5);
console.log("V:" + v);
console.log(add);