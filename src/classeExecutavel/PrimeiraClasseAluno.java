package classeExecutavel;

import entities.Aluno;
import entities.Disciplina;
import constantes.StatusAlunos;
import entities.Secretaria;
import excepition.TratativaErro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;



public class PrimeiraClasseAluno {

    public static void main(String[] args) {

        try {


            Scanner sc = new Scanner(System.in);

            //todo parte simples para fazer uma validação de acesso
            System.out.println("Informe a login:");
            String login = sc.next();

            System.out.println("Informe a senha:");
            String senha = sc.next();


            if (login.equals("admin") && senha.equals("admin")) {

                List<Aluno> alunos = new ArrayList<Aluno>();

                //todo HashMap é uma lista que temos uma chave que identifica uma sequencia de valores
                HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

                //List<Aluno> alunosAprovados = new ArrayList<Aluno>();
                //List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
                //List<Aluno> alunosReprovado = new ArrayList<Aluno>();


                for (int qtd = 1; qtd <= 5; qtd++) {

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

                //todo tem que inicializar o hashMap com put e depois s e pega com get
                maps.put(StatusAlunos.APROVADO, new ArrayList<Aluno>());
                maps.put(StatusAlunos.RECUPERACAO, new ArrayList<Aluno>());
                maps.put(StatusAlunos.REPROVADO, new ArrayList<Aluno>());

                for (Aluno aluno : alunos) {

                    if (aluno.respostaAprovavao().equals(StatusAlunos.APROVADO)) {
                        maps.get(StatusAlunos.APROVADO).add(aluno);
                    } else if (aluno.respostaAprovavao().equals(StatusAlunos.RECUPERACAO)) {
                        maps.get(StatusAlunos.REPROVADO).add(aluno);
                    } else {
                        maps.get(StatusAlunos.RECUPERACAO).add(aluno);
                    }
                }

                System.out.println("Lista do pessoal aprovado :");
                for (Aluno aluno : maps.get(StatusAlunos.APROVADO)) {
                    System.out.println("Resultado:" + aluno.respostaAprovavao() + aluno.calculoDasMedias());
                }
                System.out.println("Lista do pessoal reprovados :");
                for (Aluno aluno : maps.get(StatusAlunos.RECUPERACAO)) {
                    System.out.println("Resultado:" + aluno.respostaAprovavao() + aluno.calculoDasMedias());
                }
                System.out.println("Lista do pessoal recuperacao :");
                for (Aluno aluno : maps.get(StatusAlunos.REPROVADO)) {
                    System.out.println("Resultado:" + aluno.respostaAprovavao() + aluno.calculoDasMedias());
                }


        /*
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
         */


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
        } catch (NumberFormatException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();

        }

    }
}
