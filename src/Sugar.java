
public class Sugar extends IngredientMixer {

	public Sugar(Cookie newCookie) {
		super(newCookie);
		// TODO Auto-generated constructor stub
		System.out.println("Mix in half cup of sugar");
	}
	
	public String getDescription() {
		return tempCookie.getDescription() + ", sugar";
		
	}
	
	public int getSteps() {
		
		
		return tempCookie.getSteps() + 1;
	}

}
