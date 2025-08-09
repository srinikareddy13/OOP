package practical2;

public class StringImmutability {
	 public static void main(String[] args) {
	        String str = "Java";

	        System.out.println("Original String: " + str);

	        str.concat(" Programming");

	        System.out.println("After concat (without assignment): " + str);

	        String newStr = str.concat(" Programming");
	        System.out.println("After concat (with assignment): " + newStr);
	    }
}
