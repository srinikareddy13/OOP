package skill_task1;

public class TypeConversion {
	  public static void main(String[] args) {
	        int num = 25;
	        Integer intObj = Integer.valueOf(num); 

	        double d = intObj.doubleValue(); 
	        System.out.println("Integer: " + intObj);
	        System.out.println("Converted to double: " + d);
	    }
}
