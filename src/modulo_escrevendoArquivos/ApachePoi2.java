package modulo_escrevendoArquivos;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ApachePoi2 {

    public static void main(String[] args) throws Exception {

        FileInputStream entrada = new FileInputStream(new File("C:\\Users\\amand\\IdeaProjects\\projeto1\\src\\modulo_escrevendoArquivos\\arquivo_excel.xls"));

        //todo prepara a entrada do arquivo excel  para a leitura
        // HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);

        //todo pega a primeira planilha do nosso arquivo excel
        //HSSFSheet planilha = new hssfWorkbook.getSheetAt(0);

        /*
        Iterator<Row> linhaIterator = new planilha.iterator();

        List<Gente> gentes = new ArrayList<Gente>();

        while(linhaIterator.hasNext()){//todo enquanto tiver linha no arquivo excel

            Row linha = linhaIterator.next();//todo dados da gente na linha
            Iterator<Cell> celula = linha.iterator();

            Gente gente = new Gente();

            while (celula.hasNext()){//todo pércorrer as celulas
                Cell cell = celula.next();

                switch (cell.getColumnIndex()){
                    case 0:
                        gente.setNome(cell.getStringCellValue());
                        break;
                    case 1:
                        gente.setEmail(cell.getStringCellValue());
                        break;
                    case 2:
                        gente.setIdade(Double.valueOf(Cell.getNumericCellValue()).intValue());
                        break;
                }

            }//todo percorreu todas as linhas

            gentes.add(gente);
        }

        entrada.close();//todo sempre fechar o arquivo

        for (Gente g: gentes) { //todo poderia gravas no banco de dados
            System.out.println(g);
        }
    }

         */
    }
}
