// console.log(document);
// console.log(document.domain);
// console.log(document.URL);
// console.log(document.body);
// console.log(document.links);
// console.log(document.all[5]);
// console.log(document.all);
// console.log(document.all[5].innerText);

//Querying document
let header=document.getElementById('header-title');
header.style.backgroundColor='red';
// header.innerText("stdcjhvcmhcb nbdhfcgvh");
// header.innerHTML="<h3>Hello my sister</h3>";


var heading=document.querySelectorAll('.title');
// console.log(heading);
for(let i=0;i<heading.length;i++)
{
    heading[i].style.backgroundColor='purple';
    heading[i].style.color='white';
}


 