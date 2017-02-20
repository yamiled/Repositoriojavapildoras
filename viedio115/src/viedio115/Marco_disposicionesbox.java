package viedio115;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Marco_disposicionesbox extends JFrame{
   
	
	public  Marco_disposicionesbox(){		
		setBounds(400,300,400, 300);
		setTitle("Disposiosicin de caja");
		JButton BotonGurardar  = new  JButton("Guardar");
		JButton BotonEnviar  = new  JButton("Enviar");
       
		JLabel lnombre =new JLabel("Nombre");
        JTextField txtnombre = new  JTextField(10);
        txtnombre.setMaximumSize(txtnombre.getPreferredSize());
        Box  caja1= Box.createHorizontalBox();
        caja1.add(lnombre);
        caja1.add(Box.createHorizontalStrut(25));
        caja1.add(txtnombre);
        //add(caja1);
        
        JLabel lnombre1 =new JLabel("Apellido");
        JTextField txtnombre1 = new  JTextField(10);
        txtnombre1.setMaximumSize(txtnombre1.getPreferredSize());
        Box  caja2= Box.createHorizontalBox();
        caja2.add(lnombre1);
        caja2.add(Box.createHorizontalStrut(25));
        caja2.add(txtnombre1);
        //add(caja2);
        
        Box caja3 = Box.createHorizontalBox();
        caja3.add(BotonEnviar);
        caja3.add(Box.createGlue());
        caja3.add(BotonGurardar);
       // add(caja3);
        
        Box cajavertical = Box.createVerticalBox();
        cajavertical.add(caja1);
        cajavertical.add(caja2);
        cajavertical.add(caja3);
        add(cajavertical, BorderLayout.CENTER);
        
        
		
	}
}
