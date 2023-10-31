import logo from './logo.svg';
import './App.css';
import VenueList from './Components/VenueList';
import TeamsList from './Components/TeamsList';
import TeamDetails from './Components/TeamDetails';
import { BrowserRouter as Router,Routes,Link,Route} from 'react-router-dom';
function App() {
  return (
    <Router>
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <h1>Welcome to React</h1>
      </header>
      <Link to="/VenueList">Venues</Link>
      <Link to="/TeamsList">Teams</Link>
      <Link to="/TeamDetails">Details of Team</Link>
    <Routes>
      <Route exact path="/VenueList" element={<VenueList/>}></Route>
      <Route exact path="/TeamsList" element={<TeamsList/>}></Route>
      <Route exact path="/TeamDetails" element={<TeamDetails/>}></Route>
    </Routes>
    </div>
    </Router>
  );
}

export default App;
