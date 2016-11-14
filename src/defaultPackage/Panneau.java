package defaultPackage;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panneau extends JPanel { 

	
	public Panneau(){
		
		this.setBackground(null);
		this.setOpaque(false);
		
		
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		System.out.println("Je suis exécutée !"); 
//    g.fillOval(20, 20, 75, 75);
//    Graphics2D g2d = (Graphics2D)g;         
//    GradientPaint gp = new GradientPaint(0, 0, Color.RED, 30, 30, Color.cyan, true);                
//    g2d.setPaint(gp);
//    g2d.fillRect(0, 0, this.getWidth(), this.getHeight()); 
//    this.setBackground(Color.GRAY);
   
  }
 
	
}