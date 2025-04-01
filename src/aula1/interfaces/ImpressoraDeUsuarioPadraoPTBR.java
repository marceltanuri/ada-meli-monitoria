package aula1.interfaces;

public class ImpressoraDeUsuarioPadraoPTBR implements ImpressoraDeUsuario{
    @Override
    public void exibeNomeCompleto(Usuario usuario) {
        System.out.println(usuario.nome + " " + usuario.sobrenome);
    }
}
