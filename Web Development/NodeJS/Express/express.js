const express=require('express');
const app=express();
// app.listen();
port=5500;
console.log("I love u");
app.listen(port,()=>{
    console.log(`Server is running at ${port}`);
})