package POO;

/*
Nome: Diogo Krub de Almeida
Matrícula: 20180395
 */

public class BagagemNormal extends Bagagem {

    public BagagemNormal (double umPeso, String umaDescricao, Prioridade umaPrioridade){
        super(umPeso, umaDescricao, umaPrioridade);
    }

    public double getCusto() {
        double contador = 0.0;
        if (super.getPeso() > 20.00){
            contador = (super.getPeso() - 20.00) * taxaBagagem;
        }
        else if(getPrioridade() == Prioridade.PRIORITARIA){
            contador = contador + (taxaBagagem * 5);
        }
        else if (getPrioridade() == Prioridade.URGENTE){
            contador = contador + (taxaBagagem * 10);
        }
        return contador;

    }

    @Override
    public String toString(){
        return super.toString() +
                " - Tipo de Bagagem: Normal ";
    }

}
