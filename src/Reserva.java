import interfaces.*;
import java.util.ArrayList;
import acomodacoes.*;
import servicos.*;

public class Reserva implements Informacoes{
    private int codigoDaReserva;
    private Hospedes hospedeResponsavel;
    private Acomodacao acomodacao;
    private int quantidadeHospedes;
    private int quantidadeDias;
    private ArrayList<Servicos> listaDeServicos = new ArrayList<>();
    
    //CONSTRUTOR
    public Reserva(int codigoDaReserva, Hospedes hospedeResposavel, Acomodacao acomodacao, int quantidadeHospedes, int quantidadeDias){
        this.codigoDaReserva = codigoDaReserva;
        this.hospedeResponsavel =hospedeResposavel;
        this.acomodacao = acomodacao;
        this.quantidadeHospedes = quantidadeHospedes;
        this.quantidadeDias = quantidadeDias;
    }

    //METODOS
    public double precoTotal(){
        double totalDiarias = this.acomodacao.calculaDiaria(quantidadeDias);
        double precoServicos = 0;
        for (int i = 0; i < listaDeServicos.size(); i++){
            precoServicos += listaDeServicos.get(i).calculaValorServico();
        }
        return totalDiarias + precoServicos;
    }
    public void exibirInformacoes(){
        System.out.println("Código: " + this.codigoDaReserva);
        System.out.println("Hospede responsável: " + this.hospedeResponsavel.getNome());
        System.out.println("Acomodação reservada: " + this.acomodacao.getCodigo());
        System.out.println("Quantidade de hospedes: " + this.quantidadeHospedes);
        System.out.println("Quantidade de dias: " + this.quantidadeDias);
        System.out.println("Serviços solicitados: " + this.getListaServicos());
    }

    //GETTERS
    public int getCodigoDaReserva(){
        return this.codigoDaReserva;
    }
    public Hospedes getHospedeResponsavel(){
        return this.hospedeResponsavel;
    }
    public Acomodacao getAcomodacao(){
        return this.acomodacao;
    }
    public int getQuantidadeHospedes(){
        return this.quantidadeHospedes;
    }
    public int getQuantidadeDias(){
        return this.quantidadeDias;
    }
    public String getListaServicos(){
        String servicos = "";
        for (int i = 0; i < listaDeServicos.size(); i++){
            servicos += listaDeServicos.get(i).getDescricaoServico() + "\n";
        }
        return servicos;
    }

    // SETTERS
     public void setCodigoDaReserva(int CodigoDaReserva){
        this.codigoDaReserva = CodigoDaReserva;
    }
    public void setHospedeResponsavel(Hospedes pessoa){
        this.hospedeResponsavel = pessoa;
    }
    public void setAcomodacao(Acomodacao quarto){
        this.acomodacao = quarto;
    }
    public void setQuantidadeHospedes(int numeroHospedes){
        this.quantidadeHospedes = numeroHospedes;
    }
    public void setQuantidadeDias(int quantDias){
        this.quantidadeDias = quantDias;
    }
    public void setListaServicos(Servicos servico){
        this.listaDeServicos.add(servico);
    }

}
