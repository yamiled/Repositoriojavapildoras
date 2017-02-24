package video116;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.Spring;
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
		Spring muelle = Spring.constant(0, 10, 100);
		Spring muellerigido = Spring.constant(10);
        milayau.putConstraint(SpringLayout.WEST, BotonCrear, muelle, SpringLayout.WEST, this);
        milayau.putConstraint(SpringLayout.WEST, BotonGurardar, muellerigido, SpringLayout.EAST, BotonCrear );
        milayau.putConstraint(SpringLayout.WEST, BotonEnviar, muellerigido, SpringLayout.EAST, BotonGurardar );
        milayau.putConstraint(SpringLayout.EAST,this, muelle, SpringLayout.EAST, BotonEnviar );
	}
}
