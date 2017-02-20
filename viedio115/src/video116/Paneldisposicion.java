package video116;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SpringLayout;

public class Paneldisposicion extends JPanel {

	

	public Paneldisposicion() {
		// TODO Auto-generated constructor stub
	
		JButton BotonGurardar  = new  JButton("Guardar");
		JButton BotonEnviar  = new  JButton("Enviar");
		JButton BotonCrear  = new  JButton("Crear");
		add(BotonCrear);
		add(BotonEnviar);
		add(BotonGurardar);
		JTable table = new  JTable();
		add(table);
		SpringLayout milayau = new  SpringLayout();
		setLayout(milayau);
		
	}

}
