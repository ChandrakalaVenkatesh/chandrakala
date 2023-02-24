let promise=new Promise((resolve,reject)=>
{
    let iswaterfetched=true;
    if (iswaterfetched==true)
    {
        //resolve("yes got it")
       // resolve(document.body.style.backgroundColor="purple")
        resolve(document.body.style.backgroundColor="red")
    }
    else{
       // reject("no failed")
       reject(document.body.style.backgroundColor="blue")
    }
})
promise.then((x)=> console.log(x)).catch((y)=> console.log(y))