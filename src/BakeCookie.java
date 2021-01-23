
public class BakeCookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cookie basicCookie = new Butter(new Sugar(new BrownSugar(new Vanilla(new LargeEgg(new Flour(new BakingSoda(new Salt(new ChocolateChips(new PlainCookie())))))))));

		System.out.println("Ingredients: " + basicCookie.getDescription());
		System.out.println("Steps Taken: " + basicCookie.getSteps());
		System.out.println("Now bake in the oven at 350 degrees Fahrenheit for 40 minutes.");
		System.out.println("Enjoy!");
	}

}
