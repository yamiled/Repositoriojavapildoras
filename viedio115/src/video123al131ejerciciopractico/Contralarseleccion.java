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
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public class Contralarseleccion implements ActionListener {
     private Marco_Pratica marco;
	 private  String  mensaje = "este es el mensaje ";
	 private Icon ico1 =new  ImageIcon("src/video123al131ejerciciopractico/azul.jpg");
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
			        //Object o = verificar();
			    	JOptionPane.showMessageDialog(marco ,verificar(), "Titulo",devuleveicono());
			   
		   }else if(marco.getPaneltipo().dameseleccion().equals("Confirmar"))
		   {
			   JOptionPane.showConfirmDialog(marco, verificar(), "Titulo", devuleveconfimar(),devuleveicono());		   
		   }else if(marco.getPaneltipo().dameseleccion().equals("Entrada")){
			   
			   if(marco.getPanelentrada().dameseleccion().equals("Combo"))
			   JOptionPane.showInputDialog(marco, verificar(), "Titulo", devuleveicono(), null, new String[]{"Azul","Amarillo","Rojo"},"Azul");
			   else{
				   JOptionPane.showInputDialog(marco, verificar(), "Titulo", devuleveicono());
			   }   
		   }else if(marco.getPaneltipo().dameseleccion().equals("Opciones")){   
			   JOptionPane.showOptionDialog(marco, verificar(), null, 0,devuleveicono(),null,opcion(),null);
		   }
	}

	   public  int devuleveicono(){
			ButtonGroup grupo = marco.getPaneltipomensaje().damegrupo();
			int i =0;
			Enumeration<AbstractButton> Enumeration = grupo.getElements();	
			while(Enumeration.hasMoreElements() ) {	
				if(marco.getPaneltipomensaje().dameseleccion().equals(Enumeration.nextElement().getActionCommand()))
					{
					if(i==4)
						return -1;
					else return i;
					}
				i++;
			}
			return -1;
	   }
	   public  Object verificar(){
		ButtonGroup grupo = marco.getPanelmensaje().damegrupo();
		int pos =0;
		int i =0;
		Object[] vec = new Object[5]; 
		  vec[0]= mensaje;
		  vec[1]= ico1;
		  vec[2]= new  JButton("Boton");
		  vec[3]= fecha;
		Enumeration<AbstractButton> Enumeration = grupo.getElements();	
		while(Enumeration.hasMoreElements() ) {	
			if(marco.getPanelmensaje().dameseleccion().equals(Enumeration.nextElement().getActionCommand()))
				{
				  pos=i;  
				  break; 
				}
		     	i++;
		}
	    if(pos!=4)
		return vec[pos];
	    else 
	    	return vec;
	   }  
	   public  int devuleveconfimar(){
			ButtonGroup grupo = marco.getPanelconfirmar().damegrupo();
			int i =-1;
			Enumeration<AbstractButton> Enumeration = grupo.getElements();	
			while(Enumeration.hasMoreElements() ) {	
				if(marco.getPanelconfirmar().dameseleccion().equals(Enumeration.nextElement().getActionCommand()))
					{			
					 return i;
					}
				i++;
	   }
			return -1;
	   }
	   
	   
	   public  Object[] opcion(){

		   if(marco.getPanelopcion().dameseleccion().equals("String[]"))	   
			{
			  return new String[]{"Amarillo", "Azul", "Rojo"}; 
			}
		   else if(marco.getPanelopcion().dameseleccion().equals("Icon[]"))	   
			{
			  return new Icon[]{ico1, ico1, ico1}; 
			}else if(marco.getPanelopcion().dameseleccion().equals("Object[]"))	   
			{
				  return new Object[]{mensaje, ico1, new JButton(), fecha}; 
			}
		   
		   return null;
	   }
	   
}
