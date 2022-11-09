import './FindButton.css';

import history from './../history';

function FindButton(){
    return (
        <div>
            <input type="submit" value="Find flight" className="button" onClick={() => history.push('/api/v3/listflight')}/>
        </div>
    );
}
export default FindButton;