
public abstract class GameCharacter {

	private GuitarBehavior guitarBehavior;
	private SoloBehavior soloBehavior;
	public GameCharacter() {
	}
	
	public abstract void display();
	
	public void playSolo() {
		soloBehavior.Solo();
	}
	
	public void playGuitar() {
		guitarBehavior.Guitar();
	}

	public void setGuitarBehavior(GuitarBehavior gb) {
		guitarBehavior = gb;
	}
	
	public void setSoloBehavior(SoloBehavior sb) {
		soloBehavior = sb;
	}
	
}
