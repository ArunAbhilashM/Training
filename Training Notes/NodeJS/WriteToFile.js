var io=require('fs');
var readLine=require('readline-sync')
var line="";
var cnt=0;
while(cnt<5)
{
    console.log('Enter line');
    line=readLine.question();
    // io.writeFile('doc.txt',line,displayStatus);
    line+='\n'
    io.appendFileSync('doc.txt',line);
    
    cnt++;
}
{
    console.log('wrote'+cnt+'to a file')
}
// io.close();