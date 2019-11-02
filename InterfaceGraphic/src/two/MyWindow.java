package two;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 

public class MyWindow extends JFrame implements ActionListener{
	//pour faire gestion des evenemnt il faut implementer ActionListener les button
	
	JLabel jL1 = new JLabel("nom:");
	JTextField jT1 = new JTextField(12);
	JButton jB1 = new JButton("Add");
	JButton jB2 = new JButton("Supp");
	
	List list1 = new List();
	List list2 = new List();

	
	public MyWindow() {
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout());
		jp1.add(jL1);
		jp1.add(jT1);	
		jp1.add(jB1);
		jp1.add(jB2);
		this.add(jp1, BorderLayout.NORTH);
  
 
		JPanel jp2 = new JPanel();
		jp2.setLayout( new GridLayout());
		jp2.add(list1);
		jp2.add(list2);
		
		jB1.addActionListener(this);
		jB2.addActionListener(this);
		
		//this is another way to do ActionListener
		//first remove the implementing of ActionnerLister
		//then add ur method with code 
		//jB1.addActionListener(new ActionListener());

	
		this.add(jp2, BorderLayout.CENTER);
		this.setBounds(10, 10, 500, 500);
		this.setVisible(true);
		
    
		
	}
 
	public static void main(String[] args) {
		new MyWindow();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jB1) {
			String s = jT1.getText();
			list1.add(s);
		}else if(e.getSource()==jB2) {
			int num = list1.getSelectedIndex();
			list1.remove(num);
		}
	}
	
}


