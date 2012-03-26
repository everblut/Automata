import java.awt.*;
import java.awt.geom.*;

public class Lienzo extends Canvas{

    private Boolean[][] area;
    private Color color;
    private BasicStroke stroke;
    private Graphics2D g2;

    public Lienzo(int x,int y){
	setSize(x,y);
	stroke = new BasicStroke();
	area = new Boolean[x][y];
	area = Regla30.primerPatron(area);
    }

    public void paint(Graphics g){
    	g2 = (Graphics2D) g;
    	g2.setStroke(stroke);
	for(int y = 0; y < Automata.SIZE_Y; y++){
	    if(y != 0){
	    	area = Regla30.evalua(area,y-1);
	    }
	    for(int x = 0; x <Automata.SIZE_X; x++){
		  color = (area[x][y] == true)?Color.WHITE:Color.BLACK;
		  g2.setPaint(color);
		  g2.draw(new Line2D.Float(x, y, x, y));
	    }
	}
    }

}

