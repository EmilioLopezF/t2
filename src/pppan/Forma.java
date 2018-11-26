package pppan;
import java.awt.*;

public abstract class Forma {
    public Forma(){
        
    }
    abstract void paint(Graphics g);
}


class Circulo extends Forma{
    int x,y,radio;
    Color c;
    AlmacenColor ac;
    Circulo(int x, int y, int radio,AlmacenColor ac){
        this.x = x;
        this.y = y;
        this.radio = radio;
        this.ac = ac;
    }
    @Override
    void paint(Graphics g) {      
        g.setColor(ac.getColor());        
        g.fillOval(x,y, radio, radio);
    }
}

class Triangulo extends Forma{
    AlmacenColor c;
    Point p1 = new Point (550,50);
    Point p2 = new Point(750,230);
    Point p3 = new Point(550,250);
    int[] posx = { p1.x, p2.x, p3.x };
    int[] posy = { p1.y, p2.y, p3.y }; 
    Polygon triangle = new Polygon(posx, posy, 3);
    
    public Triangulo( AlmacenColor c){
        this.c = c;
    }
 
    @Override
    void paint(Graphics g) {
        g.setColor(c.getColor());
        g.fillPolygon(triangle);
    }
}

class Rectangulo extends Forma{
    private int x,y;
    private final int dx;
    private final int dy;
    AlmacenColor a;
    public Rectangulo(int x, int y,  AlmacenColor a){
        this.x = x;
        this.y = y;
        this.dx = 200;
        this.dy= 150;
        this.a = a;
    }
    @Override
    void paint(Graphics g) {
        g.setColor(a.getColor());
        g.fillRect(x,y, dx, dy);
    }
}
