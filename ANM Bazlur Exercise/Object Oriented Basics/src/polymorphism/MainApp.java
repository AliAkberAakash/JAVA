package polymorphism;

public class MainApp {

	public static void main(String[] args) {
		
		CoffeeCup myCup = new CoffeeCup();
		
		Liquid genericLiquid = new Liquid();
		Coffee coffee = new Coffee();
		Milk milk = new Milk();
		
		myCup.addLiquid(genericLiquid);
		myCup.addLiquid(coffee);
		myCup.addLiquid(milk);
	}

}
