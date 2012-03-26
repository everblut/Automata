import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Cuadro extends JFrame{
	
    private JButton[] Botones;
    private JCheckBox checkBox;
    private ButtonHandler handler;
	
	public Cuadro(){
		setTitle("Automata");
    	setSize(400,200);
    	setResizable(false);
    	setLayout(null);
    	Botones = new JButton[5];
    	checkBox = new JCheckBox("Seleccionar primer patron al azar?");
    	handler = new ButtonHandler(this);
    	preparar(); 
	}
	public JCheckBox getCheckBox(){
		return checkBox;
	}
	 public void preparar(){
	    	checkBox.setBounds(110, 70, 300, 40);
	    	add(checkBox);
	    	
	     	Botones[0] = new JButton("regla30");
	     	Botones[0].setBounds(10,20,95,30);
	     	Botones[0].setActionCommand("regla30");
	     	Botones[0].addActionListener(handler);
	    	add(Botones[0]);
	     	
	     	Botones[1] = new JButton("regla90");
	     	Botones[1].setBounds(105,20,95,30);
	    	Botones[1].setActionCommand("regla90");
	    	Botones[1].addActionListener(handler);
	    	add(Botones[1]);
	    	
	     	Botones[2] = new JButton("regla110");
	     	Botones[2].setBounds(200,20,95,30);
	    	Botones[2].setActionCommand("regla110");
	    	Botones[2].addActionListener(handler);
	    	add(Botones[2]);
	    	
	     	Botones[3] = new JButton("regla150");
	     	Botones[3].setBounds(290,20,95,30);
	    	Botones[3].setActionCommand("regla150");
	    	Botones[3].addActionListener(handler);
	      	add(Botones[3]);
	      	
	      	Botones[4] = new JButton("regla184");
	     	Botones[4].setBounds(10,70,95,30);
	    	Botones[4].setActionCommand("regla184");
	    	Botones[4].addActionListener(handler);
	      	add(Botones[4]);
	    }
	 
	 public void mostrar(){
	    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	setLocationRelativeTo(null);
	    	setVisible(true);
	 }
	 public static void main(String[] args){
		 new Cuadro().mostrar();
	 
	 }
}
