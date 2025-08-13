package skill_task6;

public class EncapsulationAndConstructors {
	   private String name;
	    private int age;

	    public EncapsulationAndConstructors(String n, int a) {
	        name = n;
	        age = a;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public static void main(String[] args) {
	        EncapsulationAndConstructors obj = new EncapsulationAndConstructors("Srinika", 18);
	        System.out.println("Name: " + obj.getName());
	        System.out.println("Age: " + obj.getAge());
	    }
}
