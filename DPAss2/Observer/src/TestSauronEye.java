public class TestSauronEye 
{
	public static void main(String[] args) 
	{
		
				EyeOfSauron eye = new EyeOfSauron();
				BadGuy saruman = new BadGuy(eye, "Saruman");
				BadGuy witchKing = new BadGuy(eye, "Witch King");
				GoodGuys goodGuyGroup1 = new GoodGuys(1, 1, 2, 0);
				GoodGuys goodGuyGroup2 = new GoodGuys(4, 2, 2, 100);

				eye.setEnemies(goodGuyGroup1);
				saruman.defeated();
				eye.setEnemies(goodGuyGroup2);
				BadGuy bad = new BadGuy(eye, "BaddestBadGuyOfTheBadGuys");
				eye.setEnemies(new GoodGuys(2, 0, 50, 3));
                HeroArray []
                //eye.setEnemies(new Heros(heroArray));
				bad.defeated();
				eye.notifyObservers();
	}//end main

}//end class
