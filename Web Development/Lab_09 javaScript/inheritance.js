let person={
    firstName:'john',
    age:24
}
// p1  inherited properties of person
//method 2
let p1={
    lastName:'doe',
    __proto__:person
}
//method 1
// let p1=Object.create(person); 
// console.log(p1.age);

let p2={
    isAdult:true,
    __proto__:p1
}
console.log(p2.firstName);
console.log(p1.firstName);
let n=1;