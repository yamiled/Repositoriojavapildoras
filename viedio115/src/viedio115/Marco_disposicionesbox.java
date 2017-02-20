package viedio115;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Marco_disposicionesbox extends JFrame{
   
	
	public  Marco_disposicionesbox(){
		setBounds(200,300,200, 300);
		JPanel panel = new  JPanel();    
		JButton BotonGurardar  = new  JButton("Guardar");
		panel.add(BotonGurardar);
		add(panel);
		
	}
}
