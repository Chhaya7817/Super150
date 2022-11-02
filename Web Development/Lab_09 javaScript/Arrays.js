// let arr=new Array(5)
// console.log(arr);
/*
let arr=[1,2,3,"MAn","Women",
true,function(){
    alert("HelloWorld")}];

    console.log(arr[6]());
    console.log(arr.pop());
    console.log(arr.push(45));

    console.log(arr.shift(10));//deleting that element
    console.log(arr.unshift('23',89));

    console.log(arr);
console.log(arr.length);
let arr2=arr;
console.log([2]==[2]);
console.log(arr2==arr);
*/

let arr=[
    [1,2,3],
    [4,5,6],
    [7,8,9]
]
let sum=0;
let flaten=new Array(arr.length*arr[0].length);
let k=0;
for(let i=0;i<arr.length;i++)
{
    for(let j=0;j<arr[0].length;j++)
    {
        // flaten[k++]=arr[i][j];
        flaten.push(arr[i][j]);
        sum+=arr[i][j];
        console.log(i+" "+j);
}
}
console.log(sum);
console.log(flaten);

flaten.splice(1,5,"Apple");//adding and deleting (range) element at specific index
console.log(flaten);

