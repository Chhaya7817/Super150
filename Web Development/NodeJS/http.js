/* Http request*/
const http =require("http");
const server = http.createServer((req,res)=>
{
    console.log(res);
    if(req.url === "/home")
    {
        // res.write("Hollow World");
        res.statusCode("200");
        res.write(
        `<h1> Welocome Co My Worldo </h1>`);
        res.end();
    }
    else if(res.url==="/contact")
    {
        res.write("Welcome to contact page");
        res.end();
    }
    else
    {
        res.write("u ate at wrong page");
        res.end();
    }
})

server.listen(5000);
console.log("server is running");