
public class BakingSoda extends IngredientMixer {

	public BakingSoda(Cookie newCookie) {
		super(newCookie);
		// TODO Auto-generated constructor stub
		System.out.println("Mix in half TSP baking soda");
	}
	public String getDescription() {
		return tempCookie.getDescription() + ", baking soda";
		
	}
	
	public int getSteps() {
		
		
		return tempCookie.getSteps() + 1;
	}
}
