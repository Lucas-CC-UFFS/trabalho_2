public class Chale extends Acomodacao{
    //CONSTRUTOR
    public Chale(int codigo, int capacidade, double diaria){
        setCodigo(codigo);
        setCapacidadeMax(capacidade);
        setValorDiaria(diaria);
    }

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
    @Override    
    public double calculaDiaria(int quant_dias){
        double taxaAquecimento = 12.99;
        double taxaLimpeza = 15.99;
        return (quant_dias * getValorDiaria()) + (taxaAquecimento * quant_dias) + taxaLimpeza;
    }

    // SETTERS
    @Override
    public void setCodigo(int codigo){
        String quarto = "2" + codigo;
        int numCodigo = Integer.parseInt(quarto);
        super.setCodigo(numCodigo);
    }
}
