
public class Salt extends IngredientMixer {

	public Salt(Cookie newCookie) {
		super(newCookie);
		// TODO Auto-generated constructor stub
		System.out.println("Mix in half TSP salt");
	}
	public String getDescription() {
		return tempCookie.getDescription() + ", salt";
		
	}
	
	public int getSteps() {
		
		
		return tempCookie.getSteps() + 1;
	}
}
