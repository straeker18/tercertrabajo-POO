import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class punto_22 extends JFrame {
    private static JLabel nombre = new JLabel("Ingrese El Nombre del empleado");
    private static JLabel valorhora = new JLabel("Ingrese El Valor de cada Hora");
    private static JLabel tnumerohoras = new JLabel("Ingrese El numero de Holras Trabajadas");
    private static JTextField nombres,valor_horas,numerohoras;
    private static JButton boton = new JButton("Ejecutar");
    private static JButton botoncancel = new JButton("Limpliar");

    public static void main(String[] args){
        punto_22 window = new punto_22();
        window.setSize(300,300);
        window.setTitle("Punto 22");
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);

        nombres = new JTextField();
        valor_horas = new JTextField();
        numerohoras = new JTextField();

        window.setLayout(new GridLayout(4,2));
        window.getContentPane().add(nombre);
        window.getContentPane().add(nombres);
        window.getContentPane().add(valorhora);
        window.getContentPane().add(valor_horas);
        window.getContentPane().add(tnumerohoras);
        window.getContentPane().add(numerohoras);
        window.getContentPane().add(boton);
        window.getContentPane().add(botoncancel);

        
        window.setVisible(true);
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
        if ((!validarnumero(valor_horas.getText().trim()))||(!validarnumero(numerohoras.getText().trim()))){
            JOptionPane.showMessageDialog(null,"los datos no son correctos ¡¡SOLO NUMEROS y ',''.'!!");
            }
        else{
            String name = nombres.getText();
            float  salarioh = Float.parseFloat(valor_horas.getText());
            float horas = Float.parseFloat(numerohoras.getText());
            double pago = salarioh*horas;
            String pago1 = String.valueOf(pago);  
            if (pago>450000){
                JOptionPane.showMessageDialog(null, "EL empleado "+name+" gano en este mes: $" +pago1);

            }
            else{
                JOptionPane.showMessageDialog(null, "EL empleado "+name);
            }

        }

    }
    public static void botoncancel(ActionEvent e){
        nombres.setText(null);
        valor_horas.setText(null);
        numerohoras.setText(null);

    }
    public static Boolean validarnumero(String datos){
        return datos.matches("[0-9,.]*");

    }
}
