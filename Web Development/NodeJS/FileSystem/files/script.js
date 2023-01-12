const fs=require("fs");
const path=require("path");
console.log(path.join(__dirname,'/inp1.html'));
const p1 = path.join(__dirname,'/inp1.txt');
const p2 = path.join(__dirname,'/inp2.txt');
console.log(p1);
let arr1=[];
let arr2=[];
let ans=[];
fs.readFile(p1,(err,data)=>{
    if(err) throw err;
    arr1=data.toString().split('\r\n');
    ans.push(...arr1);
    console.log(ans);
})
fs.readFile(p2,(err,data)=>{
    if(err) throw err;
    arr2=data.toString().split('\r\n');
    ans.push(...arr2);
    console.log(ans);
    ans.sort((a,b)=> (a-b).join('\n'));
})

// fs.writeFile('output.txt',ans.toString(),(err)=>{
//         if(err) throw err;
//         console.log("File ");
// })