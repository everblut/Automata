

import java.awt.event.*;
import javax.swing.JCheckBox;

public class ButtonHandler implements ActionListener {

	private JCheckBox box;
	private Automata celular;
	private Cuadro cuadro;
	
	public ButtonHandler(Cuadro cuadro){
		box = cuadro.getCheckBox();
		this.cuadro = cuadro;
			
		celular = new Automata();
	}
	
	public void actionPerformed(ActionEvent e){
		cuadro.setVisible(false);
		cuadro.dispose();
		celular.PATRON_RANDOM = (box.isSelected())?true:false;
		celular.NUMERO_DE_REGLA = (e.getActionCommand() == "regla30")?30:0;
		celular.NUMERO_DE_REGLA = (e.getActionCommand() == "regla60")?60:celular.NUMERO_DE_REGLA;
		celular.NUMERO_DE_REGLA = (e.getActionCommand() == "regla90")?90:celular.NUMERO_DE_REGLA;
		celular.NUMERO_DE_REGLA = (e.getActionCommand() == "regla110")?110:celular.NUMERO_DE_REGLA;
		celular.NUMERO_DE_REGLA = (e.getActionCommand() == "regla184")?184:celular.NUMERO_DE_REGLA;
		celular.mostrar();
	}
	

}