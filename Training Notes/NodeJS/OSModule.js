var osmod=require('os');
console.log(osmod.arch())
console.log("Free Memory in bytes :"+ osmod.freemem());
var info=osmod.cpus();
for(cnt=0;cnt<info.length;cnt++)
{
    console.log("CPU #"+cnt+1);
    console.log(info[cnt].model)
    console.log(info[cnt].speed)
    console.log(info[cnt].times)
}
console.log("Machine Name"+ osmod.hostname())
console.log("Machine Architecture:"+osmod.machine())
console.log("Platform:"+osmod.platform())
console.log("Version and release"+osmod.release())
console.log("Total Memory"+osmod.totalmem())
user=osmod.userInfo();
console.log("User"+user);