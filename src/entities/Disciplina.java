package entities;

public class Disciplina {

    private double[] nota = new double[3];
    private String disciplina;

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nota=" + nota +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }

    public double mediaNotas(){
        double somaTotal = 0;
        for (int i = 0; i< nota.length; i++){
            somaTotal  += nota[i];
        }
        return somaTotal / 3;
    }
}
