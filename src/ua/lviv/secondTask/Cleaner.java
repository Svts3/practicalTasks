package ua.lviv.secondTask;

public class Cleaner extends Staff{

    private final String TYPE_PERSON="Cleaner";
    public Cleaner(String name, int salary) {
	super(name,salary);
	System.out.println(TYPE_PERSON);
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
