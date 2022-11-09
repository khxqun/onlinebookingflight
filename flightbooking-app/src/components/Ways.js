import './Ways.css';

function Ways(){
    const ways=["Retur", "One-way"];

    return(
      <div className="out">
            {ways.map(result =>(
            <div className="inner">
              <input type="radio" className="radio"  value={result} />
              <p className="text">{result}</p>
            </div>
          ))}
      </div>
    );
}

export default Ways;