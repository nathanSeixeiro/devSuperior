import logo from '../../assets/img/logo.svg'
import './style.css'

function Header(){
    return(
        <>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="DS Meta" />
                <h1>DSMeta</h1>
                <p>
                    desesnvolvido por
                    <a href="www.linkedin.com/in/nathan-seixeiro"> Nathan Seixeiro</a>
                </p>
            </div>
        </>
    )
}

export default Header