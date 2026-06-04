public class Hospedes implements HospeDjInn{
    private String Nome;
    private int Idade;
    private String CPF;

    //GETTERS
    public String getNome() {return this.Nome;}
    public int getIdade () {return this.Idade;}
    public String getCPF() {return this.CPF;}

    //SETTERS
    public void setNome(String nome) {this.Nome = nome;}
    public void setIdade(int idade) {this.Idade = idade;} 
    public void setCPF(String cpf) {this.CPF = cpf;}

    @Override
    public String exibirInformacoes(){
        //
    }
}
