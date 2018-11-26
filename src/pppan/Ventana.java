package pppan;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ventana extends JFrame {
    PanelDibujo p;
    AlmacenColor ac;
    public Ventana(){
        this.setLayout(new BorderLayout());
        ac =  new AlmacenColor();
        p = new PanelDibujo(ac);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add( p ,BorderLayout.CENTER);
       
        JPanel ctrls = new JPanel();
        ctrls.setLayout(new GridLayout(2,1));
        ctrls.setBackground(Color.LIGHT_GRAY);
        this.add(ctrls,BorderLayout.SOUTH);
        
        
        JPanel jp2 = new JPanel(); jp2.setBackground(Color.yellow); 
        BotonColor r = new BotonColor("rojo",Color.red);
        BotonColor b = new BotonColor("azul",Color.blue);
        BotonColor g = new BotonColor("negro",Color.black);
        jp2.add(r);
        jp2.add(g);
        jp2.add(b);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r);
        bg.add(g);
        bg.add(b);
        
        
        JPanel jp3 = new JPanel(); 
        jp3.setBackground(Color.red);
        BotonA a = new BotonA(":')");
        jp3.add(a);
        
        ctrls.add(jp2);
        ctrls.add(jp3);
               
        this.setSize(800,400);
        this.setVisible(true); 

    }

    
    private class BotonA extends JButton implements ActionListener{
        BotonA(String nom){
            super(nom);                     //Le paso el string a la superclass
            this.addActionListener(this); 
        }
        public void actionPerformed(ActionEvent ae){
            System.out.println(" :) :) :) :) :) :) :( :) :)");
        }
    }
    private class BotonColor extends JRadioButton implements ActionListener{
        Color c;
        BotonColor(String nom, Color c){
            super(nom);
            this.c = c;
            this.addActionListener(this); 
        }
        public void actionPerformed(ActionEvent ae){
            System.out.println(c);
            ac.setColor(c);         //Quiero pasarle este color al circulo para que se pinte
            p.repaint();
        }
    }
    
}

