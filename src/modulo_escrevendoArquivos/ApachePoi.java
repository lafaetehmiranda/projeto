package modulo_escrevendoArquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ApachePoi {

    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\amand\\IdeaProjects\\projeto1\\src\\modulo_escrevendoArquivos\\arquivo_excel.xls");

        if(!file.exists()){
            file.createNewFile();
        }else {
            System.out.println("Nao tem arquivo no destino");
        }

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

        //todo Vai ser usado para criar e escrever a planilha
       // HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        //todo cria a planilha
        //HSSFSheet linhasGente = new hssfWorkbook.createSheet("Planilha de gente testes");

        /*
        int numeroLinha = 0;
        for(Gente gente: listGente){
            Row linhas = linhasGente.createRow(numeroLinha ++);//todo cria linha na planilha

            int celula = 0;

            Cell cellNome = linhas.createCell(celula ++);//todo celula 1
            cellNome.setCellValue(gente.getNome());

            Cell cellEmail = linhas.createCell(celula ++);//todo celula 2
            cellEmail.setCellValue(gente.getIdade());

            Cell cellIdade = linhas.createCell(celula ++);//todo celula 3
            cellIdade.setCellValue(gente.getEmail());
        }//todo terminou de montar a planilha

        FileOutputStream saida = new FileOutputStream(file);
        hssfWorkbook.write(saida);//todo escreve a planilha em arquivo
        saida.flush();
        saida.close();
         */
    }
}
