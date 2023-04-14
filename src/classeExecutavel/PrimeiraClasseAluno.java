package classeExecutavel;

import classeAluno.Aluno;

import java.util.Date;

public class PrimeiraClasseAluno {
    public void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("pedro");
        aluno1.setDataMatricula(new Date());
        aluno1.setDataNascimento(new Date());
        aluno1.setIdade(23);
        aluno1.setNumeroCpf("123.654.780-09");
        aluno1.setRegistroGeral("65436534");
        aluno1.setSerieMatriculada("6");
        aluno1.setNota1(30);
        aluno1.setNota2(87);
        aluno1.setNota3(48);
        calculoDasMedias(aluno1);
        System.out.println(aluno1);

        Aluno aluno2 = new Aluno();
    }

    private void calculoDasMedias(Aluno aluno) {
        double media = aluno.getNota1() + aluno.getNota2() + aluno.getNota3() / 3;
    }



}
