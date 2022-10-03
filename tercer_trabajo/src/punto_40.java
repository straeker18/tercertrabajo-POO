import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class punto_40 extends JFrame {
    private static JLabel directionlabel = new JLabel("Nuevo numero");
    private static JLabel directionlabel1 = new JLabel();
    private static JLabel directionlabel2 = new JLabel();
    private static JLabel directionlabel3 = new JLabel();
    private static JButton boton = new JButton("Agregar");
    private static JButton botoncalc = new JButton("Calcular");
    private static JButton botoncancel = new JButton("Limpliar");
    private static JTextField numero = new JTextField(20);;
    private static String lista[]={};
    private static JList list =new JList<String>(lista);
    private static DefaultListModel<String> modelo;
    
    

    public static void main(String[] args){
        modelo =new DefaultListModel<>();
        list.setModel(modelo);
        punto_40 window = new punto_40();
        window.setSize(500,200);
        window.setTitle("Punto 40");
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        window.setVisible(true);
        window.setLayout(new FlowLayout());
        window.getContentPane().add(directionlabel);
        window.getContentPane().add(numero);
        window.getContentPane().add(boton);
        window.getContentPane().add(botoncancel);
        window.getContentPane().add(botoncalc);
        window.getContentPane().add(list);
        window.getContentPane().add(directionlabel1);
        window.getContentPane().add(directionlabel2);
        window.getContentPane().add(directionlabel3);


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
        if (list.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(null,"no se seleciono ningun valor");
        }
        else{
            directionlabel1.setText(null);  
            String a = list.getSelectedValue().toString();
            float f=Float.parseFloat(a);
            double b = Math.sqrt(f);
            double c = Math.pow(f,2);
            double d = Math.pow(f,3);

            directionlabel1.setText("La raiz cuadrada es: "+ b);
            directionlabel2.setText("la cuadrada de este numero es: "+c);
            directionlabel3.setText("la cubica de este numero es: "+d);
        
        }
     


    }
    public static Boolean validarnumero(String datos){
        return datos.matches("[0-9,.-]*");

    }
}