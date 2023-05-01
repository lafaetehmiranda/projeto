package classeExecutavel;

import entities.Aluno;
import entities.Disciplina;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeiraClasseArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //todo Array pode ser de todos os tipos de dados e objetos
/*
        System.out.println("Digite aqui quantas posiçoes" );
        String posicoes = sc.next();
        //todo array sempre deve ter uma quantidade de posiçoes definidas, (sempre iniciar o array como exemplo)
        double[] notas = new double[Integer.parseInt(posicoes)];

        for (int pos = 0; pos < notas.length; pos++){
            System.out.println("digite o valor das posiçoes" );
            String valor = sc.next();
            System.out.println("O valor das posiçoes"+ pos);
            notas[pos] = Double.valueOf(valor);
            System.out.println(pos);
            System.out.println(posicoes+ " =" + notas);
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println((i +1)+ notas[i]);
        }

        //todo formas de atribuir valores
        double[] valores = {2.4, 5.6};

        String[] valores1 = new String[2];
        String[] valores2 = {"teste","54"};

        valores1[0] = "teste";
        valores1[1] = "32";

        for (int i = 0; i < valores2.length; i++) {
            System.out.println("valores" + (i +1)+ valores2[i]);
        }
 */

        double[] notas = {4, 5, 9};

        Aluno aluno = new Aluno();
        aluno.setNome("teste");
        aluno.setIdade(23);

        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("hql");
        disciplina.setNota(notas);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("testes");
        disciplina2.setNota(notas);

        aluno.getDisciplinas().add(disciplina);


        Aluno[] arrayAlunos = new Aluno[1];

        arrayAlunos[0] = aluno;

        for (int i=0; i < arrayAlunos.length; i++){
            System.out.println("" + arrayAlunos[i].getNome());

            for (Disciplina disciplina1: arrayAlunos[i].getDisciplinas()){
                System.out.println("" + disciplina1.getDisciplina());

                for (int nota = 0; nota < disciplina1.getNota().length; nota++){
                    System.out.println("" + nota + " " + disciplina1.getNota());
                }
            }

        }

/*
        for (Disciplina disciplina1: aluno.getDisciplinas()) {
            System.out.println(disciplina1);

            double notaMax = 0.0;
            for (int pos = 0; pos< notas.length; pos++){
                System.out.println("nota " + pos + "= " + disciplina1.getNota()[pos]);

                if(pos == 0){
                    notaMax = disciplina.getNota()[pos];
                }else{
                    if(disciplina.getNota()[pos] < notaMax){
                        notaMax = disciplina.getNota()[pos];
                    }
                }
            }
            System.out.println("nota maior " + disciplina.getDisciplina() +  "" + notaMax);
        }

 */



        sc.close();
    }
}
