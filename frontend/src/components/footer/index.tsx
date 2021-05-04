import ImgDsDark from 'assets/image/ds_dark.svg'

const Footer = () => {
    return (
        <footer className="footer mt-auto py-3 bg-dark">
            <div className="container">
                <p className="text-light">App desenvolvido por <a href="https://github.com/grasbiel" target="_blank" rel="noreferrer">Grasbiel</a></p>
                <p className="text-light"><small><strong>Semana Spring React</strong><br />
      Evento promovido pela escola DevSuperior: <a href="https://instagram.com/grasbiel" target="_blank" rel="noreferrer">@grasbiel</a></small></p>
            </div>
        </footer>
    );
}

export default Footer;