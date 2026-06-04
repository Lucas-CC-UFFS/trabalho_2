public abstract class Servicos {
    private int codigoServico;
    private String descricaoServico;

    public void setCodigoServico(int codigoServico){
        this.codigoServico = codigoServico;
    }

    public int getCodigoServico(){
        return codigoServico;
    }

    public void setDescricaoServico(String descricaoServico){
        this.descricaoServico = descricaoServico;
    }

    public String getDescricaoServico(){
        return descricaoServico;
    }

    public Servico(int codigoServico, String descricaoServico){
        this.codigoServico = codigoServico;
        this.descricaoServico = descricaoServico;
    }

    public abstract double calculaValorServico();
    public abstract String infoServico();
}