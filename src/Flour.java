
public class Flour extends IngredientMixer {

	public Flour(Cookie newCookie) {
		super(newCookie);
		// TODO Auto-generated constructor stub
		System.out.println("Mix in 1.75 cups all purpose flour");
	}
	public String getDescription() {
		return tempCookie.getDescription() + ", all purpose flour";
		
	}
	
	public int getSteps() {
		
		
		return tempCookie.getSteps() + 1;
	}
}
