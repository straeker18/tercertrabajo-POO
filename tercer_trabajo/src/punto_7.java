
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class punto_7 extends JFrame {
    private static JLabel textA = new JLabel("Ingrese A");
    private static JLabel textB = new JLabel("Ingrese B");
    private static JTextField numeroA,numeroB;
    private static JButton nameButton =new JButton("Ejecutar");
    private static JButton cancelButton =new JButton("Clear"); 

    public static void main(String[] args){
        punto_7 window = new punto_7();
        window.setSize(300,300);
        window.setTitle("Punto 7");
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);

        numeroA = new JTextField();
        numeroB = new JTextField();


        window.setLayout(new GridLayout(5,2));
        window.getContentPane().add(textA);
        window.getContentPane().add(numeroA);
        window.getContentPane().add(new JLabel());
        window.getContentPane().add(new JLabel());
        window.getContentPane().add(textB);
        window.getContentPane().add(numeroB);
        window.getContentPane().add(new JLabel());
        window.getContentPane().add(new JLabel());
        window.getContentPane().add(nameButton);
        window.getContentPane().add(cancelButton);

        window.setVisible(true);

        nameButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonclick(e);
            }
        });
        cancelButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonclic(e);
            }

        });

    }
    public static void buttonclick(ActionEvent e){
        if (!validarnumero(numeroA.getText().trim()) || !validarnumero((numeroB.getText()).trim())){
            JOptionPane.showMessageDialog(null,"los datos no son correctos ¡¡SOLO NUMEROS y ',''.'!!");

        }
        else{
            float a = Float.parseFloat(numeroA.getText());
            float b = Float.parseFloat(numeroB.getText());
            if ((a>=b)) {
                if (a>b){
                    JOptionPane.showMessageDialog(null, "A es Mayor que B", "Es Mayor", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "A y B son iguales", "Igualdad", JOptionPane.INFORMATION_MESSAGE);
                }


            }
            else{
                JOptionPane.showMessageDialog(null, "A es Menor que B", "Es Menor", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }
    public static Boolean validarnumero(String datos){
        return datos.matches("[0-9,.]*");
    }
    public static void buttonclic(ActionEvent e){
        numeroA.setText(null);
        numeroB.setText(null);
    
}
}
