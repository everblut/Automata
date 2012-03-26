import javax.swing.*;

public class Automata extends JFrame{

    public static final int SIZE_X = 1000;
    public static final int SIZE_Y = 700;
    private Lienzo lienzo;

    public Automata(){
	setTitle("Automata");
	setSize(SIZE_X,SIZE_Y);
	setResizable(false);
	lienzo = new Lienzo(SIZE_X,SIZE_Y);
	add(lienzo);
	lienzo.setBounds(0,0,0,0);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
    }
    public void mostrar(){
	setVisible(true);
    }
    public static void main(String[] args){
	Automata x = new Automata();
	x.mostrar();
    }
}