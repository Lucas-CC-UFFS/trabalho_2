package servicos;

public class Refeicao extends Servicos {
    private double precoRefeicao;

    public void setPrecoRefeicao(double precoRefeicao){
        this.precoRefeicao = precoRefeicao;
    }

    public double getPrecoRefeicao(){
        return precoRefeicao;
    }

    public Refeicao(int codigoRefeicao, String descricaoRefeicao, double precoRefeicao){
        super(codigoRefeicao, descricaoRefeicao);
        this.precoRefeicao = precoRefeicao;
    }

    @Override
    public double calculaValorServico(){
        return precoRefeicao;
    }

}
