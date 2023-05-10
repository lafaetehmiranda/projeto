package modulo_escrevendoArquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class Escrevendo {

    public static void main(String[] args) throws IOException {

        Gente gente1 = new Gente();
        gente1.setEmail("lafaetehmirandg@gmail.com");
        gente1.setNome("luiz");
        gente1.setIdade(23);

        Gente gente2 = new Gente();
        gente2.setEmail("mariadirandg@gmail.com");
        gente2.setNome("fernando");
        gente2.setIdade(35);

        Gente gente3 = new Gente();
        gente3.setEmail("lafaetehmirandg@gmail.com");
        gente3.setNome("páraquedas");
        gente3.setIdade(74);

        List<Gente> listGente = new ArrayList<Gente>();
        listGente.add(gente1);
        listGente.add(gente2);
        listGente.add(gente3);

        final Logger LOGGER = Logger.getLogger(String.valueOf(Escrevendo.class));

        //todo escrevendo um arquivo txt, csv 
        File arquivo =  new File("C:\\Users\\amand\\IdeaProjects\\projeto1\\src\\modulo_escrevendoArquivos\\arquivo.csv");

        if(!arquivo.exists()){
                arquivo.createNewFile();
        }else {
            LOGGER.severe("Nao tem arquivo no destino");
        }

        FileWriter escrever = new FileWriter(arquivo);


        for (Gente gente : listGente){
            escrever.write(gente.getEmail() + ";" + gente.getIdade() + ";" + gente.getNome() + "\n");
        }
        escrever.flush();
        escrever.close();

    }
}
