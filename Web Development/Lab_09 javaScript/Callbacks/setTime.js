/*
setTimeout(()=>
{
    console.log("This call Callback function as parameter")
},2000);

*/
/*

//call back comes in empty stack
//here stack is never empty so loop will go infinite
let a=true;
setTimeout(function()
{
    a=false;
},300);
while(a)
{
    console.log("Hello bro");
}
*/

let a=true;
setInterval(function(){
    if(a)
    {
        console.log("Hello")
    }
},1000)

setTimeout(function(){
    a=false; 
},10000)