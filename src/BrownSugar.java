
public class BrownSugar extends IngredientMixer {

	public BrownSugar(Cookie newCookie) {
		super(newCookie);
		// TODO Auto-generated constructor stub
		System.out.println("Mix in forth cup brown sugar");
		
	}
	
	public String getDescription() {
		return tempCookie.getDescription() + ", brown sugar";
		
	}
	
	public int getSteps() {
		
		
		return tempCookie.getSteps() + 1;
	}

}
