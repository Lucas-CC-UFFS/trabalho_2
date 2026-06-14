package acomodacoes;
import interfaces.*;

public abstract class Acomodacao implements Informacoes{
    //ATRIBUTOS
    private int codigo; // 1 - Suite Premium | 2 - Chalé | 3 - Quarto Padrão
    private int capacidadeMax;
    private double valorDiaria;

    //METODOS
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