package classeAluno;

public class Diretor extends Pessoa {

    private int tempoDirecao;
    private String titulacao;
    private String registroEducacao;

    public int getTempoDirecao() {
        return tempoDirecao;
    }

    public void setTempoDirecao(int tempoDirecao) {
        this.tempoDirecao = tempoDirecao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getRegistroEducacao() {
        return registroEducacao;
    }

    public void setRegistroEducacao(String registroEducacao) {
        this.registroEducacao = registroEducacao;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "tempoDirecao=" + tempoDirecao +
                ", titulacao='" + titulacao + '\'' +
                ", registroEducacao='" + registroEducacao + '\'' +
                '}';
    }
}
