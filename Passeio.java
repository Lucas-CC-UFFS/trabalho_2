public class Passeio extends Servicos {
    private int codigoPasseio;

    public void setCodigoPasseio(int codigoPasseio){
        this.codigoPasseio = codigoPasseio;
    }

    public int getCodigoPasseio(){
        return codigoPasseio;
    }

    public double calculaValorServico(){
        return + 100;
    }

    public String infoServico(){
        return "Ecoturismo e Aventura: Trilhas ecológicas guiadas, arvorismo, escalada estruturadas no próprio espaço da pousada.";
    }
}
