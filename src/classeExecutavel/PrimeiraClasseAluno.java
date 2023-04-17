package classeExecutavel;

import classeAluno.Aluno;
import classeAluno.Disciplina;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static util.TratativasDeArredondamentoUtil.formaterCasasDecimais;

public class PrimeiraClasseAluno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.next();

/*
        System.out.println("Digite a data da Matricula do aluno: ");
        String dataMatricula = sc.next();
        System.out.println("Digite a data de Nascimento do aluno: ");
        String dataNascimento = sc.next();
        System.out.println("Digite a idade do aluno: ");
        int idade = sc.nextInt();
        System.out.println("Digite o numero do Cpf do aluno: ");
        String numeroCpf = sc.next();
        System.out.println("Digite o registro Geral do aluno: ");
        String registroGeral = sc.next();
        System.out.println("Digite a serie  do aluno: ");
        String serieMatriculada = sc.next();

  */


        Aluno aluno1 = new Aluno();
        aluno1.setNome(nome);
        /*
        aluno1.setDataMatricula(dataMatricula);
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setNumeroCpf(numeroCpf);
        aluno1.setRegistroGeral(registroGeral);
        aluno1.setSerieMatriculada(serieMatriculada);
         */

        for (int posicao = 1; posicao <= 3; posicao++){
            System.out.println("Digite a Disciplina do aluno: " + posicao);
            String nomeDisciplina = sc.next();
            System.out.println("Digite a primeira nota do aluno: " + posicao);
            String nota = sc.next();
            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(Double.valueOf(nota));

            aluno1.getDisciplinas().add(disciplina);
        }

         System.out.println("Quer retirar alguma disciplina ? ");
         boolean escolhas = sc.nextBoolean();

        if(escolhas == true){
            System.out.println("Qual a disciplina quer remover ? ");
            String disciplinaRemover = sc.next();
            aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
        }


        System.out.println(aluno1);
        System.out.println("Resultado do aluno: " + aluno1.respostaAprovavao() + "com a nota");



        sc.close();
    }


}
