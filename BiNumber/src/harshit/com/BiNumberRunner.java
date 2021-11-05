package harshit.com;

public class BiNumberRunner {

	public static void main(String[] args) {
		
		BiNumber value = new BiNumber(4,5);
		
		
		System.out.printf("Addition of value is "+ value.add()).println();
		
		System.out.println("Multiplication of value is "+ value.multiplication());
		
		
	
		value.doubleValue();
		
		System.out.println("Double of the given values are "+ value.getX() + " & " + value.getY());
		System.out.println(value.getX());
		System.out.println(value.getY());
	
	
	}

}
