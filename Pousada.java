import java.util.ArrayList;

public class Pousada {
    private ArrayList<Hospedes> hospedes;
    private ArrayList<Acomodacao> acomodacoes;
    private ArrayList<Servicos> servicos;
    private ArrayList<Reserva> reservas;

    public Pousada() {
        hospedes = new ArrayList<>();
        acomodacoes = new ArrayList<>();
        servicos = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public ArrayList<Hospedes> getHospedes() {
        return hospedes;
    }

    public ArrayList<Acomodacao> getAcomodacoes() {
        return acomodacoes;
    }

    public ArrayList<Servicos> getServicos() {
        return servicos;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void adicionarHospede(Hospedes h) {
        hospedes.add(h);
    }

    public void adicionarReserva(Reserva r) {
        reservas.add(r);
    }

    public void adicionarServico(Servicos s) {
        servicos.add(s);
    }

    public void adicionarAcomodacao(Acomodacao a) {
        acomodacoes.add(a);
    }

    public void carregarAcomodacoes(String arquivo){
        //
    }
    
    public void carregarServicos(String arquivo){
        //
    }

    public void salvarHospedes(String arquivo){
        //
    }

    public void salvarReserva(String arquivo){
        //
    }
}