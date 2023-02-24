let div = document.getElementById('hellooo');
let div1 = document.getElementById('helloo1');
let div2 = document.getElementById('hellooo2');
let div3 = document.getElementById('helloo3');
let x=document.querySelector(".x");
let img1=document.querySelector(".img1");
let img2=document.querySelector(".img2");
let img3=document.querySelector(".img3");
let btn=document.getElementById("xyz");
let btn1=document.getElementById("xyz1");
let btn2=document.getElementById("xyz2");

btn.addEventListener("click",()=>
{
    let a=document.getElementById("username").value
    let b=document.getElementById("total")
    b.style.backgroundColor= "gray"
    b.style.borderRadius="2px"
    b.innerText="travel fare is " +a*15
})
btn1.addEventListener("click",()=>
{
    let c=document.getElementById("username1").value
    let d=document.getElementById("total1")
    d.style.backgroundColor= "gray"
    d.style.borderRadius="2px"
    d.innerText="travel fare is " +c*50
})
btn2.addEventListener("click",()=>
{
    let d=document.getElementById("username2").value
    let s=document.getElementById("total2")
    s.style.backgroundColor= "gray"
    s.style.borderRadius="2px"
    s.innerText="travel fare is " +d*30
})

x.style.marginBottom="500px";
div.style.border = "3px solid red";
div.style.display ="flex";
div.style.height="700px";
div.style.alignItems="center";
div.style.justifyContent="space-evenly";

h1.style.marginBottom="600px";

div1.style.border ="1px solid purple";
div1.style.height ="400px";
div1.style.width ="250px";
div1.style.margin="40px";




div2.style.border ="2px solid brown";
div2.style.height ="400px";
div2.style.width ="250px";
div2.style.margin="40px";

div3.style.border ="2px solid orange";
div3.style.height ="400px";
div3.style.width ="250px";
div3.style.margin="40px";

