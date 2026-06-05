public abstract class Servicos implements HospeDjInn {
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

    public Servicos(int codigoServico, String descricaoServico){
        this.codigoServico = codigoServico;
        this.descricaoServico = descricaoServico;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);    
    }

    public abstract double calculaValorServico();
}