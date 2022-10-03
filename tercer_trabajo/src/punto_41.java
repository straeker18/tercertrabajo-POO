import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class punto_41 extends JFrame{
    private static JLabel directionlabel = new JLabel("Agregar numeros");
    private static JButton boton = new JButton("Agregar");
    private static JButton botoncalc = new JButton("Calcular");
    private static JButton botoncancel = new JButton("Limpliar");
    private static String lista[]={};
    private static JList list =new JList<String>(lista);
    private static DefaultListModel<String> modelo;
    private static JTextField numero = new JTextField(20);;
    public static void main(String[] args){
        modelo =new DefaultListModel<>();
        list.setModel(modelo);
        punto_41 window = new punto_41();
        window.setSize(500,200);
        window.setTitle("Punto 41");
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);

        window.setVisible(true);
        window.setLayout(new FlowLayout());
        window.getContentPane().add(directionlabel);
        window.getContentPane().add(numero);
        window.getContentPane().add(boton);
        window.getContentPane().add(botoncancel);
        window.getContentPane().add(botoncalc);
        window.getContentPane().add(list);


        boton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                boton(e);
            }

        });
        botoncancel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                botoncancel(e);
            }

        });
        botoncalc.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                botoncalc(e);
                
            }

        });
        


    }
    public static void boton(ActionEvent e){
        if ((!validarnumero(numero.getText().trim()))||numero.getText()==null ){
            JOptionPane.showMessageDialog(null,"los datos no son correctos ¡¡SOLO NUMEROS y ',''.'!!");

        }
        else{
            String  numeros = numero.getText();
            modelo.addElement(numeros);
            numero.setText(null);
        }
    }
    public static void botoncancel(ActionEvent e){
        modelo.remove(list.getSelectedIndex());

        
    }
    public static void botoncalc(ActionEvent e){
        float count =0;
        int a = modelo.size();
        for(int i=0; i<a; i++){
            String b = modelo.get(i);
            float f=Float.parseFloat(b);
            if (f>count){
                count = f;
            }
        }
        JOptionPane.showMessageDialog(null,"el numero mayor del arreglo es: "+count);      

    }

    public static Boolean validarnumero(String datos){
        return datos.matches("[0-9,.-]*");

    }
}

