package defaultPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelOperator extends Panneau {
	
	private JPanel operatorSubContainer;
	private JPanel operatorSubContainer2;
	private JButton equalButton;
	
	public JPanelOperator(){
		
		super();
	    this.setName("operators");
	    this.setBackground(Color.red);
	    
	    this.setPreferredSize(new Dimension(100,250));
	    this.setMinimumSize(new Dimension(100, 250));
	    this.setMaximumSize(new Dimension(100,250));
	    
	    this.operatorSubContainer = new JPanel();
	    this.operatorSubContainer.setName("operatorsSub");
	    this.operatorSubContainer.setBackground(Color.cyan);
	    this.operatorSubContainer.setPreferredSize(new Dimension(50,200));
	    this.operatorSubContainer.setMinimumSize(new Dimension(50, 200));
	    this.operatorSubContainer.setMaximumSize(new Dimension(50,200));
	    
	    this.operatorSubContainer.setLayout(new GridLayout(4, 1,10,10));
	    this.operatorSubContainer.add(new Bouton("/", "divide"));
	    this.operatorSubContainer.add(new Bouton("*", "multiplicate"));
	    this.operatorSubContainer.add(new Bouton("+", "add"));
	    this.operatorSubContainer.add(new Bouton("-", "sub"));
	    
	    this.add(this.operatorSubContainer);
	    
	    this.operatorSubContainer2 = new JPanel();
	    this.operatorSubContainer2.setName("operatorsSub2");
	    this.operatorSubContainer2.setBackground(Color.gray);
	    this.operatorSubContainer2.setPreferredSize(new Dimension(60,60));
	    this.operatorSubContainer2.setMinimumSize(new Dimension(60, 60));
	    this.operatorSubContainer2.setMaximumSize(new Dimension(60,60));
	    
	    this.equalButton = new Bouton("=", "equal");
	    this.equalButton.setPreferredSize(new Dimension(50,50));
	    this.equalButton.setMaximumSize(new Dimension(50,50));
	    this.equalButton.setMinimumSize(new Dimension(50,50));
	    this.equalButton.setBounds(5, 0, 50, 50);
	    this.operatorSubContainer2.setLayout(null);
	    this.operatorSubContainer2.add(this.equalButton);
	    
	    this.add(this.operatorSubContainer2);

	    
	}

	
}
