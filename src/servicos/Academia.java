package servicos;

public class Academia extends Servicos {
    private double precoAcademia;
    private int qtdPessoas;

    public void setPrecoAcademia(double precoAcademia){
        this.precoAcademia = precoAcademia;
    }

    public double getPrecoAcademia(){
        return precoAcademia;
    }

    public void setQtdPessoas(int qtdPessoas){
        this.qtdPessoas = qtdPessoas;
    }

    public int getQtdPessoas(){
        return qtdPessoas;
    }

    public Academia(int codigoAcademia, String descricaoAcademia,int qtdPessoas, double precoAcademia){
        super(codigoAcademia, descricaoAcademia);
        this.precoAcademia = precoAcademia;
        this.qtdPessoas = qtdPessoas;
    }

    @Override
    public double calculaValorServico(){
        return precoAcademia * qtdPessoas;
    }

}