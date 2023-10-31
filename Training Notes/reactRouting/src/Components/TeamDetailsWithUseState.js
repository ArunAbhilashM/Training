import {useState} from "react";
    function TeamDetailsWithUseState() {
    const [teamName,setTeamName] =useState("Delhi Capitals");
    const [teamCaptain,setCaptainName] = useState("David Warner");
    const [baseLocation,setbaseLocation] = useState("New Delhi");

    function validate(){
      let  vstatus=false;
        if(teamName === "")
        window.alert("Name Cannot be Blank");
    else
           vstatus=true;
    if(teamCaptain === "")
    window.alert("captain name cannot be blank")
else
        vstatus=false;
        return;
    }
    {
        return(<div>
            <center>
                <form action="javascript:window.alert('All ok')" onSubmit= "return validate()">
                    <label>Team Name</label><input type="text" onChange={e=>{setTeamName(e.target.value)}} defaultValue={teamName}/><br></br>
                    <label>Team Captain</label><input type="text" onChange={e=>{setCaptainName(e.target.value)}} defaultValue={teamCaptain}/><br></br>
                    <label>Base Location</label><select size="1" name="base_location" onChange={e=>{setbaseLocation(e.target.value)}} defaultValue={baseLocation}>
                        <option value="MI">Mumbai</option>
                        <option value="CSK">Chennai Super Kings</option>
                        <option value="RCB">Royal Challengers Bangalore</option>
                        <option value="KKR">Kolkata Knight Riders</option>
                        <option value="RR">Rajastan Royals</option>
                        <option value="SRH">Sun Risers Hyderabad</option>
                    </select><br></br>
                    <input type="submit" value="save"/>
                </form>
                <b>Team Name</b>{teamName}<br></br>
                <b>Team Captian</b>{teamCaptain}<br></br>
                <b>baseLocation</b>{baseLocation}<br></br>
            </center>
        </div>)
    }
}
export default TeamDetailsWithUseState