import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class interfazgrafica extends JFrame {
    private static JButton botoncirculo =new JButton("circulo");
    private static JButton botoncirculocalcular =new JButton("calcular");
    private static JButton botoncuadrado =new JButton("cuadrado");
    private static JButton botoncuadradocalcular =new JButton("calcular");
    private static JButton botonrectangulo =new JButton("rectangulo");
    private static JButton botonrectangulocalcular =new JButton("calcular");
    private static JButton botonrombo =new JButton("rombo");
    private static JButton botonrombocalcular =new JButton("calcular");
    private static JButton botontrapecio =new JButton("trapecio");
    private static JButton botontrapeciocalcular =new JButton("calcular");
    private static JButton botontriangulorectangulo =new JButton("triangulorectangulo");
    private static JButton botontriangulorectangulocalcular =new JButton("calcular");
    private static JLabel labelcirculo,labelcuadrado,labelrectanguloh,labelrectangulol,labelromboH,labelromboh,labeltrapecioB,labeltrapeciob,labeltrapecioh,labeltrapeciold,labeltrapeciolz,labeltriangulob,labeltriangulh;
    private static JTextField a,b,c,d,f,g,h,i,j,k,m,n,l;
    public static void main(String[] args){
        interfazgrafica window = new interfazgrafica();
        window.setSize(300,300);
        window.setTitle("intergaz grafica");
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);

        window.setVisible(true);

        window.setLayout(new GridLayout(2,3));
        window.getContentPane().add(botoncirculo);
        window.getContentPane().add(botoncuadrado);
        window.getContentPane().add(botonrectangulo);
        window.getContentPane().add(botonrombo);
        window.getContentPane().add(botontrapecio);
        window.getContentPane().add(botontriangulorectangulo);
        
        
        
        botoncirculo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                botoncirculo(e);
            }

        });
        botoncuadrado.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                botoncuadrado(e);
            }

        });
        botonrectangulo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                botonrectangulo(e);
            }

        });
        botonrombo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                botonrombo(e);
            }

        });
        botontrapecio.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                botontrapecio(e);
            }

        });
        botontriangulorectangulo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                botontriangulorectangulo(e);
            }

        });
    }
    public static void botoncirculo(ActionEvent e){
        interfazgrafica circulo = new interfazgrafica();
        circulo.setSize(300,300);
        circulo.setTitle("circulo");
        circulo.setDefaultCloseOperation(EXIT_ON_CLOSE);


        circulo.setVisible(true);

        circulo.setLayout(new GridLayout(2,3));
        labelcirculo = new JLabel("ingresa el radio");
        circulo.getContentPane().add(labelcirculo);
        a = new JTextField();
        circulo.getContentPane().add(a);
        circulo.getContentPane().add(botoncirculocalcular);
        
        botoncirculocalcular.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                botoncirculocalcular(e);
                
            }

        });


    }
    public static void botoncuadrado(ActionEvent e){
        interfazgrafica cuadrado = new interfazgrafica();
        cuadrado.setSize(300,300);
        cuadrado.setTitle("cuadrado");
        cuadrado.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cuadrado.setVisible(true);

        cuadrado.setVisible(true);
        cuadrado.setLayout(new GridLayout(2,2));
        labelcuadrado = new JLabel("ingresa el lado");
        cuadrado.getContentPane().add(labelcuadrado);
        b = new JTextField();
        cuadrado.getContentPane().add(b);
        cuadrado.getContentPane().add(botoncuadradocalcular);


        botoncuadradocalcular.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                botoncuadradocalcular(e);
            }
        });
    }

    public static void botonrectangulo(ActionEvent e){

        interfazgrafica rectangulo = new interfazgrafica();
        rectangulo.setSize(300,300);
        rectangulo.setTitle("rectangulo");
        rectangulo.setDefaultCloseOperation(EXIT_ON_CLOSE);
        rectangulo.setVisible(true);

        rectangulo.setVisible(true);
        rectangulo.setLayout(new GridLayout(3,2));
        labelrectanguloh = new JLabel("ingrese altura");
        rectangulo.getContentPane().add(labelrectanguloh);
        c = new JTextField();
        rectangulo.getContentPane().add(c);
        labelrectangulol = new JLabel("ingrese base");
        rectangulo.getContentPane().add(labelrectangulol);
        d = new JTextField();
        rectangulo.getContentPane().add(d);
        rectangulo.getContentPane().add(botonrectangulocalcular);


        botonrectangulocalcular.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                botonrectangulocalcular(e);
            }
        });
    }
    public static void botonrombo(ActionEvent e){
        interfazgrafica rombo = new interfazgrafica();
        rombo.setSize(300,300);
        rombo.setTitle("rombo");
        rombo.setDefaultCloseOperation(EXIT_ON_CLOSE);
        rombo.setVisible(true);

        rombo.setLayout(new GridLayout(3,2));
        labelromboH = new JLabel("ingrese diagonal mayor");
        rombo.getContentPane().add(labelromboH);
        f = new JTextField();
        rombo.getContentPane().add(f);
        labelromboh = new JLabel("ingrese diagonal menor");
        rombo.getContentPane().add(labelromboh);
        g = new JTextField();
        rombo.getContentPane().add(g);
        rombo.getContentPane().add(botonrombocalcular);


        botonrombocalcular.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                botonrombocalcular(e);
            }
        });
    }
    public static void botontrapecio(ActionEvent e){

        interfazgrafica trapecio = new interfazgrafica();
        trapecio.setSize(300,300);
        trapecio.setTitle("trapecio");
        trapecio.setDefaultCloseOperation(EXIT_ON_CLOSE);
        trapecio.setVisible(true);

        trapecio.setVisible(true);
        trapecio.setLayout(new GridLayout(6,2));
        labeltrapecioB = new JLabel("ingrese Base mayor");
        trapecio.getContentPane().add(labeltrapecioB);
        h = new JTextField();
        trapecio.getContentPane().add(h);
        labeltrapeciob = new JLabel("ingrese base menor");
        trapecio.getContentPane().add(labeltrapeciob);
        i = new JTextField();
        trapecio.getContentPane().add(i);
        labeltrapeciold = new JLabel("lado derecho");
        trapecio.getContentPane().add(labeltrapeciold);
        j = new JTextField();
        trapecio.getContentPane().add(j);
        labeltrapeciolz = new JLabel("ingrese lado izquierdo");
        trapecio.getContentPane().add(labeltrapeciolz);
        k = new JTextField();
        trapecio.getContentPane().add(k);
        labeltrapecioh = new JLabel("ingrese altura");
        trapecio.getContentPane().add(labeltrapecioh);
        m = new JTextField();
        trapecio.getContentPane().add(m);
        trapecio.getContentPane().add(botontrapeciocalcular);


        botontrapeciocalcular.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                botontrapeciocalcular(e);
            }
        });
    }
    public static void botontriangulorectangulo(ActionEvent e){
        interfazgrafica triangulorectangulo = new interfazgrafica();
        triangulorectangulo.setSize(300,300);
        triangulorectangulo.setTitle("triangulorectangulo");
        triangulorectangulo.setDefaultCloseOperation(EXIT_ON_CLOSE);


        triangulorectangulo.setVisible(true);  
        triangulorectangulo.setLayout(new GridLayout(3,2));
        labeltriangulh = new JLabel("ingrese altura");
        triangulorectangulo.getContentPane().add(labeltriangulh);
        n = new JTextField();
        triangulorectangulo.getContentPane().add(n);
        labeltriangulob = new JLabel("ingrese base");
        triangulorectangulo.getContentPane().add(labeltriangulob);
        l = new JTextField();
        triangulorectangulo.getContentPane().add(l);
        triangulorectangulo.getContentPane().add(botontriangulorectangulocalcular);


        botontriangulorectangulocalcular.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                botontriangulorectangulocalcular(e);
            }

        });
    }
    public static void botoncirculocalcular(ActionEvent e){
        float  a1 = Float.parseFloat(a.getText());
        Double  a2 = Math.PI*Math.pow(a1,2);
        double perimetroc =2*Math.PI*a1;
        JOptionPane.showMessageDialog(null,"El area es:"+a2+"  el perimetro es: "+perimetroc);
        }
    public static void botoncuadradocalcular(ActionEvent e){
        float  b1 = Float.parseFloat(b.getText());
        Double  b2 = Math.pow(b1,2);
        double perimetroc =b1*4;
        JOptionPane.showMessageDialog(null,"El area es: "+b2+" el perimetro es: "+perimetroc);
        }

    public static void botonrectangulocalcular(ActionEvent e){
        float  c1 = Float.parseFloat(c.getText());
        float  d1 = Float.parseFloat(d.getText());
        double c2 = c1*d1;
        double d2 = (2*c1)+(2*d1);
        JOptionPane.showMessageDialog(null,"El area es: "+c2+" el perimetro es: "+d2);
        }
    public static void botonrombocalcular(ActionEvent e){
        float  f1 = Float.parseFloat(f.getText());
        float  g1 = Float.parseFloat(g.getText());
        double a =Math.sqrt(Math.pow(f1/2, 2)+Math.pow(g1/2,2));
        double f2 =(f1*g1)/2;
        double g2 = 4*a;
        JOptionPane.showMessageDialog(null,"El area es: "+f2+" el perimetro es: "+g2);
        }
    public static void botontrapeciocalcular(ActionEvent e){
        float  h1 = Float.parseFloat(h.getText());
        float  i1 = Float.parseFloat(i.getText());
        float  j1 = Float.parseFloat(j.getText());
        float  k1 = Float.parseFloat(k.getText());
        float  m1 = Float.parseFloat(m.getText());
        double h2 = (h1+i1)/2*m1;
        double i2 = h1+i1+j1+k1;
        JOptionPane.showMessageDialog(null,"El area es: "+h2+" el perimetro es: "+i2);
        
        }
    public static void botontriangulorectangulocalcular(ActionEvent e){
        float  n1 = Float.parseFloat(n.getText());
        float  l1 = Float.parseFloat(l.getText());
        double n2 =(n1*l1)/2;
        double l2 =(Math.pow(n1*n1 + l1*l1, 0.5))+n1+l1;
        JOptionPane.showMessageDialog(null,"El area es: "+n2+" el perimetro es: "+l2);

        }
}
