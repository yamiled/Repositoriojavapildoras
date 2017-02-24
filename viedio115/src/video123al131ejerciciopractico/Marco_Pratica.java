package video123al131ejerciciopractico;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import video119disposicionlibre.Paneldisposicionlibre;
public class Marco_Pratica extends JFrame {
private Panel_pratica paneltipo;
   private Panel_pratica paneltipomensaje,panelmensaje, panelconfirmar, panelopcion, panelentrada;
   private JPanel panelCaja;
   private JPanel panelBoton;
   private JButton botonmostrar;
   
   public Marco_Pratica() {
		// TODO Auto-generated constructor stub
		setBounds(500,200,600, 450);
		setTitle("Marco  Principal");
		setLayout(new  BorderLayout());
		panelCaja= new JPanel();
		panelBoton =  new JPanel();
		botonmostrar = new  JButton("Mostrar");
		panelBoton.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Contenedor de Boton"));
		panelCaja.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Contenedor de Cajas"));
		panelCaja.setLayout(new  GridLayout(2, 3));
		panelBoton.add(botonmostrar);
		add(panelCaja, BorderLayout.CENTER);
		add(panelBoton, BorderLayout.SOUTH);
		crearcajas();
		botonmostrar.addActionListener(new Contralarseleccion(this));
		
   }
   
   
   public void  crearcajas(){
	   String[] opciones = {"Mensaje", "Confirmar", "Opciones",  "Entrada"};
	   paneltipo = new  Panel_pratica("Tipo", opciones);

	   paneltipomensaje = new  Panel_pratica("Tipo de Mensaje", new  String[] {
			   "ERROR_MESSAGE","INFORMATION_MESSAGE", "QUESTION_MESSAGE","PLAIN_MESSAGE"
	   });

	   panelmensaje = new  Panel_pratica("Mensaje", new  String[] {
			   "Cadena","Icono", "Componete","Otros", "Objetos[]"
	   });

	   panelconfirmar = new  Panel_pratica("Confirmar", new  String[] {
			   "DEFAULT_OPTION","YES_NO_OPTION", "YES_NO_CANCEL_OPTION","OK_CANCEL_OPTION"
	   });

	   panelopcion = new  Panel_pratica("Opcion", new  String[] {
			   "String[]","Icon[]", "Object[]"   	    	});

	   panelentrada = new  Panel_pratica("Entrada", new  String[] {
			   "Campo de Texo","Combo"
	   });
	   panelCaja.add(paneltipo);
	   panelCaja.add(paneltipomensaje);
	   panelCaja.add(panelmensaje);
	   panelCaja.add(panelconfirmar);
	   panelCaja.add(panelopcion);
	   panelCaja.add(panelentrada);
       
   }
     
   public Panel_pratica getPaneltipo() {
		return paneltipo;
	}


	public void setPaneltipo(Panel_pratica paneltipo) {
		this.paneltipo = paneltipo;
	}


	public Panel_pratica getPaneltipomensaje() {
		return paneltipomensaje;
	}


	public void setPaneltipomensaje(Panel_pratica paneltipomensaje) {
		this.paneltipomensaje = paneltipomensaje;
	}


	public Panel_pratica getPanelmensaje() {
		return panelmensaje;
	}


	public void setPanelmensaje(Panel_pratica panelmensaje) {
		this.panelmensaje = panelmensaje;
	}


	public Panel_pratica getPanelconfirmar() {
		return panelconfirmar;
	}


	public void setPanelconfirmar(Panel_pratica panelconfirmar) {
		this.panelconfirmar = panelconfirmar;
	}


	public Panel_pratica getPanelopcion() {
		return panelopcion;
	}


	public void setPanelopcion(Panel_pratica panelopcion) {
		this.panelopcion = panelopcion;
	}


	public Panel_pratica getPanelentrada() {
		return panelentrada;
	}


	public void setPanelentrada(Panel_pratica panelentrada) {
		this.panelentrada = panelentrada;
	}
}
