package thread;

import javax.swing.*;

public class Threads {

    public static void main(String[] args) {

        new Thread(){
           public void run() { //todo executa o que queremos

               //todo codigo que eu quero executar em paralelo
               for(int i = 0; i < 10; i++){
                   /**Executando esse envio com um tempo de parada ou com tempo determinado*/
                   System.out.println("to mandando coisas");
                   try {
                       Thread.sleep(1000);//todo isso serve para dar um tempo
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }

               }

            }
        }.start(); //todo esse start liga a thread que fica processando paralelamente

            JOptionPane.showMessageDialog(null, "teste thread");

/*
        //todo codigo que eu quero executar em paralelo
        for(int i = 0; i < 10; i++){
            // todo Executando esse envio com um tempo de parada ou com tempo determinado
            Thread.sleep(1000);//todo isso serve para dar um tempo

        }
 */
    }

}
