package ua.lviv.secondTask;

public class Student extends Person {

    private final String TYPE_PERSON="Student";
    public Student(String name) {
	super.name = name;
	System.out.println(TYPE_PERSON);
    }
    @Override
    public void print() {
	System.out.println("I am "+super.name);
	
    }

    
}
