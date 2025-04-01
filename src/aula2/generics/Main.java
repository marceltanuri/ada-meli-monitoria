package aula2.generics;

public class Main {

    public static void main(String[] args) {

        ListaComGenerics<Integer> listaComGenerics = new ListaComGenerics();
        Integer itemListaComGenerics = 123;
        listaComGenerics.adicionar(itemListaComGenerics, 0);
        Object itemDeRetornoListaComGenerics = listaComGenerics.obter(0);
        System.out.println(itemDeRetornoListaComGenerics);

        Lista lista = new Lista();
        Integer item = 123;
        lista.adicionar(item, 0);

        String itemDeRetorno = (String) lista.obter(0);

        System.out.println(itemDeRetorno);


    }

    // Generics

    /*
    - Type safety: Tipagem segura
    - Java é uma linguagem intencionalmente "Fortemente" Tipada
    - tipos: int, long, double, char, boolean

     */

    public static void sayHello(String nome) {

    }

    public static <T> void listarArray(T[] array) {
        for (T o : array) {
            System.out.println(o);
        }
    }


}
