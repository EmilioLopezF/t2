package pppan;
import java.awt.*;
public class AlmacenColor {
    Color c;
    AlmacenColor(){
        c = Color.lightGray;
    }
    public void setColor(Color c){
        this.c = c;
        System.out.println("1");
    }
    public Color getColor(){
        return c;
    }
}