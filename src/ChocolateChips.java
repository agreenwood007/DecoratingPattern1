
public class ChocolateChips extends IngredientMixer {

	public ChocolateChips(Cookie newCookie) {
		super(newCookie);
		// TODO Auto-generated constructor stub
		System.out.println("Mix in 1 cup of chocolate chips");
	}
	public String getDescription() {
		return tempCookie.getDescription() + ", chocolate chips";
		
	}
	
	public int getSteps() {
		
		
		return tempCookie.getSteps() + 1;
	}
}
