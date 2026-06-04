public class Passeio extends Servicos {
    private double precoPasseio;
    private int qtdPessoas;

    public void setPrecoPasseio(double precoPasseio){
        this.precoPasseio = precoPasseio;
    }

    public double getPrecoPasseio(){
        return precoPasseio;
    }

    public void setQtdPessoas(int qtdPessoas){
        this.qtdPessoas = qtdPessoas;
    }

    public int getQtdPessoas(){
        return qtdPessoas;
    }

    public Passeio(int codigoPasseio, String descricaoPasseio, double precoPasseio, int qtdPessoas){
        super(codigoPasseio, descricaoPasseio);
        this.precoPasseio = precoPasseio;
        this.qtdPessoas = qtdPessoas;
    }

    @Override
    public double calculaValorServico(){
        return precoPasseio * qtdPessoas;
    }

    @Override
    public String exibirInformacoes(){
        return "Ecoturismo e Aventura: Trilhas ecológicas guiadas, arvorismo, escalada estruturadas no próprio espaço da pousada. Por apenas R$" + precoPasseio + " por pessoa!";
    }
}
