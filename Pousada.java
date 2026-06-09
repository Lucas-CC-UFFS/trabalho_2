import java.util.ArrayList;
import java.io.*;

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

    //CARREGAR
    public void carregarDados(String arquivo){
        try {
            BufferedReader br = new BufferedReader(new FileReader(arquivo));
            String linha;
            while((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");

                if(dados[0].equals("QUARTO")) {
                    acomodacoes.add(new QuartoPadrao(Integer.parseInt(dados[1]), Integer.parseInt(dados[2]), Double.parseDouble(dados[3])));
                }

                else if(dados[0].equals("CHALE")) {
                    acomodacoes.add(new Chale(Integer.parseInt(dados[1]), Integer.parseInt(dados[2]), Double.parseDouble(dados[3])));
                }

                else if(dados[0].equals("SUITE")) {
                    acomodacoes.add(
                        new SuitePremium(Integer.parseInt(dados[1]), Integer.parseInt(dados[2]), Double.parseDouble(dados[3])));
                }

                else if(dados[0].equals("REFEICAO")) {
                    servicos.add(new Refeicao(Integer.parseInt(dados[1]), dados[2], Double.parseDouble(dados[3])));
                }

                else if(dados[0].equals("PASSEIO")) {
                    servicos.add(new Passeio(Integer.parseInt(dados[1]), dados[2], Double.parseDouble(dados[3]), Integer.parseInt(dados[4])));                    
                }

                else if(dados[0].equals("ACADEMIA")) {
                    servicos.add(new Academia(Integer.parseInt(dados[1]), dados[2], Integer.parseInt(dados[3]), Double.parseDouble(dados[4])));
                }
            }
            br.close();
        } catch(IOException e) {
            System.out.println("Erro ao ler arquivo.");
        }
    
    }
    
    //SALVAR
    public void salvarDados(String arquivo) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(arquivo));
            for(Hospedes h : hospedes) {
                pw.println("Hóspede: " + h.getNome() + "; Idade: " + h.getIdade() + "; CPF:" + h.getCPF());
            }

            for(Reserva r : reservas) {
                pw.println("Código da reserva: " + r.getCodigoDaReserva() + "; CPF Hóspede: " + r.getHospedeResponsavel().getCPF() + "; Código da acomodação: " + r.getAcomodacao().getCodigo() + "; Quantidade de Hóspedes: " + r.getQuantidadeHospedes() + "; Quantidade de dias: " + r.getQuantidadeDias() + "; Preço total: " + r.PrecoTotal());
            }
            pw.close();
            System.out.println("Arquivo salvo.");
        } catch(IOException e) {
            System.out.println("Erro ao salvar arquivo.");
        }
    }


    //EXIBIR
    public void exibirHospedes() {
        for(Hospedes h : hospedes) {
            h.exibirInformacoes();
            System.out.println();
        }
    }

    public void exibirAcomodacoes() {
        for(Acomodacao a : acomodacoes) {
            System.out.println();
            a.exibirInformacoes();
        }
    }

    public void exibirServicos() {
        for(Servicos s : servicos) {
            s.exibirInformacoes();
            System.out.println();
        }
    }

    public void exibirReservas() {
        for(Reserva r : reservas) {
            r.exibirInformacoes();
            System.out.println();
        }
    }

    //BUSCAR
    public Hospedes buscarHospede(String cpf) {
    for(Hospedes h : hospedes) {
        if(h.getCPF().equals(cpf)) {
            return h;
        }
    }
    return null;
    }

    public Acomodacao buscarAcomodacao(int codigo) {
        for(Acomodacao a : acomodacoes) {
            if(a.getCodigo() == codigo) {
                return a;
            }
        }
        return null;
    }

    public Servicos buscarServico(int codigo) {
        for(Servicos s : servicos) {
            if(s.getCodigoServico() == codigo) {
                return s;
            }
        }
        return null;
    }

    public Reserva buscarReserva(int codigo) {
        for(Reserva r : reservas) {
            if(r.getCodigoDaReserva() == codigo) {
                return r;
            }
        }
        return null;
    }
}