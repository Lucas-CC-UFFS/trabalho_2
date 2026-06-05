import java.util.Scanner;

public class Menu {

    //implementar funções
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pousada pousada = new Pousada();

        int opcao = 999;

        while(opcao != 14){
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
                    //cadastrarHospede(sc, pousada);
                    break;
                case 2:
                    //exibirHospede(sc, pousada);
                    break;
                case 3:
                    //exibirTodosHospedes(pousada);
                    break;
                case 4:
                    //exibirAcomodacao(sc, pousada);
                    break;
                case 5:
                    //exibirTodasAcomodacoes(pousada);
                    break;
                case 6:
                    //exibirServico(sc, pousada);
                    break;
                case 7:
                    //exibirTodosServicos(pousada);
                    break;
                case 8:
                    System.out.println("Cadastrar reserva");
                    break;
                case 9:
                    System.out.println("Adicionar serviço à reserva");
                    break;
                case 10:
                    System.out.println("Exibir reserva");
                    break;
                case 11:
                    System.out.println("Exibir todas as reservas");
                    break;
                case 12:
                    System.out.println("Exibir extrato");
                    break;
                case 13:
                    System.out.println("Salvar arquivo");
                    break;
                case 14:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } 
        sc.close();
    }
}
