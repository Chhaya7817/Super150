//Promises are used to resolve problem 
//Problem either resolve or rejecct
//in fs.readfile callback was firing just after reading the file while 
//in promises we can do this anytime

/*
const p=new Promise((function(resolve,reject){
    setTimeout(()=>{
        let randomNumber=Math.floor(Math.random()*10);
        console.log(randomNumber)
        if(randomNumber%2==0)
        {
            resolve(randomNumber)
        }
        else
        {
            reject();
        }
    },2000)
}))

//value returned from resolve ".then" accepts that value
//".catch() " accepts rejected values
p.then((data)=>{
    console.log(data);
    console.log("resolve");
}).catch(()=>{
    console.log("reject")
})

*/

//-------------------------------------------------------------

const fs=require("fs")
let readFilePromise=fs.promises.readFile("q1.html","utf-8")
readFilePromise.then((data)=>{
    console.log(data)
})
let data=await.fs.promises.readFile("q1.html","utf-8")
console.log(readFilePromise)