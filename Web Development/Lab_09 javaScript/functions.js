function abc(a,b)
{

    let num=12.374843;
    console.log(num.toString(5)); //base 5
    console.log(num.toFixed(3));
    console.log(parseInt("23324dc"));
    console.log(parseFloat('12.34em7'))
    let str='This is my desktop No No';
    console.log(str);
    console.log(str.charAt(2));
    console.log(str.at(-5));

    let substr='is';
    console.log(str.indexOf(substr));
    console.log(str.indexOf(substr,3));
    console.log(str.slice(2,-1));
    console.log(str.slice(-5,-1));
    console.log(str.substring(1,3));
    console.log(str.substring(3,1));
    console.log(str.substr(1,3));
    return 0;
}
abc(5,4);