package video123al131ejerciciopractico;

import java.awt.GridLayout;
import java.security.acl.Group;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

public class Panel_pratica extends JPanel{
	private JRadioButton radio;
   	private ButtonGroup grupo=null;
   	private ButtonModel miboton;
    
   	public Panel_pratica(String  titulo , String[] opciones) {
		// TODO Auto-generated constructor stub	
	setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
	setLayout(new  BoxLayout(this,BoxLayout.Y_AXIS));
	grupo = new  ButtonGroup();
    for(int i =0;i<opciones.length;i++)
    {
    	radio= new JRadioButton(opciones[i]);
    	radio.setActionCommand(opciones[i]);
    
    	add(radio);
    	grupo.add(radio);
    	radio.setSelected(i==0);
    }    
}
	
	public String dameseleccion(){
        miboton=grupo.getSelection();
        String s = miboton.getActionCommand();
        return s;
	}
   
	public ButtonGroup damegrupo(){
    	
    	return grupo;
    	
    }
}
