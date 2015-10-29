
public class GameCharacterHendrix extends GameCharacter {

	public GameCharacterHendrix() {
		setGuitarBehavior(new FenderTelecaster());
		setSoloBehavior(new JumpOffStage());
	}
	
	public void display() {
		System.out.println("I'm Jimi Hendrix");
	}
}
