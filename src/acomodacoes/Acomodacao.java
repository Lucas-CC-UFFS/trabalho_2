package acomodacoes;
import interfaces.*;

public abstract class Acomodacao implements Informacoes{
    //ATRIBUTOS
    private int codigo; // 1 - Quarto Padrão | 2 - Chalé | 3 - Suite Premium
    private int capacidadeMax;
    private double valorDiaria;

    //METODOS
    @Override
    public void exibirInformacoes(){
        if (getCodigo()/1000 == 1) {
            System.out.println("Quarto Padrão");
        }else if (getCodigo()/1000 == 2) {
            System.out.println("Chalé");
        }else{
            System.out.println("Suite Premium");
        }
        System.out.println("Código da acomodação: " + getCodigo());
        System.out.println("Capacidade Máxima: " + getCapacidadeMax());
        System.out.println("Valor da Diária: " + getValorDiaria());
    }

    public abstract double calculaDiaria(int quant_dias);

    // GETTERS
    public int getCodigo() {return this.codigo;}
    public int getCapacidadeMax(){return this.capacidadeMax;}
    public double getValorDiaria(){return this.valorDiaria;}

    // SETTERS
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public void setCapacidadeMax(int capacidade) {this.capacidadeMax = capacidade;}
    public void setValorDiaria(double valor){this.valorDiaria = valor;}

    
}