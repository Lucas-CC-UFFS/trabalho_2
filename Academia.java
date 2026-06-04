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

    public Academia(int codigoAcademia, String descricaoAcademia, double precoAcademia, int qtdDias){
        super(codigoAcademia, descricaoAcademia);
        this.precoAcademia = precoAcademia;
        this.qtdDias = qtdDias;
    }

    @Override
    public double calculaValorServico(){
        return precoAcademia * qtdDias;
    }

    @Override
    public String infoServico(){
        return "Academia completa e ambiente amplo para se manter ativo por R$" + precoAcademia + " por dia!";
    }
}