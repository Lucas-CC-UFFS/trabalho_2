import java.util.ArrayList;

public class Reserva {
    private int CodigoDaReserva;
    private Hospedes HospedeResponsavel;
    private Acomodacao Acomodacao;
    private int QuantidadeHospedes;
    private int QuantidadeDias;
    private ArrayList<Servicos> ListaDeServicos = new ArrayList<>();

    //METODOS
    public double PrecoTotal(){
        double totalDiarias = this.Acomodacao.calculaDiaria(QuantidadeDias);
        double precoServicos = 0;
        for (int i = 0; i < ListaDeServicos.size(); i++){
            precoServicos += ListaDeServicos.get(i).calculaValorServico();
        }
        return totalDiarias + precoServicos;
    }
    public void infoAcomodacao(){
        System.out.println("Código: " + this.CodigoDaReserva);
        System.out.println("Hospede responsável: " + this.HospedeResponsavel.getNome());
        System.out.println("Acomodação reservada: " + this.Acomodacao.getCodigo());
        System.out.println("Quantidade de hospedes: " + this.QuantidadeHospedes);
        System.out.println("Quantidade de dias: " + this.QuantidadeDias);
        System.out.println("Serviços solicitados: " + this.getListaServicos());
    }


    //GETTERS
    public int getCodigoDaReserva(){
        return this.CodigoDaReserva;
    }
    public Hospedes getHospedeResponsavel(){
        return this.HospedeResponsavel;
    }
    public Acomodacao getAcomodacao(){
        return this.Acomodacao;
    }
    public int getQuantidadeHospedes(){
        return this.QuantidadeHospedes;
    }
    public int getQuantidadeDias(){
        return this.QuantidadeDias;
    }
    public String getListaServicos(){
        String servicos = "";
        for (int i = 0; i < ListaDeServicos.size(); i++){
            servicos += ListaDeServicos.get(i).getDescricaoServico() + "\n";
        }
        return servicos;
    }

    // SETTERS
     public void setCodigoDaReserva(int CodigoDaReserva){
        this.CodigoDaReserva = CodigoDaReserva;
    }
    public void setHospedeResponsavel(Hospedes pessoa){
        this.HospedeResponsavel = pessoa;
    }
    public void setAcomodacao(Acomodacao quarto){
        this.Acomodacao = quarto;
    }
    public void setQuantidadeHospedes(int numeroHospedes){
        this.QuantidadeHospedes = numeroHospedes;
    }
    public void setQuantidadeDias(int quantDias){
        this.QuantidadeDias = quantDias;
    }
    public void setListaServicos(Servicos servico){
        this.ListaDeServicos.add(servico);
    }

}
