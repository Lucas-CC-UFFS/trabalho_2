import java.util.Scanner;
import javax.crypto.AEADBadTagException;
import java.util.InputMismatchException;

public class HospeDjInn {

public static void cadastrarHospede(Scanner sc, Pousada p){
        Hospedes h = criaHospede(sc, p);
        System.out.println("Deseja cadastrar reserva? (s/n).");
        String op = sc.nextLine(); 
        if("s".equals(op)){
            cadastrarReserva(sc, p, h);
        }else return;
    }

    public static void exibirHospede(Scanner sc, Pousada p){
        System.out.println("CPF: ");
        String cpf = sc.nextLine();

        Hospedes h = p.buscarHospede(cpf);
        if(h != null){
            h.exibirInformacoes();
        } else {
            System.out.println("Hóspede não econtrado.");
        }
    }

    public static void exibirTodosHospedes(Pousada p){
        p.exibirHospedes();
    }

    public static void exibirAcomodacao(Scanner sc, Pousada p){
        System.out.println("Código da Acomodação:\n1- Quarto Padrão\n2- Chalé\n3- Suite Premium");
        int codigo = 0;
        boolean validacao = false;
        
        while (!validacao) {    
        try {
            codigo = sc.nextInt();
            validacao = true;
        }catch(InputMismatchException e){
            System.out.println("Erro: Opção inválida.\nPor favor, digite apenas o número da respectiva acomodação"+
                                "\n1- Quarto Padrão\n2- Chalé\n3- Suite Premium");
            sc.nextLine();
            }
        }
        int codigoBusca = 0;
        if (codigo == 1) {
            codigoBusca = 1301;
        }else if (codigo == 2) {
            codigoBusca = 2201;
        }else if (codigo == 3) {
            codigoBusca = 3101;
        }else{
            System.out.println("Opção inválida");
        }
        Acomodacao a = p.buscarAcomodacao(codigoBusca);
        if(a != null){
            a.exibirInformacoes();
        } else {
            System.out.println("Acomodação não econtrada.");
        }
    }

    public static void exibirTodasAcomodacoes(Pousada p){
        p.exibirAcomodacoes();
    }

    public static void exibirServico(Scanner sc, Pousada p){
        System.out.println("Código do Serviço: \n1- Refeição\n2- Passeio\n3- Academia");
        int codigo = sc.nextInt();
        sc.nextLine();
        Servicos s = p.buscarServico(codigo);
        if(s != null){
            s.exibirInformacoes();
        } else {
            System.out.println("Serviço não econtrado.");
        }
    }

    public static void exibirTodosServicos(Pousada p){
        p.exibirServicos();
    }

