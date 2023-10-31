import {Component} from "react";

class TeamDetails extends Component{
    teamName="Delhi Capitals";
    baseLocation="New Delhi"
    teamCaptain="YTA"
    render()
    {
        return(<div>
            <center>
                <form>
                    <label>Team Name</label><input type="text" value={this.teamName}/><br></br>
                    <label>Team Captain</label><input type="text" value={this.teamCaptain}/><br></br>
                    <label>Base Location</label><select size="1" name="base_location" value={this.baseLocation}>
                        <option value="MI">Mumbai</option>
                        <option value="CSK">Chennai Super Kings</option>
                        <option value="RCB">Royal Challengers Bangalore</option>
                        <option value="KKR">Kolkata Knight Riders</option>
                        <option value="RR">Rajastan Royals</option>
                        <option value="SRH">Sun Risers Hyderabad</option>
                    </select><br></br>
                </form>
            </center>
        </div>)
    }
}
export default TeamDetails