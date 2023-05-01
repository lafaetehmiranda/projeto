package classeExecutavel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeiraClasseMatriz {
    public static void main(String[] args) {

        //todo Criando Matriz
/*
        int notas[][] = new int[2][3];

        notas[0][0] = 90;
        notas[0][1] = 45;
        notas[0][2] = 64;

        notas[1][0] = 10;
        notas[1][1] = 40;
        notas[1][2] = 74;

        System.out.println(notas);

        //todo esta percorrendo coluna
        for (int coluna = 0; coluna < notas.length; coluna++){
                //todo esta percorrendo linhas
            for (int linha = 0; linha < notas[coluna].length; linha++){
                System.out.println(notas[coluna][linha]);
            }
        }
 */

        //todo Split Array
        String texto = "lafa, testes, 56, 86, 32";
        String[] valoresArray = texto.split(",");

        //todo convertendo array em lista
        List<String> list= Arrays.asList(valoresArray);

        for(String s : list){
            System.out.println(s);
        }

        //todo convertendo de lista para array
        String[] strings = list.toArray(new String[4]);
        System.out.println(strings);

        for(int i = 0; i < strings.length; i++){
            System.out.println(strings[i]);

        }

    }
}
