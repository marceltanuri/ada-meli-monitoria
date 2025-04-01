package aula1.interfaces;

public class Main {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Marcel", "Tanuri");
        ImpressoraDeUsuario impressoraDeUsuario = new ImpressoraDeUsuarioPadraoPTBR();
        impressoraDeUsuario.exibeNomeCompleto(usuario1);

        Usuario usuario2 = new Usuario("Edinei", "Cruz");
        impressoraDeUsuario = new ImpressoraDeUsuarioPadraoENUS();
        impressoraDeUsuario.exibeNomeCompleto(usuario2);


    }
}
