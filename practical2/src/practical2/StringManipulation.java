package practical2;

public class StringManipulation {
	 public static void main(String[] args) {
	        String str = "Java Programming";

	        System.out.println("Length: " + str.length());

	        System.out.println("Uppercase: " + str.toUpperCase());

	        System.out.println("Lowercase: " + str.toLowerCase());

	        System.out.println("Character at index 5: " + str.charAt(5));

	        System.out.println("Substring from index 5: " + str.substring(5));

	        System.out.println("After replacing: " + str.replace("Java", "Python"));

	        System.out.println("Contains 'Pro'? " + str.contains("Pro"));
	    }
}
