let input=document.querySelector("input")


input.addEventListener("keypress",()=>
{
    let random=Math.floor(Math.random()*100000).toString(16)
    document.body.style.backgroundColor=`#${random}`       
    console.log(random);
})