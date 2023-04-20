package classeExecutavel;

import classeAluno.Aluno;
import classeAluno.Disciplina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class PrimeiraClasseAluno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Aluno> alunos = new ArrayList<Aluno>();

        for (int qtd= 1; qtd <=3; qtd++) {

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

            for (int posicao = 1; posicao <= 2; posicao++) {
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


            if (escolhas == true) {

                boolean continuarRemovendo = true;
                int posicao = 1;

                while (continuarRemovendo == true) {
                    System.out.println("Qual a disciplina quer remover ? ");
                    String disciplinaRemover = sc.next();
                    aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
                    System.out.println("quer continuar removendo?");
                    continuarRemovendo = sc.nextBoolean();
                }
            }
            alunos.add(aluno1);
        }

        //TODO exemplo de laço de repetição por posções
        for (int pos = 0; pos <alunos.size(); pos++){

            Aluno aluno = alunos.get(pos);

            //TODO EXEMPLO DE SUBSTITUIR UM PELO OUTRO
            if(aluno.getNome().equals("lafa")){
                Aluno substituir = new Aluno();
                substituir.setNome("aluno Trocado");
                Disciplina disciplina = new Disciplina();
               disciplina.setDisciplina("matematica");
               disciplina.setNota(65);
               substituir.getDisciplinas().add(disciplina);

               alunos.set(pos, substituir);
               aluno = alunos.get(pos);
            }
                for (int posDis = 0; posDis < aluno.getDisciplinas().size(); posDis++){
                    Disciplina disc = aluno.getDisciplinas().get(posDis);
                    System.out.println(disc.getDisciplina());
                }
            }




        //TODO exemplo de laço de repetição
/*
        for (Aluno aluno: alunos) {

            if(aluno.getNome().equals("luis")){
                alunos.remove(aluno);
                break;
            }else {
                System.out.println(alunos);
                System.out.println("Resultado do aluno: " + aluno.respostaAprovavao() + "com essa nota");
            }
        }

        for (Aluno aluno : alunos){
            System.out.println("Alunos que sobraram na lista");
            System.out.println(aluno.getNome());
            System.out.println("Suas materias são:" );
            for (Disciplina disciplina : aluno.getDisciplinas()){
                System.out.println(disciplina.getDisciplina());
            }
        }
 */

        sc.close();
    }


}
