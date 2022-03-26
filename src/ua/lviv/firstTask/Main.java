package ua.lviv.firstTask;



public class Main {

    public static void main(String[] args) {

	Animal[]animals = new Animal[] {new Dog(),new Dog(),new Cat()};
	
	for(Animal i:animals) {
	    System.out.println(i.voice());
	    System.out.println(i.feed());
	}

    }

}
