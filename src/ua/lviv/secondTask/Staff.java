package ua.lviv.secondTask;

public abstract class Staff extends Person {

    protected int salary;
    public Staff(String name,int salary) {
	this.name = name;
	this.salary = salary;
    }


    public abstract int salary();

   
}
