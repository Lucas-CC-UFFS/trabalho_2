package acomodacoes;

public class Chale extends Acomodacao{
    //CONSTRUTOR
    public Chale(int codigo, int capacidade, double diaria){
        setCodigo(codigo);
        setCapacidadeMax(capacidade);
        setValorDiaria(diaria);
    }

    //METODOS
//   @Override    
//    public double calculaDiaria(int quant_dias){
//        double taxaAquecimento = 12.99;
//        double taxaLimpeza = 15.99;
//        return (quant_dias * getValorDiaria()) + (taxaAquecimento * quant_dias) + taxaLimpeza;
//    }

    // SETTERS
    @Override
    public void setCodigo(int codigo){
        String quarto = "2" + codigo;
        int numCodigo = Integer.parseInt(quarto);
        super.setCodigo(numCodigo);
    }
}
