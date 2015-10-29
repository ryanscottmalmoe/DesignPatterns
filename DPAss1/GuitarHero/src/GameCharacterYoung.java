public class GameCharacterYoung extends GameCharacter {

	public GameCharacterYoung() {
		setGuitarBehavior(new GibsonFlyingV());
		setSoloBehavior(new SmashTheGuitar());
	}
	
	public void display() {
		System.out.println("I'm Angus Young");
	}
}
