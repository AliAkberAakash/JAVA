package abstractClass;

public class MiniZooTest {
	public static void main(String[] args)
	{
		Animal[] animals = new Animal[2];
		animals[0]=new Tiger(4);
		animals[1]=new Chicken(2);
		
		MiniZoo minizoo = new MiniZoo(animals);
		
		minizoo.printDietsOfAnimal();
		minizoo.printLegsOfAnimal();
		
	}

}
