import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class punto_18 extends JFrame {
    private static JLabel directionsLabel = new JLabel("ingrese el codigo del empleado");
    private static JLabel directionsLabel1 = new JLabel("ingrese los nombres del empleado");
    private static JLabel directionsLabel2 = new JLabel("ingrese las horas trabajadas");
    private static JLabel directionsLabel3 = new JLabel("ingrese el valor de las horas");
    private static JLabel directionsLabel4 = new JLabel("ingrese la retencion a la fuente");
    private static JTextField nombres,codigo,horas_trabajo,valor_horas,retencion_fuente;
    private static JButton nameButton =new JButton("Ejecutar");      

    public static void main(String[] args) {
        punto_18 window = new punto_18();
        window.setSize(500,500);
        
        window.setTitle("punto 18");
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);

        codigo = new JTextField(25);
        TextPrompt placeholder_codigo = new TextPrompt("ejem: 123456789", codigo);
        placeholder_codigo.changeAlpha(0.75f);
        placeholder_codigo.changeStyle(Font.ITALIC);
        nombres = new JTextField(25);
        TextPrompt placeholder_nombres = new TextPrompt("ejem: juanito perez", nombres);
        placeholder_nombres.changeAlpha(0.75f);
        placeholder_nombres.changeStyle(Font.ITALIC);
        horas_trabajo = new JTextField(25);
        TextPrompt placeholder_trabajo = new TextPrompt("ejem: 48", horas_trabajo);
        placeholder_trabajo.changeAlpha(0.75f);
        placeholder_trabajo.changeStyle(Font.ITALIC);
        valor_horas = new JTextField(25);
        TextPrompt placeholder_valor = new TextPrompt("ejem: 50000", valor_horas);
        placeholder_valor.changeAlpha(0.75f);
        placeholder_valor.changeStyle(Font.ITALIC);
        retencion_fuente = new JTextField(25);
        TextPrompt placeholder_retencion = new TextPrompt("ejem: 100", retencion_fuente);
        placeholder_retencion.changeAlpha(0.75f);
        placeholder_valor.changeStyle(Font.ITALIC);

        //window.setLayout(new FlowLayout());
        window.setLayout(new GridLayout(11,2));
        window.getContentPane().add(directionsLabel);
        window.getContentPane().add(codigo);
        window.getContentPane().add(new JLabel());
        window.getContentPane().add(new JLabel());
        window.getContentPane().add(directionsLabel1);
        window.getContentPane().add(nombres);
        window.getContentPane().add(new JLabel());
        window.getContentPane().add(new JLabel());
        window.getContentPane().add(directionsLabel2);
        window.getContentPane().add(horas_trabajo);
        window.getContentPane().add(new JLabel());
        window.getContentPane().add(new JLabel());
        window.getContentPane().add(directionsLabel3);
        window.getContentPane().add(valor_horas);
        window.getContentPane().add(new JLabel());
        window.getContentPane().add(new JLabel());
        window.getContentPane().add(directionsLabel4);
        window.getContentPane().add(retencion_fuente);
        window.getContentPane().add(new JLabel());
        window.getContentPane().add(new JLabel());
        window.getContentPane().add(nameButton);

        window.setVisible(true);
        
        nameButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonclick(e);
            }

        });
    }
    public static void buttonclick(ActionEvent e){
        if ((!validarnumero(horas_trabajo.getText().trim()) || ((!validarnumero(valor_horas.getText().trim()))))||((!validarnumerodecimal(retencion_fuente.getText().trim())))) 
        {
            JOptionPane.showMessageDialog(null,"los datos no son correctos en horas trabajadas, valor horas y/o retencion de la fuente ¡¡SOLO NUMEROS y ',''.'!!");
        }
        else 
        {
            String nombre = nombres.getText();
            String CODIGO = codigo.getText();
            Float horasT = Float.parseFloat(horas_trabajo.getText());
            Float valor = Float.parseFloat(valor_horas.getText());
            double salario_bruto = valor*horasT;
            Float retencion = Float.parseFloat(retencion_fuente.getText());
            double salario_neto = (valor*horasT)*((100-retencion)/100);
            JOptionPane.showMessageDialog(null, nombre+"["+CODIGO+"]\n"+"salario Bruto: "+salario_bruto+"$\n"+"salario neto: "+salario_neto+"$", null, JOptionPane.INFORMATION_MESSAGE);
        }
        }
    public static Boolean validarnumero(String datos){
        return datos.matches("[0-9]*");

    }
    public static Boolean validarnumerodecimal(String datos){
        return datos.matches("[0-9,.]*");

    }
        
}
