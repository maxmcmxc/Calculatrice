package defaultPackage;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class JPanelResult extends Panneau {

	private JLabel labelResult;
	private JLabel operation;
	
	public JPanelResult(){
		
		super();
	    this.setName("result");
	    this.setBackground(Color.blue);
	    
	    this.setPreferredSize(new Dimension(300,100));
	    this.setMinimumSize(new Dimension(300, 100));
	    this.setMaximumSize(new Dimension(300,100));
	    
	    this.labelResult = new JLabel("blabla");
	    this.labelResult.setForeground(Color.RED);
	    Border border = BorderFactory.createLineBorder(Color.BLACK);
	    this.labelResult.setBorder(border);
	    this.labelResult.setPreferredSize(new Dimension(250,50));
	    this.labelResult.setMinimumSize(new Dimension(250, 50));
	    this.labelResult.setMaximumSize(new Dimension(250,50));
	    this.labelResult.setOpaque(true);
	    this.labelResult.setBackground(Color.darkGray);
	    this.labelResult.setHorizontalAlignment(SwingConstants.RIGHT);
	    
	    this.operation = new JLabel("aaaa");
	    this.operation.setForeground(Color.CYAN);
	    this.operation.setPreferredSize(new Dimension(250,30));
	    this.operation.setMinimumSize(new Dimension(250, 30));
	    this.operation.setMaximumSize(new Dimension(250,30));
	    this.operation.setOpaque(true);
	    this.operation.setBackground(Color.darkGray);
	    this.operation.setHorizontalAlignment(SwingConstants.CENTER);
	    
//	    this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
	    
	    this.add(this.operation);
	    this.add(this.labelResult);
			
	}

	public JLabel getLabelResult() {
		return labelResult;
	}
	
	public void displayResult(String result){
		
		this.labelResult.setText(result);
		
	}

	public JLabel getOperation() {
		return operation;
	}
	
	
	
}
