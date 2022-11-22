// console.log(itemList.childNodes);
// console.log(itemList.children);


//-----------------events--------------------------
// var button= document.querySelector('#btn');
// button.addEventListener('click',addEvent);
// function addEvent(){
//     console.log('1');
//     var title=document.getElementsByClassName('main-title');
//     console.log(title);
//     title.innerText='Changed';
// }

// function addEvent(e)
// {
//     console.log(e);
//     console.log(e.target);
//     // console.log(e.value);
//     console.log(e.clientX); //return value from browser  in x direction
//     console.log(e.clientY); //return value from browser  in  direction
//     console.log(e.offsetX);
//     console.log(e.ctrlKey);// to check wether u are presssing ctrl or not if yes return true


// }

//---------------------
//to stop default behaiviour of button we use preventDefault
var button= document.querySelector('#btn');
var form =document.getElementById('addForm');

// form.addEventListener('submit',runEvent);
// form.addEventListener('submit',runEvent);
// form.addEventListener('click',runEvent)
form.addEventListener('dbclick',runEvent);
form.addEventListener('mousedown',runEvent);
form.addEventListener('mouseup',runEvent);
function runEvent(e)
{
    e.preventDefault();
    console.log('1');
    console.log("Event type: "+e.type);
}

