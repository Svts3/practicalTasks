package ua.lviv.firstTask;

public class Dog implements Animal {

   
    @Override
    public String voice() {
	return "Woof";
    }
    @Override
    public String feed() {
	return "The dog is eating";
    }
}
