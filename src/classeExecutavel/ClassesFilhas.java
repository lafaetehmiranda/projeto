package classeExecutavel;

import classeAluno.Aluno;
import classeAluno.Diretor;
import classeAluno.Secretaria;

public class ClassesFilhas {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("teste");

        Diretor diretor = new Diretor();
        diretor.setIdade(32);

        Secretaria secretaria = new Secretaria();
        secretaria.setNumeroCpf("125-689-734.62");


        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretaria);

    }
}
