package app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;

public class Presentation3Spring {

	public static void main(String[] args) {
 
		//for this app we must create applicationContext.xml file
		//inject spring jar files in src with any file name
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
	
		IMetier metier = (IMetier) context.getBean("metier");
		System.out.println(metier.calcul());
		

	}

}
