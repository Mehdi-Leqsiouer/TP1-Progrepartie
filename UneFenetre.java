import java.awt.*;
import javax.swing.*;

class UneFenetre extends JFrame 
{
    UnMobile sonMobile;
    private final int LARG=400, HAUT=250;
    
    public UneFenetre()
    {    	
	// TODO 
	// ajouter sonMobile a la fenetre
    	super("TP1");
    	sonMobile = new UnMobile(LARG,HAUT);
    	this.add(sonMobile);
    	
	// creer une thread laThread avec sonMobile
    	
	// afficher la fenetre
    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	this.setSize(800,600);
    	this.setVisible(true);
	// lancer laThread 	
    }
}
