public class GuitarHero {
    public static void main(String[] args) {
        GameCharacter player1 = new GameCharacterSlash();
        GameCharacter player2 = new GameCharacterHendrix();
        GameCharacter player3 = new GameCharacterYoung();

        player1.display();
        player1.playGuitar();
        player1.playSolo();
        player2.display();
        player2.playGuitar();
        player2.playSolo();
        player3.display();
        player3.playGuitar();
        player3.playSolo();
        
        player1.setGuitarBehavior(new FenderTelecaster());
        player2.setGuitarBehavior(new GibsonFlyingV());
        player3.setGuitarBehavior(new GibsonSG());
        player1.setSoloBehavior(new JumpOffStage());
        player2.setSoloBehavior(new SmashTheGuitar());
        player3.setSoloBehavior(new GuitarOnFire());
        
        System.out.println("\nAfter switched behaviors\n");
        
        player1.display();
        player1.playGuitar();
        player1.playSolo();
        player2.display();
        player2.playGuitar();
        player2.playSolo();
        player3.display();
        player3.playGuitar();
        player3.playSolo();
        
    }
}

