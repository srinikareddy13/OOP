package practical1;

public class Operators {
	public static void main(String[] args) {
        int a = 10, b = 5;
        //Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));
        //Relational Operators
        System.out.println("a == b: " + (a == b));
        System.out.println("a > b: " + (a > b));  
		//Logical Operators
        System.out.println("(a > 0) && (b < 10): " + ((a > 0) && (b < 10)));
        System.out.println("(a > 0) || (b < 3): " + ((a > 0) || (b < 3)));
}
}
