package POO;

/*
Nome: Diogo Krub de Almeida
Matrícula: 20180395
 */

public class BagagemDeMao extends Bagagem {

    public BagagemDeMao (double umPeso, String umaDescricao, Prioridade umaPrioridade){
        super(umPeso, umaDescricao, umaPrioridade);
    }

    public double getCusto(){
        double valor = 0.0;
        double taxa = 3 * taxaBagagem;
        if (super.getPeso() > 5.00){
            valor = (super.getPeso() - 5.00) * taxa;
        }
        return valor;
    }

    @Override
    public String toString(){
        return super.toString() +
                " - Tipo de Bagagem: de Mão";
    }
}
