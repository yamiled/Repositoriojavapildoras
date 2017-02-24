package video119disposicionlibre;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class Paneldisposicionlibre extends JPanel implements LayoutManager{
	private JTable miTabla2;
	
	public Paneldisposicionlibre() {
		// TODO Auto-generated constructor stub
	   
	   setLayout(this); // hay que colocar esto  para poder hacer disposicion libre
       JLabel labelnombre = new JLabel("nombre");
       JLabel labelapellido = new JLabel("Apellido");
       JTextField txtnombre = new  JTextField();
       JTextField txtapellido = new  JTextField();
       JLabel labeledad = new JLabel("Edad");
       JTextField txtedad = new  JTextField();
       add(labelnombre);
       add(txtnombre);
       add(labelapellido);
       add(txtapellido);
       add(labeledad);
       add(txtedad);
	}
	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void layoutContainer(Container parent) {
		// TODO Auto-generated method stub
		int x , y = 20;
		int d = parent.getWidth();
		x=d/2 - d/2 + 120;
		int  contador = 0;
		int n= parent.getComponentCount();
		  
		 for(int i =0; i<n;i++){
			 contador++;
			 Component c = parent.getComponent(i);
			 c.setBounds(x-100, y, 100, 20);
			  x+=120;
			 if(contador%2==0)
			 {	 
				 x=d/2 - d/2 + 120;
			     y+=60;
			 }
			 	 
			 
		 }
	}
	
}
