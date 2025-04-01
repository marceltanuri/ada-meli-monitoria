package aula1.interfaces;

public interface Calculadora {

    // Polimorfismo

                           // POO:
               // POO1                 // POO2
    // Abstração, Encapsulamento, Herança e Polimorfismo

    // 1- Interface (recomendado) use sempre que possivel
    // 2- Classes abstratas
    // 3- Classes concreta

    // Polimorfismo: Multiplas formas: multiplo comportamente

    // Desvantagens de Herança

    // Classe ou um objeto:
    // // Atributos: estado (state)

    // // Métodos: comportamento (behaviour)

    // um mesmo tipo (Classe) pode ser comportar de diferentes formas, um mesmo metodo pode ter diferentes implementações

    // String exibirNome(){System.out.print(this.nome + " " + this.sobrenome)}
    //
    // Usuario usuario1 = new Usuario();
    // Usuario usuario2 = new Usuario();

    //usuario1.exibirNome()
    //usuario2.exibirNome()

    int calcularSoma(int b, int a);

    double calcularSoma(double b, double a);






}
