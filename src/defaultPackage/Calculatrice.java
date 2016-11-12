package defaultPackage;
import javax.swing.JFrame;

public class Calculatrice {
	
	private static JFrame fenetre;

  public static void main(String[] args){       

    fenetre = new Fenetre();
    fenetre.setVisible(true);

  }

public static JFrame getFenetre() {
	return fenetre;
}       

}