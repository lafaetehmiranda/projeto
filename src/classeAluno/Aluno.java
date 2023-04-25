package classeAluno;

import constantes.StatusAlunos;

import java.util.ArrayList;
import java.util.List;

import static util.TratativasDeArredondamentoUtil.formaterCasasDecimais;

public class Aluno  extends Pessoa{

    private String dataMatricula;
    private String serieMatriculada;

    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Aluno() {

    }

    /*todo SETTERS - é para adicionar ou receber dados para os atributos */
    /*todo GETTERS - é para resgatar ou obter o valor do atributo*/


    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getSerieMatriculada() {
        return serieMatriculada;
    }

    public void setSerieMatriculada(String serieMatriculada) {
        this.serieMatriculada = serieMatriculada;
    }


    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double calculoDasMedias() {
        double soma = 0;

        for (Disciplina disciplina : disciplinas) {
            soma += disciplina.getNota();
        }
        return soma / disciplinas.size();
    }

    public String respostaAprovavao() {
        double media = this.calculoDasMedias();

        if (media >= 70) {
            if (media >= 40 && media <= 55) {
                return StatusAlunos.APROVADO + formaterCasasDecimais(media);
            } else {
                return StatusAlunos.RECUPERACAO + formaterCasasDecimais(media);
            }
            } else{
                return StatusAlunos.REPROVADO + formaterCasasDecimais(media);
            }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "dataMatricula='" + dataMatricula + '\'' +
                ", serieMatriculada='" + serieMatriculada + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }

    @Override
    public boolean pessoaMaiorIdade() {
        return super.pessoaMaiorIdade();
    }
}
