
public class GameCharacterSlash extends GameCharacter {

	public GameCharacterSlash() {
		setGuitarBehavior(new GibsonSG());
		setSoloBehavior(new GuitarOnFire());
	}
	
	public void display() {
		System.out.println("I'm Slash");
	}
}
