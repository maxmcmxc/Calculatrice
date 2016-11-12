package defaultPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame {

	private JButton bouton = new JButton("Mon bouton");
	
	private JPanel result;
	private JPanel numbers;
	private JPanel operators;
	
  public Fenetre(){

    this.setTitle("Calculatrice");
    this.setSize(600, 400);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             

    //JPanel
//    JPanel pan = new Panneau();
//    CardLayout cl = new CardLayout();
//    pan.setLayout(cl);
//    JPanel card1 = new JPanel();
//    card1.setBackground(Color.blue);        
//    JPanel card2 = new JPanel();
//    card2.setBackground(Color.red);     
//    JPanel card3 = new JPanel();
//    card3.setBackground(Color.green);
    
//    pa

    this.result = new JPanelResult();
    
    this.numbers = new JPanelNumber();
    
    this.operators = new JPanelOperator();
    

    
   //JButton Listener
//    JButton bouton = new JButton("Contenu suivant");
//    //Définition de l'action du bouton
//    bouton.addActionListener(new ActionListener(){
//      public void actionPerformed(ActionEvent event){
//        //Via cette instruction, on passe au prochain conteneur de la pile
//        cl.next(pan);
//      }
//    });
    
    //Position on JFrame
    this.getContentPane().add(result, BorderLayout.NORTH);
    this.getContentPane().add(numbers, BorderLayout.CENTER);
    this.getContentPane().add(operators, BorderLayout.EAST);
    
    //On ajoute le bouton au content pane de la JFrame
//    for(int i=1;i<10;i++){
//    	this.getContentPane().add(new JButton(String.valueOf(i)));
//    }
//    this.getContentPane().add(new JButton(""));
//    this.getContentPane().add(new JButton("0"));
//    this.getContentPane().add(new JButton(""));
    
    //On prévient notre JFrame que notre JPanel sera son content panel
//    this.setContentPane(pan);               

    this.setVisible(true);
    pack();
    

  }

public JPanel getResult() {
	return result;
}
 

}