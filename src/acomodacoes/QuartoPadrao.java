package acomodacoes;

public class QuartoPadrao extends Acomodacao{
    //CONSTUTOR
    public QuartoPadrao(int codigo, int capacidade, double diaria){
        setCodigo(codigo);
        setCapacidadeMax(capacidade);
        setValorDiaria(diaria);
    }

    //METODOS

//    @Override    
//    public double calculaDiaria(int quant_dias){
//        return quant_dias * getValorDiaria();
//    }

    // SETTERS
    @Override
    public void setCodigo(int codigo){
        String quarto = "1" + codigo;
        int numCodigo = Integer.parseInt(quarto);
        super.setCodigo(numCodigo);
    }
}

