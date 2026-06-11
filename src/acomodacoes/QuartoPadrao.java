package acomodacoes;

public class QuartoPadrao extends Acomodacao{
    //CONSTUTOR
    public QuartoPadrao(int codigo, int capacidade, double diaria){
        setCodigo(codigo);
        setCapacidadeMax(capacidade);
        setValorDiaria(diaria);
    }

    //METODOS
    @Override
    public void exibirInformacoes(){
        if (getCodigo()/100 == 1) {
            System.out.println("Quarto Padrão");
        }else if (getCodigo()/100 == 2) {
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
        return quant_dias * getValorDiaria();
    }

    // SETTERS
    @Override
    public void setCodigo(int codigo){
        String quarto = "1" + codigo;
        int numCodigo = Integer.parseInt(quarto);
        super.setCodigo(numCodigo);
    }
}

