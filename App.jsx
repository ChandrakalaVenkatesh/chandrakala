 import React,{useRef} from 'react'
// import {ToastContainer,toast} from 'react-toastify';
// import 'react-toastify/dist/ReactToastify.css';

// const App=()=>{
//     let handleSubmit=()=>{
//         toast.success("Logged in successfully",{position:toast.POSITION.TOP_CENTER})
//     }
//         return(
//             <div>
//                 <ToastContainer/>
//                 <button onClick={handleSubmit}> click for change</button>
//             </div>
//         )
// }
//export default App;
// export default class App extends Component {
//     constructor()
//     {
//         super()
//         this.state={
//             username:""
//         }
//     }
    // componentDidMount()     //non-synthetic event 
    // {
    //     let input=document.querySelector('input')
    //     input.addEventListener('keypress',(e)=>{
    //         this.setState({username:e.target.value})
    //     })
    // }
  //render() {
   // return (
      <>
      {/* <h1>{this.state.username}</h1>   //synthetic  event
      <input type="text" onChange={(e)=>{
        this.setState({username:e.target.value})
      }} /> */}
      </>

const App=()=>
{
    let h1Ref=useRef()
    let handleChange=()=>
    {
      h1Ref.current.style.color="green"
    }
      return(
        <>
        <h1 ref={h1Ref}>APPPP</h1>
        <button onClick={handleChange}>change</button>
        </>
      )
    }

export default App