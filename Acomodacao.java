public abstract class Acomodacao {
    private int codigo;
    private int capacidadeMax;
    private double valorDiaria;
    
    //METODOS
    public abstract void infoAcomodacao();    
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
