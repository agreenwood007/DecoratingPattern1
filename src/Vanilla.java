
public class Vanilla extends IngredientMixer {

	public Vanilla(Cookie newCookie) {
		super(newCookie);
		// TODO Auto-generated constructor stub
		System.out.println("Mix in 2 TSP vanilla extract");
	}
	
	public String getDescription() {
		return tempCookie.getDescription() + ", vanilla extract";
		
	}
	
	public int getSteps() {
		
		
		return tempCookie.getSteps() + 1;
	}
}
