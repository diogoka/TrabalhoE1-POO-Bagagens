package POO;

/*
Nome: Diogo Krub de Almeida
Matrícula: 20180395

Respostas questão 1 do trabalho:

– neste diagrama pode ser observado polimorfismo?
    Sim, observa-se polimorfismo, por exemplo, no método getCusto() que a depender do tipo de Bagagem,
    terá um resultado diferente de acordo com os parâmetros estabelecidos em cada uma das classes de Bagagem (de mão, frágil, normal).
    Tal recurso evita que façamos um getCusto() para cada classe (getCustoBagagemDeMão(),getCustoBagagemFrágil(), etc).

– neste diagrama pode ser observado sobrecarga?
    Não, pois não há um método com o mesmo nome e que possua parâmetros diferentes, como no caso de dois construtores para uma mesma classe.

– neste diagrama pode ser observado sobrescrita?
    Sim, pois o método toString() da classe Bagagem é sobrescrito pelos métodos toString() das classes filhas.

– qual a implicação da classe Bagagem ser abstract?
    Sendo a classe Bagagem abstrata (mãe), essa serve como modelo para as demais sub-classes (filhas).
    Isto é, trata-se de um classe geral, que deve ser especificada nas classes filhas.
    Como é abstrata, não se pode instânciar.

– qual a implicação do método getCusto ser abstract?
    Sendo o método getCusto abstrato, ele exige que as classes filhas, que dependem da classe mãe Bagagem, implementem esse método.


 */

public class Main {

    public static void main(String[] args) {


        //Criando a lista de bagagens.
        ListaDeBagagens ListaBags = new ListaDeBagagens();

        //Criando as bagagens.
        Bagagem b1 = new BagagemDeMao(5.5, "Mochila", Prioridade.NORMAL);
        Bagagem b2 = new BagagemDeMao(6.0, "Pasta", Prioridade.PRIORITARIA);
        Bagagem b3 = new BagagemDeMao(7.0, "Case", Prioridade.URGENTE);
        Bagagem b4 = new BagagemNormal(20.00, "Caixa", Prioridade.NORMAL);
        Bagagem b5 = new BagagemNormal(21.00, "Box", Prioridade.NORMAL);
        Bagagem b6 = new BagagemNormal(21.00, "Box1", Prioridade.URGENTE);
        Bagagem b7 = new BagagemNormal(21.00, "SuitCase", Prioridade.PRIORITARIA);
        Bagagem b8 = new BagagemFragil(1.00, "Bolsa", 50.0, Prioridade.NORMAL);
        Bagagem b9 = new BagagemFragil(2.00, "Caixote", 30.0, Prioridade.PRIORITARIA);
        Bagagem b10 = new BagagemFragil(3.00, "Pers", 45.0, Prioridade.URGENTE);

        //Inserindo as bagagens na lista.
        ListaBags.inserir(b1);
        ListaBags.inserir(b2);
        ListaBags.inserir(b3);
        ListaBags.inserir(b4);
        ListaBags.inserir(b5);
        ListaBags.inserir(b6);
        ListaBags.inserir(b7);
        ListaBags.inserir(b8);
        ListaBags.inserir(b9);
        ListaBags.inserir(b10);


        //Custo de cada tipo de bagagem:
        System.out.printf("R$ %.2f%n", (b1.getCusto()));
        System.out.printf("R$ %.2f%n", (b6.getCusto()));
        System.out.printf("R$ %.2f%n", (b9.getCusto()));

        System.out.println("\n");


        //Listando todas as bagagens da lista:
        ListaBags.listarBagagens();

        System.out.println("\n");

        //Verificando o valor de cada bagagem:
        ListaBags.custoTotal();

        System.out.println("\n");

        //Verificando o valor total da lista:
        ListaBags.getTotal();

        System.out.println("\n");

        //Verificando a quantia de de bagagens do tipo frágil e o valor total do seguro:
        ListaBags.getBagagensFrageisESeguro();


        //Métodos de ordenação:
        //Ordenando pelo peso:
        System.out.println("\nAntes da ordenação por peso");
        ListaBags.listarBagagens();
        System.out.println("\nDepois da ordenação por peso");
        ListaBags.ordenaPorPeso(ListaBags.getBagagens());
        ListaBags.listarBagagens();

        //Ordenando pelo custo:
        System.out.println("\nAntes da ordenação por custo");
        ListaBags.custoTotal();
        System.out.println("\nDepois da ordenação por custo");
        ListaBags.ordenaPorCusto(ListaBags.getBagagens());
        ListaBags.custoTotal();








    }
}
