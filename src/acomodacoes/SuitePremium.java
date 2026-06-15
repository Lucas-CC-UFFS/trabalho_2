package acomodacoes;

public class SuitePremium extends Acomodacao{
    //CONSTRUTOR
    public SuitePremium(int codigo, int capacidade, double diaria){
        setCodigo(codigo);
        setCapacidadeMax(capacidade);
        setValorDiaria(diaria);
    }
    //METODOS
//    @Override    
//    public double calculaDiaria(int quant_dias){
//        double taxaAquecimento = 12.99;
//        double taxaLimpeza = 15.99;
//        return (quant_dias * getValorDiaria()) + (taxaAquecimento * quant_dias) + taxaLimpeza;
//    }

    // SETTERS
    @Override
    public void setCodigo(int codigo){
        String quarto = "3" + codigo;
        int numCodigo = Integer.parseInt(quarto);
        super.setCodigo(numCodigo);
    }
}
