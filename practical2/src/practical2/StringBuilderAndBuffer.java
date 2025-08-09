package practical2;

public class StringBuilderAndBuffer {
	public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");   
        sb.replace(0, 5, "Hi"); 
        sb.delete(2, 3); 
        System.out.println("StringBuilder result: " + sb);

        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" Programming");
        sbf.reverse(); 
        System.out.println("StringBuffer result: " + sbf);
    }
}
