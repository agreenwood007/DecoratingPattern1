
public class LargeEgg extends IngredientMixer {

	public LargeEgg(Cookie newCookie) {
		super(newCookie);
		// TODO Auto-generated constructor stub
		System.out.println("Mix in 1 large egg");
	}
	
	public String getDescription() {
		return tempCookie.getDescription() + ", large egg";
		
	}
	
	public int getSteps() {
		
		
		return tempCookie.getSteps() + 1;
	}
}
