import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;

public class punto_19 extends JFrame {
    
    private static ImageIcon imagen = new ImageIcon("Triangle.Equilateral.svg.png");
    private static JLabel imagen1 = new JLabel();
    private static JTextField lado = new JTextField(20);
    private static JLabel directionsLabel = new JLabel("ingrese el valor de un lado");
    private static JLabel resultado = new JLabel();
    private static JLabel resultado_area = new JLabel();
    private static JButton nameButton =new JButton("calcular");
    private static JButton cancelButton =new JButton("clear");
    public static void main(String[] args) {

        punto_19 window = new punto_19();
        window.setSize(300,550);
        window.setVisible(true);
        window.setTitle("punto triangulo");
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        imagen1.setIcon(imagen);
        window.setLayout(new FlowLayout(FlowLayout.CENTER,10,30));
        window.getContentPane().add(directionsLabel);
        window.getContentPane().add(lado);
        window.getContentPane().add(imagen1);
        window.getContentPane().add(new JLabel());
        window.getContentPane().add(nameButton);
        window.getContentPane().add(cancelButton);
        
        window.getContentPane().add(resultado);
        window.getContentPane().add(resultado_area);

        window.setMaximumSize(new Dimension(300,600));

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
        if (!validarnumero(lado.getText().trim()))
        {
            JOptionPane.showMessageDialog(null,"los datos no son correctos ¡¡SOLO NUMEROS y ',''.'!!");
        }
        else{
            float lado1 = Float.parseFloat(lado.getText());
            double perimetro = lado1*3;
            double area = (Math.pow(lado1,2)*Math.sqrt(3))/4;
            resultado.setText("el perimetro es: "+perimetro);
            resultado_area.setText("el area es: "+area);
        }
    }
    public static void buttonclic(ActionEvent e){
        lado.setText(null);
    }
    public static Boolean validarnumero(String datos){
        return datos.matches("[0-9,.]*");

    }
}