package classeExecutavel;

import auxiliarAutenticar.FuncaoAutenticacao;
import entities.Aluno;
import entities.Diretor;
import entities.Secretaria;
import interfaces.PermitirAcesso;

import java.util.Scanner;

public class ClassesFilhas {

    public static void main(String[] args) {

        /*
        Aluno aluno = new Aluno();
        aluno.setNome("teste");

        Diretor diretor = new Diretor();
        diretor.setIdade(32);

        Secretaria secretaria = new Secretaria();
        secretaria.setNumeroCpf("125-689-734.62");


        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretaria);
         */

        //TODO exemplo de autenticar com interface e com interface com parametors no metodo
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a login:");
        String login = sc.next();

        System.out.println("Informe a senha:");
        String senha = sc.next();

        PermitirAcesso permitirAcesso = new Secretaria(login, senha);

        if(new FuncaoAutenticacao(permitirAcesso).autenticarAcesso()){
            System.out.println("testes de autenticação");
        }

        sc.close();

    }
}
