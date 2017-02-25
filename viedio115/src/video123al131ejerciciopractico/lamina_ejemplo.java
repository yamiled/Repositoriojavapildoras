package video123al131ejerciciopractico;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JPanel;

public class lamina_ejemplo extends JPanel {
    
	public lamina_ejemplo() {
		// TODO Auto-generated constructor stub   
		  Graphics g1 = null;
		paintComponent(g1);
		
	}
	public  void paintComponent(Graphics g){
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rec = new  Rectangle2D.Double(0, 0,getWidth(), getHeight());
		//g2.setPaint(Color.YELLOW);
		//g2.fill(rec);
	}

}
