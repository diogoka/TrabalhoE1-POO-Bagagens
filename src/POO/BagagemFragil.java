package POO;

/*
Nome: Diogo Krub de Almeida
Matrícula: 20180395
 */

public class BagagemFragil extends Bagagem {

    private double ValorSeguro;

    public BagagemFragil (double umPeso, String umaDescricao, double Seguro, Prioridade umaPrioridade){
        super(umPeso, umaDescricao, umaPrioridade);
        ValorSeguro = Seguro;
    }

    public double getValorSeguro(){
        return ValorSeguro;
    }

    public void setValorSeguro(double valor){
        ValorSeguro = valor;
    }

    public double getCusto(){
        double valor = 0;
        if(getPrioridade() == Prioridade.PRIORITARIA){
            valor = taxaBagagem * 5;
        }
        else if(getPrioridade() == Prioridade.URGENTE){
            valor = taxaBagagem * 10;
        }
        return valor + getValorSeguro();
    }

    @Override
    public String toString(){
        return super.toString() +
                "- tipo de Bagagem: Frágil " +
                "- Valor do Seguro: " + getValorSeguro();
    }


}
