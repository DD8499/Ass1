package geekster1;
			
public class A {

	public static void main(String args[]) {
		// for non static method
		B obj = new B();
		obj.sum(5,6);
		// for static method
		B.add(7,9);
		
}
	
}

