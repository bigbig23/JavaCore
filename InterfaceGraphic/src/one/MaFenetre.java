package one;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MaFenetre extends JFrame {
	

	
	
	JLabel jL1 = new JLabel("nom:");
	JTextField jT1 = new JTextField(12);
	JButton jB1 = new JButton("Add");
	JButton jB2 = new JButton("Supp");
	
	List liste1 = new List();
	List liste2 = new List();
	
	public MaFenetre() {
		//close the app after i press X , othewise,it will not be closee wihout this line
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		// BorderLayout() means to divide the MaFentre in 5 zones, west,east,south,north and the center
		this.setLayout(new BorderLayout());
		//create a panel , in which i gonna put the components
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout()); //means all i want to put in my layer is centered
		jp1.add(jL1);
		jp1.add(jT1);
		jp1.add(jB1);
		jp1.add(jB2);
		this.add(jp1,BorderLayout.NORTH);
		//
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout()); //if it's the same wih pj1, it will erase it, so it must be different
		//if u put one add, it will divide in one, and put two add, it will divide into 2 and so on
		jp2.add(liste1);
		jp2.add(liste2); 
		
		this.add(jp2,BorderLayout.CENTER); //now it's centered
		
		//the dimension of mafenetre
		this.setBounds(10, 10, 500, 500);
		this.setVisible(true);//show maFentre
		
		
	}
	
}

	
	


