import javax.swing.*;
import java.awt.*;

public class Grid {
    Cell[][] cells;
    
    //Contructor
    public Grid(){
        createGrid();
    }

    public void createGrid(){
        cells = new Cell[20][20];
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j] = new Cell(10 + i * 35, 10 + j * 35);
            }
        }
    }
    public void drawGrid(Graphics g){
        for (Cell[] col: cells){
            for (Cell c: col){
                c.drawCell(g);
            }
        }
    }
}
