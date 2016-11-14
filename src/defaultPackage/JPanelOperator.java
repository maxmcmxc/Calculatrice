package defaultPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class JPanelOperator extends Panneau {
	
	private JPanel operatorSubContainer;
	private JPanel operatorSubContainer2;
	private JButton equalButton;
	
	public JPanelOperator(){
		
		super();
	    this.setName("operators");
//	    this.setBackground(Color.red);
	    this.setLayout(null);
	    
	    this.setPreferredSize(new Dimension(100,300));
	    this.setMinimumSize(new Dimension(100, 300));
	    this.setMaximumSize(new Dimension(100,300));
	    
	    this.operatorSubContainer = new Panneau();
	    this.operatorSubContainer.setName("operatorsSub");
//	    this.operatorSubContainer.setBackground(Color.cyan);
	    
	    this.add(this.operatorSubContainer);
	    
//	    this.operatorSubContainer.setLayout(null);
//	    this.operatorSubContainer.setAlignmentY(LEFT_ALIGNMENT);
//	    this.operatorSubContainer.setAlignmentX(LEFT_ALIGNMENT);
	    this.operatorSubContainer.setBounds(40, 5, 45, 190);
	    this.operatorSubContainer.setPreferredSize(new Dimension(40,200));
	    this.operatorSubContainer.setMinimumSize(new Dimension(40, 200));
	    this.operatorSubContainer.setMaximumSize(new Dimension(40,200));
//	    
	    GridLayout gl = new GridLayout(4, 1,0,10);
	    
	    this.operatorSubContainer.setLayout(gl);
	    this.operatorSubContainer.add(new Bouton("/", "divide"));
	    this.operatorSubContainer.add(new Bouton("*", "multiplicate"));
	    this.operatorSubContainer.add(new Bouton("+", "add"));
	    this.operatorSubContainer.add(new Bouton("-", "sub"));
	    	   
	    
	    
	    this.operatorSubContainer2 = new Panneau();
	    this.operatorSubContainer2.setName("operatorsSub2");
//	    this.operatorSubContainer2.setBackground(Color.gray);
	  
	    
	    this.add(this.operatorSubContainer2);
	    
	    this.operatorSubContainer2.setBounds(40, 215, 45, 45);
//	    this.operatorSubContainer2.setPreferredSize(new Dimension(100,60));
//	    this.operatorSubContainer2.setMinimumSize(new Dimension(100, 60));
//	    this.operatorSubContainer2.setMaximumSize(new Dimension(100,60));
	    
	    
	    this.equalButton = new Bouton("=", "equal");
	    this.equalButton.setPreferredSize(new Dimension(45,40));
	    this.equalButton.setMaximumSize(new Dimension(45,40));
	    this.equalButton.setMinimumSize(new Dimension(45,40));
//	    this.equalButton.setBounds(0, 0, 90, 90);
	    
	    this.operatorSubContainer2.add(this.equalButton);
	    
	    

	    
	}

	
}
