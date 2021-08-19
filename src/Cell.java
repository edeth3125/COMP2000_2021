import javax.swing.*;
import java.awt.*;
public class Cell {
    //Para
    int Y;
    int X;
    static int size = 35;
    
    //Contructor
    public Cell(int y, int x){
        Y = y;
        X = x;
    }

    public void drawCell(Graphics g) {
        g.drawRect(X,Y, size, size);
    }
}
