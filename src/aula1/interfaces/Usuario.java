package aula1.interfaces;

public class Usuario {

    String nome;
    String sobrenome;

    public Usuario(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    void exibeNomeCompleto(String locale){
        if(locale.equals("PTBR")){
            System.out.println(nome + " " + sobrenome);
        }
        else if(locale.equals("ENUS")){
            System.out.println(sobrenome + ", " + nome);
        }

        else if(locale.equals("CH")){
            System.out.println(sobrenome + ", " + nome);
        }

        else if(locale.equals("MAQUINA")){
            System.out.println("");
        }
    }
}
