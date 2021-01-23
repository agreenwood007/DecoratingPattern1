
public class Butter extends IngredientMixer {

	public Butter(Cookie newCookie) {
		super(newCookie);
		// TODO Auto-generated constructor stub
		
		System.out.println("Mix in half cup of butter");
	}
	
	public String getDescription() {
		return tempCookie.getDescription() + ", butter";
		
	}
	
	public int getSteps() {
		
		return tempCookie.getSteps() + 1;
	}

}
