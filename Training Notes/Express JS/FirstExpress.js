 var exp=require('express'); //Import expressJS into the application
var expen=exp(); //Initialize the environment for Express JS app
var vistorCount=0;
var path=require('path');
expen.get('/',welcome) //when the client sends the GET request with the URL ending with the '/' then the welcome function is called. Welcome() is sending a dyanmic HTML page as response.
function welcome(request,response){ //request-represent the request that the client is sending to the server. 
var str="<html><body>";
 str += "<b>First Website in expressJS</b><br>";
 vistorCount++;
 str+="<b>You are a Visitor</b>" + vistorCount;
 var today=new Date();
 str+="<br><b>Today Date is: </b>" + today +"<br>"
 str+="<br><a href='/login'>click to login</a>"
 str+="</body></html>";
 response.send(str); //sends the response back to the client
}
expen.listen(8080,"localhost"); //wait for incoming request (GET,POST,PUT,UPDATE,TRACE) etc. at port 8080 on the local machine.
expen.get('/login',loginForm)
function loginForm(request,response){
    console.log("Displaying Login Form");
    response.sendFile(path.join(__dirname,'./loginForm.html'));
}
expen.get('/Signin',authethicate)
function authethicate(request,response){
    var userName=request.query.userID;
    var userPwd=request.query.password;
    var validID="Arun";
    var validPwd='1234';
    if(userName==validID&&userPwd==validPwd)
        response.send("<b>Welcome</b>");
    else
        response.send("<b>Invalid username&password.</b><br><br><a href='/login'>Retry</a>");
    
    console.log("Authethicatng....");
    response.send('<b>You are autheticated...!</b>');
}