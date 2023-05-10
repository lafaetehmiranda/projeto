package modulo_escrevendoArquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//TODO Este exemplo para criar uma nova coluna no arquivo

public class EditandoArquivo {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\amand\\IdeaProjects\\projeto1\\src\\modulo_escrevendoArquivos\\arquivo_excel.xls");

        FileInputStream entrada = new FileInputStream(file);
/*
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);//todo prepara a entrada do arquivo xls excel
        HSSFSheet planilha = hssfWorkbook.getSheetAt(0);//todo pegando planilha

        Iterator<Row> linhaIterator = planilha.iterator();

        while (linhaIterator.hasNext()){//todo nenquanto tiver linha
            Row linha = linhaIterator.next(); //todo dados da pessoa na linha

            int numeroCelulas =  linha.getPsysicalNumberOfCells();//todo quantidade de celula

            Cell cell = linha.createCell(numeroCelulas);//todo cria nova celula na linha
            cell.setCellValue("3.43,75");
        }
        entrada.close();

        FileOutputStream saida = new FileOutputStream(file);
        hssfWorkbook.write(saida);
        saida.flush();
        saida.close();
 */
    }
}
