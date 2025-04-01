package aula2.generics;

public class Lista {

    Object[] itens = new Object[100];

    void adicionar(Object o, int indice){
        itens[indice] = o;
    }

    Object obter(int indice){
        return itens[indice];
    }

}
