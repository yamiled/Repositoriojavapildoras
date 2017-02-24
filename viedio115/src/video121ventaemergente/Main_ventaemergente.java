package video121ventaemergente;
import javax.swing.*;

import java.awt.event.*;
public class Main_ventaemergente {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Cuadros_Dialogos mimarco=new Cuadros_Dialogos();
			
			mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			mimarco.setVisible(true);
		}
	}
	class Cuadros_Dialogos extends JFrame{
		public Cuadros_Dialogos(){
			setBounds (500,300,400,250);	
			add(new Lamina_Cuadros_Dialogos());	
		}	
	}
	class Lamina_Cuadros_Dialogos extends JPanel{
		
		public Lamina_Cuadros_Dialogos(){
			
			 boton1=new JButton("boton 1");
			
			 boton2=new JButton("boton2");
			
			 boton3=new JButton("boton3");
			 
			 boton4=new JButton("boton4");
			
			boton1.addActionListener(new Accion_botones());
			boton2.addActionListener(new Accion_botones());
			boton3.addActionListener(new Accion_botones());
			boton4.addActionListener(new Accion_botones());
			
			add(boton1);
			
			add(boton2);
			
			add(boton3);
			
			add(boton4);
			
		}
		private class Accion_botones implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub			
				if(e.getSource()==boton1){				
					JOptionPane.showConfirmDialog(null, "Mesaje de prueba");			
				    JOptionPane.showInternalMessageDialog(Lamina_Cuadros_Dialogos.this, "Segundo  dialogo", "Avertencia", 1);
				    JOptionPane.showMessageDialog(null, "Mensaje dialogo");
				}else if(e.getSource()==boton2){				
					JOptionPane.showConfirmDialog(Lamina_Cuadros_Dialogos.this, "Segundo  dialogo", "Avertencia",1);
                    JOptionPane.showInputDialog(null,"Ingrese dato", "Titulo aqui ", 2);
				}else if(e.getSource()==boton3){
					JOptionPane.showOptionDialog(Lamina_Cuadros_Dialogos.this, "Elige", "V de opciones", 1, 1, null, null, null);
								
				}else{
					
					System.out.println("Has pulsado el botón 4");				
				}			
			}		
			
		}	
		private JButton boton1, boton2, boton3, boton4;
	}