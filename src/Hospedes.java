import interfaces.*;

public class Hospedes implements Informacoes{
    private String Nome;
    private int Idade;
    private String CPF;
    //CONSTRUTOR
    public Hospedes(String nome, int idade, String cpf){
        this.Nome = nome;
        this.Idade = idade;
        this.CPF = cpf;
    }
    //GETTERS
    public String getNome() {return this.Nome;}
    public int getIdade () {return this.Idade;}
    public String getCPF() {return this.CPF;}

    //SETTERS
    public void setNome(String nome) {this.Nome = nome;}
    public void setIdade(int idade) {this.Idade = idade;} 
    public void setCPF(String cpf) {this.CPF = cpf;}

    @Override
    public void exibirInformacoes(){
        System.out.println("Nome: " + this.Nome);
        System.out.println("Idade: " + this.Idade);
        System.out.println("CPF: " + this.CPF);
    }
}
