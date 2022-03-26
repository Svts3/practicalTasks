package ua.lviv.secondTask;

public class Teacher extends Staff {

    private final String TYPE_PERSON="Teacher";
    public Teacher(String name, int salary) {
	super(name,salary);
	System.out.println(TYPE_PERSON);
	// TODO Auto-generated constructor stub
    }

    @Override
    public int salary() {
	// TODO Auto-generated method stub
	return super.salary;
    }
    @Override
    public void print() {
	System.out.println("I am "+super.name);
    }

   

}
