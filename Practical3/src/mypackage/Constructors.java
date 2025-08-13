package mypackage;

public class Constructors {
	String name;
    int age;

    Constructors(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Constructors student = new Constructors("Srinika", 20);
        student.display();
    }
}
