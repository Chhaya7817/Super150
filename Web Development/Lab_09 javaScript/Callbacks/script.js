const fs=require("fs");  //to read file fs module
// function callback(err,data)
// {
//     if(!err)
//     {
//         console.log(data);
//     }
// }

// fs.readFile('one.html','utf-8',callback);
// fs.readFile('q.html',callback);
/*
//Asynchronous
for(let i=1;i<=3;i++)
{
    function callback(err,data)
    {
        if(!err)
        {
            console.log(data);
        }
    }
    fs.readFile('q'+i+'.html','utf-8',callback);
}*/

//Sysnchronous
let count=0;
function cb(err,data)
{
    // console.log(data);
    count+=1;
    if(count<=3)
    {
        if(!err)
        {
            console.log(data);
        }
        else{
            console.log(err);
        }
    }
    fs.readFile("q"+(count+1)+".html","utf-8",cb);
}

fs.readFile("q1.html","utf-8",cb)