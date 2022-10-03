import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class punto_10 extends JFrame{
    private static JLabel directionsLabel = new JLabel("ingrese el numero de inscripcion");
    private static JLabel directionsLabel1 = new JLabel("ingrese los nombres del estudiante");
    private static JLabel directionsLabel2 = new JLabel("ingrese el patrimonio del estudiante");
    private static JLabel directionsLabel3 = new JLabel("ingrese el estrato social");
    private static JTextField nombres,numero_inscripcion,patrimonio,estrato;
    private static JButton boton = new JButton("Ejecutar");
    private static JButton botoncancel = new JButton("Limpliar");

    public static void main(String[]args){
        punto_10 window = new punto_10();
        window.setTitle("punto_10");
        window.setSize(500,500);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setLayout(new GridLayout(5,2));

        nombres = new JTextField();
        numero_inscripcion = new JTextField();
        patrimonio = new JTextField();
        estrato = new JTextField();

        window.getContentPane().add(directionsLabel);
        window.getContentPane().add(numero_inscripcion);
        window.getContentPane().add(directionsLabel1);
        window.getContentPane().add(nombres);
        window.getContentPane().add(directionsLabel2);
        window.getContentPane().add(patrimonio);
        window.getContentPane().add(directionsLabel3);
        window.getContentPane().add(estrato);
        window.getContentPane().add(boton);
        window.getContentPane().add(botoncancel);


        window.setVisible(true);
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



    }
    public static void boton(ActionEvent e){
        
        if ((!validarnumero(patrimonio.getText().trim()))||(!validarnumero(estrato.getText().trim()))){
            JOptionPane.showMessageDialog(null,"los datos no son correctos ¡¡SOLO NUMEROS y ',''.'!!");

        }
        else{
            String numero = numero_inscripcion.getText();
            String name = nombres.getText();
            float estrato1 = Float.parseFloat(estrato.getText());
            float patrimonio1 = Float.parseFloat(patrimonio.getText());
            if ((estrato1>3)&&(patrimonio1>2000000)){
                Double pago = 50000+(patrimonio1*0.03);
                JOptionPane.showMessageDialog(null, "EL ESTUDIANTE CON NUMERO DE INSCRIPCION "+numero+"\nY NOMBRE "+name+"\nDEBE PAGAR: $"+pago, "factura", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null,"EL ESTUDIANTE CON NUMERO DE INSCRIPCION "+numero+"\nY NOMBRE "+name+"\nDEBE PAGAR: $"+50000, "factura",JOptionPane.INFORMATION_MESSAGE);
            }
            }
        }

    public static void botoncancel(ActionEvent e){
        numero_inscripcion.setText(null);
        nombres.setText(null);
        patrimonio.setText(null);
        estrato.setText(null);

    }
    public static Boolean validarnumero(String datos){
        return datos.matches("[0-9,.]*");

    }
}

