import React,{Component} from "react"
import JSON from "./user.json"
import Users from './Users.jsx';
class App extends Component{




constructor()
{
    super()
    this.state={
        json:JSON
    }
}

render()
{
    return(
        <div>
            <Users data={this.state.json}/>
        </div>
    )
}
}

export default App;