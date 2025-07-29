package skill_task1;

public class TypeCastingWithWrapper {
	 public static void main(String[] args) {
	        double d = 99.99;
	        Double doubleObj = Double.valueOf(d); 

	        int num = doubleObj.intValue();
	        System.out.println("Double: " + doubleObj);
	        System.out.println("Casted to int: " + num);
	    }
}
