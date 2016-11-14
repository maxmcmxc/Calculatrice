package defaultPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class JPanelNumber extends Panneau {
	
	private JPanel numberSub;
	
	public JPanelNumber(){
		
		super();
	    this.setName("numbers");
//	    this.setBackground(Color.YELLOW);
	    this.setPreferredSize(new Dimension(200,300));
	    this.setMinimumSize(new Dimension(200, 300));
	    this.setMaximumSize(new Dimension(200,300));
	    
	    this.numberSub = new Panneau();
	    this.numberSub.setName("numbers");
//	    this.numberSub.setBackground(Color.BLACK);
	    this.numberSub.setPreferredSize(new Dimension(180,260));
	    this.numberSub.setMinimumSize(new Dimension(180, 260));
	    this.numberSub.setMaximumSize(new Dimension(180,260));
	    
	    this.numberSub.setLayout(new GridLayout(4, 3, 10, 10));
	    for(int i=1;i<10;i++){ 	
	    	this.numberSub.add(new Bouton(String.valueOf(i),String.valueOf(i)));
	    }
	    this.numberSub.add(new Bouton("AC","reset"));
	    this.numberSub.add(new Bouton("0","0"));
	    this.numberSub.add(new Bouton(".","."));
			
	    this.add(numberSub);
	}

	
}
