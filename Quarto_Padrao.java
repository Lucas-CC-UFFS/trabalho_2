public class Quarto_Padrao extends Acomodacao{

    private int codigo;
    private int capacidadeMax;
    private double valorDiaria;

    //METODOS
    public void infoAcomodacao(){
        System.out.println("Código: " + this.codigo);
        System.out.println("Capacidade Máxima: " + this.capacidadeMax);
        System.out.println("Valor da Diária: " + this.valorDiaria);
    }    
    public double calculaDiaria(int quant_dias){
        return quant_dias * valorDiaria;
    }

    // GETTERS
    public int getCodigo(){
        return this.codigo;
    }
    public int getCapacidadeMax(){
        return capacidadeMax;
    }
    public double getValorDiaria(){
        return valorDiaria;
    }

    // SETTERS
    public void setCodigo(int codigo){
        String quarto = "3" + codigo;
        int numCodigo = Integer.parseInt(quarto);
        this.codigo = numCodigo;
    }
    public void setCapacidadeMax(int capacidade){
        this.capacidadeMax = capacidade; 
    }
    public void setValorDiaria(double valor){
        this.valorDiaria = valor;
    }
}

