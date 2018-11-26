package pppan;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class PanelDibujo extends JPanel {
    ArrayList al;
    AlmacenColor ac;

    public PanelDibujo(AlmacenColor ac){
        al = new ArrayList();
        this.setBackground(Color.LIGHT_GRAY);
        this.ac = ac;
        Forma c = new Circulo(250,50,200,ac); //xcor,ycor,rad
        al.add(c);
        Forma r = new Rectangulo(10,70,ac);
        al.add(r);
        Forma t = new Triangulo(ac);
        al.add(t);
    }
    
    public void paint(Graphics g){
        super.paint(g); //usa el paint de JPanel
        Forma aux;
        for(int i=0; i < al.size() ; i++){
            aux = (Forma)al.get(i);
            aux.paint(g);
        }
        
    }

    
    
}