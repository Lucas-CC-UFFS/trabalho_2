public class Academia extends Servicos {
    private double precoAcademia;
    private int qtdDias;

    public void setPrecoAcademia(double precoAcademia){
        this.precoAcademia = precoAcademia;
    }

    public double getPrecoAcademia(){
        return precoAcademia;
    }

    public void setQtdDias(int qtdDias){
        this.qtdDias = qtdDias;
    }

    public int getQtdDias(){
        return qtdDias;
    }

    public Academia(int codigoAcademia, String descricaoAcademia,int qtdDias, double precoAcademia){
        super(codigoAcademia, descricaoAcademia);
        this.precoAcademia = precoAcademia;
        this.qtdDias = qtdDias;
    }

    @Override
    public double calculaValorServico(){
        return precoAcademia * qtdDias;
    }

}