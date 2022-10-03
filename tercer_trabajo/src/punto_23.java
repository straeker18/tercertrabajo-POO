import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class punto_23 extends JFrame {
    private static JLabel directionlabelA = new JLabel("      Ingrese los valores  A, B y C    \n");
    private static JLabel directionlabelB = new JLabel("X^2 + ");
    private static JLabel directionlabelC = new JLabel(" X +");
    private static JLabel directionlabelD = new JLabel(" = 0");
    private static JTextField a,b,c;
    private static JButton boton = new JButton("Ejecutar");
    private static JButton botoncancel = new JButton("Limpliar");

    public static void main(String[] args){
        punto_23 window = new punto_23();
        window.setSize(250,300);
        window.setTitle("Punto 23");
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);

        a =new JTextField(2);
        b =new JTextField(2);
        c =new JTextField(2);
        directionlabelA.setFont(new Font("Sans",Font.PLAIN,15));
        
        window.setVisible(true);
        window.setLayout(new FlowLayout());
        window.getContentPane().add(directionlabelA);
        window.getContentPane().add(a);
        window.getContentPane().add(directionlabelB);
        window.getContentPane().add(b);
        window.getContentPane().add(directionlabelC);
        window.getContentPane().add(c);
        window.getContentPane().add(directionlabelD);
        window.getContentPane().add(boton);
        window.getContentPane().add(botoncancel);


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
        float  a1 = Float.parseFloat(a.getText());
        float  b1 = Float.parseFloat(b.getText());
        float  c1 = Float.parseFloat(c.getText());
        if ((!validarnumero(a.getText().trim()))||(!validarnumero(b.getText().trim()))||(!validarnumero(c.getText().trim()))){
            JOptionPane.showMessageDialog(null,"los datos no son correctos ¡¡SOLO NUMEROS y ',''.'!!");
            }
        else{
            if( a1 != 0 ){
                if (((b1*b1)-(4*a1*c1)) >= 0 ){
                    double x1 = (-b1 + Math.sqrt((b1*b1)-(4*a1*c1)))/(2*a1);
                    double x2 = (-b1 - Math.sqrt((b1*b1)-(4*a1*c1)))/(2*a1);
                    JOptionPane.showMessageDialog(null,"la primera solucion es: "+ x1+"\nla segunda solucion es: "+x2);
                }
                else {
                    JOptionPane.showMessageDialog(null,"son raices complejas");
                }
            }
            else{
                double x3 = -c1/b1;
                JOptionPane.showMessageDialog(null,x3);
            }
        }
        }
    public static void botoncancel(ActionEvent e){
        a.setText(null);
        b.setText(null);
        c.setText(null);

    }
    public static Boolean validarnumero(String datos){
        return datos.matches("[0-9,.-]*");

    }
}


