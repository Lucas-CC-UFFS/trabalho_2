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

    public double calculaDiaria(int quant_dias){
        double taxaAquecimento = 12.99;
        double taxaLimpeza = 15.99;
        if (getCodigo()/1000 == 1) {
            return quant_dias * getValorDiaria();
        }else if (getCodigo()/1000 == 2) {
            //System.out.println("Chalé");
            return (quant_dias * getValorDiaria()) + (taxaAquecimento * quant_dias) + taxaLimpeza;
        }else if (getCodigo()/1000 == 3) {
            //System.out.println("Suite Premium");
            return (quant_dias * getValorDiaria()) + (taxaAquecimento * quant_dias) + taxaLimpeza;   
        }else{ 
            //System.out.println("Não encontrado");
            return 0;
        }
    
    }

    // GETTERS
    public int getCodigo() {return this.codigo;}
    public int getCapacidadeMax(){return this.capacidadeMax;}
    public double getValorDiaria(){return this.valorDiaria;}

    // SETTERS
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public void setCapacidadeMax(int capacidade) {this.capacidadeMax = capacidade;}
    public void setValorDiaria(double valor){this.valorDiaria = valor;}

    
}