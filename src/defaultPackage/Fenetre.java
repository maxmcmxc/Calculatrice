package defaultPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;

public class Fenetre extends JFrame {

	private JButton bouton = new JButton("Mon bouton");
	
	private JPanel result;
	private JPanel numbers;
	private JPanel operators;
	
	private JPanel container;
	
  public Fenetre(){

    this.setTitle("Calculatrice");
    this.setSize(310, 400);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    this.setBackground(new ColorUIResource(238,238,238));

    this.result = new JPanelResult();
    
    this.numbers = new JPanelNumber();
    
    this.operators = new JPanelOperator();
    
    this.container = new JPanelContainer();
    
    this.container.setBackground(Color.BLACK);
    
////  g.fillOval(20, 20, 75, 75);
////  Graphics2D g2d = (Graphics2D)g;         
//  GradientPaint gp = new GradientPaint(0, 0, Color.RED, 30, 30, Color.cyan, true);                
//  g2d.setPaint(gp);
//  g2d.fillRect(0, 0, this.getWidth(), this.getHeight()); 
    
    
    
    
    this.container.setPreferredSize(new Dimension(310,400));
    this.container.setMinimumSize(new Dimension(310, 400));
    this.container.setMaximumSize(new Dimension(310,400));
    container.add(result, BorderLayout.NORTH);
    container.add(numbers, BorderLayout.WEST);
    container.add(operators, BorderLayout.EAST);
    
    //Position on JFrame
    this.getContentPane().add(container);

    this.setVisible(true);
    pack();

  }
  
//	public void paintComponent(Graphics g){
//		
//		super.paintComponent(g);
//		System.out.println("Je suis exécutée !"); 
////    g.fillOval(20, 20, 75, 75);
////    Graphics2D g2d = (Graphics2D)g;         
////    GradientPaint gp = new GradientPaint(0, 0, Color.RED, 30, 30, Color.cyan, true);                
////    g2d.setPaint(gp);
////    g2d.fillRect(0, 0, this.getWidth(), this.getHeight()); 
////    this.setBackground(Color.GRAY);
//   
//  }

public JPanel getResult() {
	return result;
}
 

}