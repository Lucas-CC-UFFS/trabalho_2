public abstract class Acomodacao {
    private int codigo;
    private int capacidadeMax;
    private double valorDiaria;
    
    //METODOS
    public abstract void infoAcomodacao();    
    public abstract double calculaDiaria(int quant_dias);

    // GETTERS
    public abstract int getCodigo();
    public abstract int getCapacidadeMax();
    public abstract double getValorDiaria();

    // SETTERS
    public abstract void setCodigo(int codigo);
    public abstract void setCapacidadeMax(int capacidade);
    public abstract void setValorDiaria(double valor);
}
