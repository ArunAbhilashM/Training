import { Component } from 'react';
import './TeamsList.css';
class TeamsList extends Component{
    componentDidMount()
    {
        console.log("TeamsList component mounted.");
    }
    componentDidUpdate()
    {
        console.log("TeamsList component updated.");
    }
    componentWillUnmount()
    {
        console.log("TeamsList component unmounted.");
    }
render()
{
    return(
        <div className='TeamsList'>
        <center>
            <b>
                List of Teams in IPL 2023
            </b><br></br>
            <ol>
                <li>CSK</li>
                <li>MI</li>
                <li>RCB</li>
                <li>KKR</li>
                <li>DC</li>
                <li>LSG</li>
            </ol>
        </center>
        </div>
    )
}}
export default TeamsList;