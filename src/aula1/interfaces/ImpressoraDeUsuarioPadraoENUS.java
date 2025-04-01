package aula1.interfaces;

public class ImpressoraDeUsuarioPadraoENUS implements ImpressoraDeUsuario{
    @Override
    public void exibeNomeCompleto(Usuario usuario) {
        System.out.println(usuario.sobrenome + ", " + usuario.nome);
    }
}
