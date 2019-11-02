package two;

public class Calcul<U> {
	
	private U a;
	//generic methods 
	
	//this mehod recive generic T and manipulate it 
	public <T> boolean comparer(T a,T b) {
		//if(a instanceof String) return sth else return sthelse and so on 
		return a.equals(b);
	}

}
