import java.util.Scanner;

public class Refeicao extends Servicos {
    private int codigoRefeicao[] = {1, 2, 3}; //1: café; 2: almoço; 3: janta

    public void setCodigoRefeicao(int codigoRefeicao){
        this.codigoPasseio[0] = codigoRefeicao;
    }

    public int getCodigoRefeicao(){
        return codigoRefeicao;
    }

    public Refeicao(){
        Scanner sc = new Scanner();
    }

    public double calculaValorServico(){
        int valor = 0;
        if(codigoRefeicao == 1){
            valor += 30;
        }
        if(codigoRefeicao == 2){

        }
        return valor;
    }

    public String infoServico(){
        return "";
    }
}
