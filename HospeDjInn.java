public class HospeDjInn {
    public static void main(String[] args) {
        QuartoPadrao q1 = new QuartoPadrao();
        
        //set
        q1.setCodigo(123);
        q1.setCapacidadeMax(2);
        q1.setValorDiaria(50);
        //get
        q1.getCapacidadeMax();
        q1.getCodigo();
        q1.getValorDiaria();
        //metodos
        q1.infoAcomodacao();
        q1.calculaDiaria(6);
        System.out.println("valor a pagar: "+ q1.calculaDiaria(6));
    }
}
