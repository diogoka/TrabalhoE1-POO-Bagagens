package POO;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

/*
Nome: Diogo Krub de Almeida
Matrícula: 20180395
 */

public class ListaDeBagagens implements Comparator<Bagagem> {

    private ArrayList<Bagagem> Bagagens;

    public ListaDeBagagens () {
        Bagagens = new ArrayList<>();

    }

    public ArrayList<Bagagem> getBagagens(){
        return Bagagens;
    }

    public void inserir(Bagagem umaBagagem) {
        Bagagens.add(umaBagagem);
    }

    public void listarBagagens() {
        System.out.println("Lista de Bagagens");
        for (Bagagem Bags : Bagagens) {
            System.out.println(Bags.toString());
        }
    }

    public void custoTotal(){
        System.out.println("Custo de cada Bagagem");
        for (Bagagem Bags : Bagagens) {
            System.out.print(Bags.getDescricao());
            System.out.printf(" - R$ %.2f%n", (Bags.getCusto()));
        }
    }

    public void getTotal(){
        System.out.println("Custo total das Bagagens");
        double valor = 0;
        for (Bagagem Bags : Bagagens) {
            valor = valor + Bags.getCusto();
        }
        System.out.printf("R$ %.2f%n", (valor));
    }

    public void getBagagensFrageisESeguro(){
        System.out.println("Quantidade de bagagens Frágeis e o valor total do Seguro: ");
        int quantidade = 0;
        double valorSegurado = 0.0;
        for (Bagagem Bags : Bagagens) {
            if(Bags instanceof BagagemFragil){
                quantidade = quantidade + 1;
                valorSegurado = valorSegurado + (int) Bags.getValorSeguro();
            }
        }
        System.out.print(quantidade + " - " );
        System.out.printf("R$ %.2f%n", (valorSegurado));
    }

    @Override
    public int compare(Bagagem o1, Bagagem o2) {
        return Double.compare(o1.getPeso(),o2.getPeso());

    }

    public static Comparator<Bagagem> getComparadorPeso(){
        return new Comparator<Bagagem>(){
            @Override
            public int compare(Bagagem a, Bagagem b){
                return Double.compare(a.getPeso(), b.getPeso());
            }
        };
    }

    public static Comparator<Bagagem> getComparadorCusto(){
        return new Comparator<Bagagem>(){
            @Override
            public int compare(Bagagem b1, Bagagem b2){
                return Double.compare(b1.getCusto(), b2.getCusto());
            }
        };
    }

    public static void ordenaPorCusto(ArrayList<Bagagem> B){
        Collections.sort(B, new Comparator<Bagagem>(){
            @Override
            public int compare(Bagagem BA, Bagagem BC){
                return Double.compare(BA.getCusto(), BC.getCusto());
            }
        });
    }

    public static void ordenaPorPeso(ArrayList<Bagagem> B){
        Collections.sort(B, new Comparator<Bagagem>(){
            @Override
            public int compare(Bagagem BA, Bagagem BC){
                return Double.compare(BA.getPeso(), BC.getPeso());
            }
        });
    }

}

