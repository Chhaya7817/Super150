function first(){
    console.log('First');
}
function second(){
    console.log('second');
}
function third(){
    console.log('third');
    let a=prompt("How are you  ",25);
    // alert(`How old are you ${a} `);
    // alert(a);

    //constructor
        a=Number(a);
        a=a+1;
        a++;
        a=7;
        b=1;
        console.log(a==7&&b<7);
    
}
function ageGroup()
{
    age=prompt("Enetr your age:",NaN);
    // if(age<18) alert("teenager");
    // else alert("Young");
   // age<18?alert("kid"):alert("young");
   let i;
   for(i=0;i<10;i++)
   alert(i);
}
/*
first();
second();
third();
let x=null;
    console.log(x,typeof x);*/
    ageGroup();