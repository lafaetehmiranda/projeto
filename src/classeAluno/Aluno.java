package classeAluno;

import java.util.ArrayList;
import java.util.List;

import static util.TratativasDeArredondamentoUtil.formaterCasasDecimais;

public class Aluno {

    private String nome;
    private int idade ;
    private String dataNascimento;
    private String numeroCpf;
    private String registroGeral;
    private String dataMatricula;
    private String serieMatriculada;

    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Aluno() {

    }

    /*todo SETTERS - é para adicionar ou receber dados para os atributos */
    /*todo GETTERS - é para resgatar ou obter o valor do atributo*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }


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
                return "Aluno Passou Parabens! " + formaterCasasDecimais(media);
            } else {
                return "Aluno Esta em recuperação " + formaterCasasDecimais(media);
            }
            } else{
                return "Aluno Esta Reprovado " + formaterCasasDecimais(media);
            }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", serieMatriculada='" + serieMatriculada + '\'' +
                '}';
    }
}
