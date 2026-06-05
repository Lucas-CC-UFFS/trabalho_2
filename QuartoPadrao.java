public class QuartoPadrao extends Acomodacao{
    //CONSTUTOR
    public QuartoPadrao(){
        setCapacidadeMax(2);
        setValorDiaria(150);
    }

    //METODOS
    @Override
    public void infoAcomodacao(){
        System.out.println("Código: " + getCodigo());
        System.out.println("Capacidade Máxima: " + getCapacidadeMax());
        System.out.println("Valor da Diária: " + getValorDiaria());
    }
    @Override    
    public double calculaDiaria(int quant_dias){
        return quant_dias * getValorDiaria();
    }

    @Override
    public String exibirInformacoes(){
        return "ok";
    }


    // SETTERS
    @Override
    public void setCodigo(int codigo){
        String quarto = "3" + codigo;
        int numCodigo = Integer.parseInt(quarto);
        super.setCodigo(numCodigo);
    }
}

