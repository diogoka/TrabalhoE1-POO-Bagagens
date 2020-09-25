package POO;

/*
Nome: Diogo Krub de Almeida
Matrícula: 20180395
 */

public abstract class Bagagem {

    private double peso;
    private String descricao;
    private Prioridade prioridade;
    public static double taxaBagagem = 5.20;

    public Bagagem (double umPeso, String umaDescricao, Prioridade umaPrioridade){
        peso = umPeso;
        descricao = umaDescricao;
        prioridade = umaPrioridade;
    }

    public double getPeso(){
        return peso;
    }

    public String getDescricao(){
        return descricao;
    }

    public Prioridade getPrioridade(){
        return prioridade;
    }

    public double getValorSeguro(){
        return 0.0;
    }

    public abstract double getCusto();

    public String toString(){
        return "Descrição da Bagagem: " + getDescricao() + "\t" +
                " - Peso em kg: " + getPeso() + "\t" +
                " - Prioridade: " + getPrioridade() + "\t";
    }

}
