package defaultPackage;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Bouton extends JButton implements MouseListener {

	private String label;
	private String value;
	
	public Bouton(String label, String value){
		
		super(label);
		
		this.label = label;
		this.value = value;
		
		this.addMouseListener(this);
				
	}

    /**
     * Invoked when the mouse button has been clicked (pressed
     * and released) on a component.
     */
    public void mouseClicked(MouseEvent e){
    	
    	if(this.value.equals("reset")){
    		Calcul.reset();
    	}
    	else{
    	Calcul.calcul(this.label,this.value, ((JPanel)this.getParent()).getName());
    	}
    };

    /**
     * Invoked when a mouse button has been pressed on a component.
     */
    public void mousePressed(MouseEvent e){
   
    	
    };

    /**
     * Invoked when a mouse button has been released on a component.
     */
    public void mouseReleased(MouseEvent e){};

    /**
     * Invoked when the mouse enters a component.
     */
    public void mouseEntered(MouseEvent e){};

    /**
     * Invoked when the mouse exits a component.
     */
    public void mouseExited(MouseEvent e){};
}
	