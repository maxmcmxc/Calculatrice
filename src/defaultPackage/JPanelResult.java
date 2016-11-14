package defaultPackage;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class JPanelResult extends Panneau {

	private JLabel labelResult;
	private JLabel operation;
	
	public JPanelResult(){
		
		super();
	    this.setName("result");
//	    this.setBackground(Color.blue);
	    
	    this.setPreferredSize(new Dimension(300,100));
	    this.setMinimumSize(new Dimension(300, 100));
	    this.setMaximumSize(new Dimension(300,100));
	    
	    this.labelResult = new JLabel("");
	    this.labelResult.setOpaque(true);
	    this.labelResult.setForeground(Color.BLACK);
	    Border border = BorderFactory.createLineBorder(Color.GRAY);
	    this.labelResult.setBorder(border);
	    this.labelResult.setBorder(new EmptyBorder(10, 10, 10, 10));
	    this.labelResult.setPreferredSize(new Dimension(280,50));
	    this.labelResult.setMinimumSize(new Dimension(280, 50));
	    this.labelResult.setMaximumSize(new Dimension(280,50));
//	    this.labelResult.setOpaque(true);
//	    this.labelResult.setBackground(Color.darkGray);
	    this.labelResult.setHorizontalAlignment(SwingConstants.RIGHT);
//	    this.labelResult.setBounds(x, y, 280, 50);
	    this.operation = new JLabel("");
	    this.operation.setForeground(Color.WHITE);
	    this.operation.setPreferredSize(new Dimension(280,30));
	    this.operation.setMinimumSize(new Dimension(280, 30));
	    this.operation.setMaximumSize(new Dimension(280,30));
//	    this.operation.setOpaque(true);
//	    this.operation.setBackground(Color.darkGray);
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
