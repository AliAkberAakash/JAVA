package inheritence;

public class Animaltest {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal animal = new Animal();
		
		cat.eat();
		cat.sleep();
		((Cat)cat).meaw();
		
		
		dog.eat();
		dog.sleep();
		//cat.Meaw();
		
		//swapping
		animal=cat;
		cat=dog;
		dog=animal;
		
		//cat.getLifeSpan();
		//dog.getLifeSpan();

	}

}
