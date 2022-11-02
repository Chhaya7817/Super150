let str='fgcdhg cedgfcgbjyhygfc ufyckvs cbehg b evsdjc z';
let obj={};
for(let i of str)
{
    if(!obj[i])
    {
        obj[i]=1;
    }
    else{
        obj[i]=obj[i]+1;
    }
}
delete(obj[" "]);

console.log(obj);
