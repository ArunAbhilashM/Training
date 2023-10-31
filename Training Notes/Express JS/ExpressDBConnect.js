var my_sql = require('mysql');//Initialize the environment for express JS app
//var mysqlcon=my_sql(); // Initialize mysql by creating the connector

var exp = require('express'); //Import expressJS into the application
var bparse = require('body-parser')
var expen = exp(); //Initialize the environment for Express JS app
expen.use(bparse.urlencoded({ extended: false }));
var vistorCount = 0;

// var file=require('readline-sync');
var exp = require('express');

var my_sql = require('mysql');

var proc = require('process');

var bparser = require('body-parser');

var expenv = exp();

var path = require('path');

// var mysqlconn=my_sql();



expenv.use(bparser.urlencoded({ extended: false }));



var visitorCount = 0;
var mysql_conn = my_sql.createConnection({ host: 'localhost', port: '3306', user: 'root', password: 'Addicto@3012', database: 'world' });

console.log("Connected to database....");

mysql_conn.connect();

console.log(mysql_conn.statistics());

console.log(mysql_conn.state);

function processResults(error, results) {
    //console.log(results);
    for (i in results) {
        console.log(JSON.stringify(results[i]));
    }
}



expenv.post('/signin', authenticate);




function authenticate(request, response) {

    console.log("Authenticating!!!");

    mysql_conn.query('SELECT * from employee', processResults)





    /*var uname = request.body.UserId;

    var pwd = request.body.password;

    var authenticated = false;



    for (var i in users) {

        if (uname == users[i].username && pwd == users[i].password) {

            authenticated = true;

            break;

        }

    }



    if (authenticated) {

        response.send("<b>  welcome....You are Authenticated!</b>");

    } else {

        response.send("<b>veliya jaao!! invalid username or password</b><br><a href='/login'>Retry logging in</a>");

    }*/

}

expenv.post("/Adduser",addNewUser);
function addNewUser(request,response){
    var uid=request.body.userID;
    var upwd=request.body.password;
    var uemail=request.body.email;
    console.log(uid+"\t\t"+upwd+"\t\t"+uemail);
    var ins="insert into employee values('"+uid+"','"+upwd+"','"+uemail+"')";
    console.log('Executing'+ins);
    mysql_conn.query(ins);
    console.log("inserted the record in database");
}
expenv.post("/Deleteuser",DeleteUser);
function DeleteUser(request,response){
    var uid=request.body.userID;
   var del= "delete from employee WHERE userID='"+uid +"'";
   console.log('Deleting'+del);
   mysql_conn.query(del);
   console.log("deleted the record in database");
}

expenv.post("/Updateuser",UpdateUser);
function UpdateUser(request,response){
    var uid=request.body.userID;
    var upwd=request.body.password;
    var upt="update users set password='"+upwd+"' where userID='"+uid+"'"
    console.log('Deleting'+upt);
   mysql_conn.query(upt);
   console.log("updated the record in database");
}
expenv.use((req, res, next) => {

    res.header("Access-Control-Allow-Origin",

               "http://localhost:4100");

    res.header("Access-Control-Allow-Headers",

               "Origin, X-Requested-With, Content-Type, Accept");

    next();

});




expenv.listen(proc.argv[2], "localhost");

console.log("Started the port number" + proc.argv[2]);
