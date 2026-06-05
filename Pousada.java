import java.util.ArrayList;

public class Pousada {
    private ArrayList<Hospede> hospedes;
    private ArrayList<Acomodacao> acomodacoes;
    private ArrayList<Servicos> servicos;
    private ArrayList<Reserva> reservas;

    public Pousada() {
        hospedes = new ArrayList<>();
        acomodacoes = new ArrayList<>();
        servicos = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public ArrayList<Hospede> getHospedes() {
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

    public void adicionarHospede(Hospede h) {
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

    public void carregarDados(String arquivo){
        try {
            BufferedReader br =
                new BufferedReader(new FileReader(arquivo));
            String linha;
            while((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");

                if(dados[0].equals("QUARTO")) {
                    acomodacoes.add(new QuartoPadrao(Integer.parseInt(dados[1]), Integer.parseInt(dados[2]), Double.parseDouble(dados[3])));
                }

                else if(dados[0].equals("CHALE")) {
                    acomodacoes.add(new Chale(Integer.parseInt(dados[1]), Integer.parseInt(dados[2]), Double.parseDouble(dados[3]), Double.parseDouble(dados[4]), Double.parseDouble(dados[5])));
                }

                else if(dados[0].equals("SUITE")) {
                    acomodacoes.add(
                        new SuiteLuxo(Integer.parseInt(dados[1]), Integer.parseInt(dados[2]), Double.parseDouble(dados[3]), Double.parseDouble(dados[4])));
                }

                else if(dados[0].equals("REFEICAO")) {
                    servicos.add(new Refeicao(Integer.parseInt(dados[1]), dados[2], Double.parseDouble(dados[3])));
                }

                else if(dados[0].equals("PASSEIO")) {
                    servicos.add(new PasseioGrupo(Integer.parseInt(dados[1]), dados[2], Double.parseDouble(dados[3]), Integer.parseInt(dados[4])));                    
                }

                else if(dados[0].equals("LAVANDERIA")) {
                    servicos.add(new Lavanderia(Integer.parseInt(dados[1]), dados[2], Integer.parseInt(dados[3]), Double.parseDouble(dados[4])));
                }
            }
            br.close();

        } catch(IOException e) {
            System.out.println("Erro ao ler arquivo.");
        }
    
    }
    
  
    public void salvarDados(String arquivo) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(arquivo));
            for(Hospede h : hospedes) {
                pw.println(h.getNome() + ";" + h.getIdade() + ";" + h.getCpf());
            }

            for(Reserva r : reservas) {
                pw.println(r.getCodigo() + ";" + r.getHospedeResponsavel().getCpf() + ";" + r.getAcomodacao().getCodigo() + ";" + r.getQuantidadeHospedes() + ";" + r.getQuantidadeDias() + ";" + r.calcularPrecoTotal());
            }
            pw.close();

        } catch(IOException e) {
            System.out.println("Erro ao salvar arquivo.");
        }
    }

}