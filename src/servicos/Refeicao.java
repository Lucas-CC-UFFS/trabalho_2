package servicos;

public class Refeicao extends Servicos {
    private double precoRefeicao;
    private int qtdPessoas;

    public void setPrecoRefeicao(double precoRefeicao){
        this.precoRefeicao = precoRefeicao;
    }

    public double getPrecoRefeicao(){
        return precoRefeicao;
    }

    public void setQtdPessoas(int qtdPessoas){
        this.qtdPessoas = qtdPessoas;
    }

    public int getQtdPessoas(){
        return qtdPessoas;
    }

    public Refeicao(int codigoRefeicao, String descricaoRefeicao, double precoRefeicao){
        super(codigoRefeicao, descricaoRefeicao);
        this.precoRefeicao = precoRefeicao;
    }

    @Override
    public double calculaValorServico(){
        return precoRefeicao * qtdPessoas;
    }

}
