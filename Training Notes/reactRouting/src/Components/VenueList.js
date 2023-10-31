import { Component } from 'react';
import './VenueList.css';

    class VenueList extends Component{  
        
        render(){
    return(
        <div className="VenueList">
       <center><b>List of Venues</b>
       <ul>
        <li>DY Patil Stadium, Mumbai</li>
        <li>Chepauk, Chennai</li>
        <li>Chinnasamy Stadium, B'Lore</li>
        <li>Eden Gardens, Kolkata</li>
       </ul>
       </center>
       </div>
    )
}
    }

export default VenueList;