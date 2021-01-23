
public abstract class IngredientMixer implements Cookie {
	
	protected Cookie tempCookie;
	
	public IngredientMixer(Cookie newCookie) {
		
		tempCookie = newCookie;
	}
	
	public String getDescription() {
		
		return tempCookie.getDescription();
	}
	
	public int getSteps() {
		
		return tempCookie.getSteps();
	}

}