    public static void exibirReserva(Scanner sc, Pousada p){
        System.out.println("Código da Reserva: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        Reserva r = p.buscarReserva(codigo);
        if(r != null){
            r.exibirInformacoes();
        } else {
            System.out.println("Reserva não econtrada.");
        }
    }

    public static void exibirTodasReservas(Pousada p){
        p.exibirReservas();
    }

    public static void exibirExtrato(Scanner sc, Pousada p){
        System.out.println("Código da Reserva: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        Reserva r = p.buscarReserva(codigo);
        if(r != null){
            r.exibirInformacoes();
            System.out.println("Valor total: R$" + r.PrecoTotal());
        } else {
            System.out.println("Reserva não econtrada.");
        }
    }

    public static void salvarArquivo(Pousada p){
        p.salvarDados("dados.txt");
    }

public static void cadastrarReserva(Scanner sc, Pousada p){
        System.out.println("Código da Reserva: ");
        int codigo = sc.nextInt();
        if(p.buscarReserva(codigo) != null){
            System.out.println("Código já utilizado!");
            return;
        }

        System.out.println("CPF do hóspede: ");
        sc.nextLine();
        String cpf = sc.nextLine();
        
        Hospedes h = p.buscarHospede(cpf);
        
        if(h == null){
            System.out.println("Hóspede não encontrado.");
            System.out.println("Deseja cadastrar-se? (s/n).");
            String op = sc.nextLine(); 
            if("s".equals(op)){
                h = criaHospede(sc, p); 
            } else return;
        }

        System.out.println("Código da Acomodação: ");
        int codigoA = sc.nextInt();
        Acomodacao a = p.buscarAcomodacao(codigoA);
        if(a == null){
            System.out.println("Acomodação não encontrada.");
            return;
        }

        System.out.println("Quantidade de hóspedes: ");
        int qtdHospedes = sc.nextInt();
        if(qtdHospedes > a.getCapacidadeMax()){
            System.out.println("Capacidade excedida.");
            return;
        }

        System.out.println("Quantidade de dias: ");
        int qtdDias = sc.nextInt();
        sc.nextLine();
        Reserva r = new Reserva(codigo, h, a, qtdHospedes, qtdDias);
        p.adicionarReserva(r);

        System.out.println("Deseja adicionar serviços? (s/n).");
        String op = sc.nextLine(); 
        if("s".equals(op)){
            adicionarServicoReserva(sc, p);
        }else return;
    }

    public static void cadastrarReserva(Scanner sc, Pousada p, Hospedes h) {
        System.out.println("Código da Reserva: ");
        int codigo = sc.nextInt();
        if(p.buscarReserva(codigo) != null){
            System.out.println("Código já utilizado!");
            return;
        }

        System.out.println("Código da Acomodação: ");
        int codigoA = sc.nextInt();
        Acomodacao a = p.buscarAcomodacao(codigoA);
        if(a == null){
            System.out.println("Acomodação não econtrada.");
            return;
        }

        System.out.println("Quantidade de hóspedes: ");
        int qtdHospedes = sc.nextInt();
        if(qtdHospedes > a.getCapacidadeMax()){
            System.out.println("Capacidade excedida.");
            return;
        }

        System.out.println("Quantidade de dias: ");
        int qtdDias = sc.nextInt();
        sc.nextLine();
        Reserva r = new Reserva(codigo, h, a, qtdHospedes, qtdDias);
        p.adicionarReserva(r);

        
        System.out.println("Deseja adicionar serviços? (s/n).");
        String op = sc.nextLine(); 
        if("s".equals(op)){
            adicionarServicoReserva(sc, p);
        }else return;

    }

    public static void adicionarServicoReserva(Scanner sc, Pousada p){
        System.out.println("Código da Reserva: ");
        int codigo = sc.nextInt();
        Reserva r = p.buscarReserva(codigo);
        if(r == null){
            System.out.println("Reserva não econtrada.");
            return;
        }

        System.out.println("Digite o código do serviço desejado:\n1- Café da manhã\n2- Ecoturismo\n3- Academia completa");
        String op = sc.nextLine();
            while (op!= "n") {
        System.out.println("Código do Serviço: ");
        int codigoS = sc.nextInt();
        sc.nextLine();
        Servicos s = p.buscarServico(codigoS);
        if(s == null){
            System.out.println("Serviço não econtrado.");
            return;
        }
        if (codigoS == 1) {
            System.out.println("Serviço: Café da manhã\nCadastrado com sucesso!");
        }else if (codigoS == 2) {
            System.out.println("Serviço: Passeio ecoturismo\nCadastrado com sucesso!");
        }else{
            System.out.println("Serviço: Academia completa\nCadastrado com sucesso!");
        }
        System.out.println("Deseja cadastrar outro serviço? (s/n)");
        op = sc.nextLine();
        if ("n".equals(op)) {
            r.setListaServicos(s);
            return;
        }
        r.setListaServicos(s);
        }
    }

    public static Hospedes criaHospede(Scanner sc, Pousada p){
        System.out.println("CPF: ");
        String cpf = sc.nextLine();
        Hospedes existente = p.buscarHospede(cpf);
        if(existente != null){
            System.out.println("\nHóspede já cadastrado!");
            existente.exibirInformacoes();
            return existente;
        }

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        Hospedes h = new Hospedes(nome, idade, cpf);
        p.adicionarHospede(h);
        return h;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pousada pousada = new Pousada();
        pousada.carregarDados("dadosHospeDjInn.txt");
        pousada.carregarDados("dados.txt");
        int opcao = -1;

        while(opcao != 14){
            System.out.println("-------------------MENU------------------");
            System.out.println("1 - Cadastrar hóspede");
            System.out.println("2 - Exibir dados de um hóspede");
            System.out.println("3 - Exibir dados de todos os hóspedes");
            System.out.println("4 - Exibir dados de uma acomodação");
            System.out.println("5 - Exibir dados de todas as acomodações");
            System.out.println("6 - Exibir dados de um serviço");
            System.out.println("7 - Exibir dados de todos os serviços");
            System.out.println("8 - Cadastrar uma reserva");
            System.out.println("9 - Adicionar serviço a uma reserva");
            System.out.println("10 - Exibir dados de uma reserva");
            System.out.println("11 - Exibir dados de todas as reservas");
            System.out.println("12 - Exibir extrato de uma reserva");
            System.out.println("13 - Salvar dados em arquivo");
            System.out.println("14 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    cadastrarHospede(sc, pousada);
                    break;
                case 2:
                    exibirHospede(sc, pousada);
                    break;
                case 3:
                    exibirTodosHospedes(pousada);
                    break;
                case 4:
                    exibirAcomodacao(sc, pousada);
                    break;
                case 5:
                    exibirTodasAcomodacoes(pousada);
                    break;
                case 6:
                    exibirServico(sc, pousada);
                    break;
                case 7:
                    exibirTodosServicos(pousada);
                    break;
                case 8:
                    cadastrarReserva(sc, pousada);
                    break;
                case 9:
                    adicionarServicoReserva(sc, pousada);
                    break;
                case 10:
                    exibirReserva(sc, pousada);
                    break;
                case 11:
                    exibirTodasReservas(pousada);
                    break;
                case 12:
                    exibirExtrato(sc, pousada);
                    break;
                case 13:
                    salvarArquivo(pousada);
                    break;
                case 14:
                    pousada.salvarDados("dados.txt");
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } 
        sc.close();
    }
}
