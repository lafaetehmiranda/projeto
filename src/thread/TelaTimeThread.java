package thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class TelaTimeThread extends JDialog {

    private JPanel jpanel = new JPanel(new GridBagLayout());

    private JLabel jLabel = new JLabel("TimeThread1");
    private JTextField jTextField = new JTextField();

    private JLabel jLabel2 = new JLabel("TimeThread2");
    private JTextField jTextField2 = new JTextField();

    private JButton jButton = new JButton("Start");
    private JButton jButtonTwo = new JButton("Parar");

    private Runnable threadOne = new Runnable() {

        @Override
        public void run() {
            while(true){
                jTextField.setText(new SimpleDateFormat("dd/MM/yyyy mm.ss").format(Calendar.getInstance().getTime()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                   e.printStackTrace();
                }
            }

        }
    };

    private Thread threadTime;


   public TelaTimeThread(){

       setTitle("teste tela");
       setSize(340,  340);
       setLocationRelativeTo(null);
       setResizable(false);

       GridBagConstraints gridBagConstraints = new GridBagConstraints();// todo controla o posicionamento dos componentes

       gridBagConstraints.gridx=0;
       gridBagConstraints.gridy=0;
       gridBagConstraints.gridwidth = 2;
       gridBagConstraints.insets = new Insets(5,10,5,5);
       gridBagConstraints.anchor = gridBagConstraints.WEST;

       jLabel.setPreferredSize(new Dimension(200, 25));
       jpanel.add(jLabel, gridBagConstraints);

       jTextField.setPreferredSize(new Dimension(200, 25));
       gridBagConstraints.gridy ++;
       jpanel.add(jTextField, gridBagConstraints);

       jLabel2.setPreferredSize(new Dimension(200, 25));
       gridBagConstraints.gridy ++;
       jpanel.add(jLabel2, gridBagConstraints);

       jTextField2.setPreferredSize(new Dimension(200, 25));
       gridBagConstraints.gridy ++;
       jpanel.add(jTextField2, gridBagConstraints);

       gridBagConstraints.gridwidth = 1;

       jButton.setPreferredSize(new Dimension(92,25));
       gridBagConstraints.gridy ++;
       jpanel.add(jButton, gridBagConstraints);

       jButtonTwo.setPreferredSize(new Dimension(92,25));
       gridBagConstraints.gridx ++;
       jpanel.add(jButtonTwo, gridBagConstraints);

       jButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {//todo executa o click no button
               threadTime = new Thread(threadOne);
               threadTime.start();
           }
       });

       jButtonTwo.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               threadTime.stop();
           }
       });


       add(jpanel, BorderLayout.WEST);
       setVisible(true);//todo torna a tela visivel ao usuario
    }
}
