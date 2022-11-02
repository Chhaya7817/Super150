let str="This is web Class";

let ans="";
/*
let rev="";
for(let i=0;i<str.length;i++)
{
    rev=rev+str[i];
    if(str[i]==" " ||i==str.length-1)
    {
        if(i==str.length-1)
            ans+=" ";
        for(j=rev.length-1;j>=0;j--)
        {
            ans+=rev[j];
        }
        rev="";
    }
}*/
let arr=str.split(' ');
str=console.log(str);

arr.forEach(element => {

    for(let i=element.length-1;i>=0;i--)
        ans+=element[i];
    ans+=" ";
});
console.log(ans);
