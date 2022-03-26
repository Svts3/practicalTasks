package ua.lviv.secondTask;


public class Main {

    public static void main(String[] args) {

	Person[] personArray = new Person[] { new Student("Henry"), new Teacher("Andrew", 800),
		new Cleaner("Steven", 650),new Student("Kate"),new Cleaner("Donald",540) };

	for (Person i : personArray) {
	    if(i.getClass()==Student.class) {
		i.print();		
		System.out.println();
	    }
	    else{
		i.print();
		System.out.println("Salary: "+((Staff) i).salary());
		System.out.println();
	    }
	    
	}

    }

}
