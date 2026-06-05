public class Chale extends Acomodacao{
    //CONSTRUTOR
    public Chale(){
        setCapacidadeMax(5);
        setValorDiaria(300);
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
        double taxaAquecimento = 12.99;
        double taxaLimpeza = 15.99;
        return (quant_dias * getValorDiaria()) + (taxaAquecimento * quant_dias) + taxaLimpeza;
    }

    @Override
    public String exibirInformacoes(){
        return "ok";
    }


    // SETTERS
    @Override
    public void setCodigo(int codigo){
        String quarto = "2" + codigo;
        int numCodigo = Integer.parseInt(quarto);
        super.setCodigo(numCodigo);
    }
}
