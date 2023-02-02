const express=require("express");
const app=express();
const path=require("path");
app.set('view engine','ejs');
app.set('views',path.join(__dirname,'views'));


const comment=[
    {
        id:1,
        user:"Aakrati",
        characteristics:"meri"
    },
    {
        id:2,
        user:"Chhaya",
        characteristics:"best"
    },
    {
        id:0,
        user:"Akansha",
        characteristics:"bekar"
    },
    {
        id:3,
        user:"Ishika",
        characteristics:"busmate"
    }
]


// app.get('/home',(req,res)=>{
//     res.render("index",(comment));
// })

app.get('/comments',(req,res)=>{
    res.render('index',{comment});
})


app.get('/comments/',(req,res)=>{

})
app.listen(5500,()=>{
    console.log("App is listening");
})