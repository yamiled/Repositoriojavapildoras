package video123al131ejerciciopractico;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Enumeration;

import javax.accessibility.Accessible;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public class Contralarseleccion implements ActionListener {
     private Marco_Pratica marco;
	 private  String  mensaje = "este es el mensaje ";
	 private Icon ico =new  ImageIcon("src/video123al131ejerciciopractico/azul.jpg");
     private Object fecha = new Date();
     private Component compenente =new  lamina_ejemplo();
     
	 public Contralarseleccion(Marco_Pratica s) {
		// TODO Auto-generated constructor stub
	    this.marco= s;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		   if(marco.getPaneltipo().dameseleccion().equals("Mensaje") ){
			        Object o = verificar();
			    	JOptionPane.showMessageDialog(marco, o, "Titulo",0);
			   
		   }else if(marco.getPaneltipo().dameseleccion().equals("Confirmar"))
		   {
			   JOptionPane.showConfirmDialog(marco, "Mensaje", "Titulo", 0,0);		   
		   }else if(marco.getPaneltipo().dameseleccion().equals("Entrada")){
			   JOptionPane.showInputDialog(marco, "Mensaje", "Titulo", 0);
			   
		   }else if(marco.getPaneltipo().dameseleccion().equals("Opciones")){
		   
			   JOptionPane.showOptionDialog(marco, "Mensaje", null, 0,0,null,null,null);
		   }
	}

	
	   public  Object verificar(){
		ButtonGroup grupo = marco.getPanelmensaje().damegrupo();
		String selecion;
		int pos =1;
		Object[] vec = new Object[marco.getPanelmensaje().damegrupo().getButtonCount()]; 
		  vec[0]= mensaje;
		  vec[1]= ico;
		  vec[2]= fecha;	  
		for(int i=1; i<marco.getPanelmensaje().damegrupo().getButtonCount(); i++)
		{   
			JRadioButton r = (JRadioButton)grupo.getElements().nextElement();
           System.out.print(grupo.getElements().nextElement().getActionCommand());
		//  if(marco.getPanelmensaje().dameseleccion().equals(grupo.getElements().nextElement().getActionCommand()))
			// {
			//  selecion=  marco.getPanelmensaje().dameseleccion();
		    //  pos=i;
		     // break;
			// }
		} 
		Enumeration<AbstractButton> Enumeration = grupo.getElements();
		while( Enumeration.hasMoreElements() ) {
		System.out.println( Enumeration.nextElement().getActionCommand() );
	}
		System.out.print(pos);
		return vec[pos];
}
}
