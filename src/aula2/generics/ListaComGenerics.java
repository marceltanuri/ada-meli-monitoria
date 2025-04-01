package aula2.generics;

public class ListaComGenerics<T> {

    @SuppressWarnings("unchecked")
    T[] itens = (T[]) new Object[100];

    void adicionar(T o, int indice){
        itens[indice] = o;
    }

    T obter(int indice){
        return itens[indice];
    }

}
