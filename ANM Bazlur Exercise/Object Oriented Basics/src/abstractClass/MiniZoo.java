package abstractClass;

public class MiniZoo {

	private Animal[] animals;
	
	public MiniZoo(Animal[] animals)
	{
		this.animals=animals;
	}
	
	public void printDietsOfAnimal()
	{
		for(Animal animal: animals)
		{
			String diets= animal.getDiets();
			String name = animal.getClass().getSimpleName();
			
			System.out.println(name+ " eats "+ diets+".");
		}
	}
	
	public void printLegsOfAnimal()
	{
		for(Animal animal: animals)
		{
			int legs=animal.getLegs();
			String name = animal.getClass().getSimpleName();
			
			System.out.println(name+ " has "+legs+" legs.");
		}
	}
	
}
