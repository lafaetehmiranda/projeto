package modulo_escrevendoArquivos;

import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoTxt {

    public static void main(String[] args) throws IOException {

        FileInputStream entradaDeDados =
                new FileInputStream(new File(
                        "C:\\Users\\amand\\IdeaProjects\\projeto1\\src\\modulo_escrevendoArquivos\\arquivo.txt"));

        Scanner lerArquivo = new Scanner(entradaDeDados, "UTF-8");

        List<Gente> gentes = new ArrayList<Gente>();

        while (lerArquivo.hasNext()) {
            String linha = lerArquivo.nextLine();

            if (linha != null && !linha.isEmpty()) {
               String[] dados = linha.split(";");

               Gente gente = new Gente();
               gente.setEmail(dados[0]);
               gente.setIdade(Integer.parseInt(dados[1]));
               gente.setNome(dados[2]);

               gentes.add(gente);

            }
        }
        System.out.println(gentes);
    }
}
