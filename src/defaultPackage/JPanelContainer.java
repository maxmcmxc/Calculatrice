package defaultPackage;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class JPanelContainer extends JPanel { 

	
	public JPanelContainer(){
		
//		this.setBackground(null);
		
		
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
//    g.fillOval(20, 20, 75, 75);
    Graphics2D g2d = (Graphics2D)g;         
    GradientPaint gp = new GradientPaint(0, 0, Color.black, 300, 400, Color.gray, true);                
    g2d.setPaint(gp);
    g2d.fillRect(0, 0, this.getWidth(), this.getHeight()); 
//    this.setBackground(Color.GRAY);
   
  }
	
	
 
	
}