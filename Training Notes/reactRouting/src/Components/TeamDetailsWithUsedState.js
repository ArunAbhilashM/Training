import {usedState} from "react";
class TeamDetailsWithUseState() {
    const [teamName,setTeamName] = usestate("Delhi Capitals");
    const [teamCaptain,setCaptainName] = usestate("David Warner");
    const [baseLocation,setbaseLocation] = usestate("New Delhi");
    {
        return(<div>
            <center>
                <form>
                    <label>Team Name</label><input type="text" defaultValue={this.state.teamName}/><br></br>
                    <label>Team Captain</label><input type="text" defaultValue={this.state.teamCaptain}/><br></br>
                    <label>Base Location</label><select size="1" name="base_location" defaultValue={this.state.baseLocation}>
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
export default TeamDetailsWithUseState