
public class BadGuy implements Observer, DisplayElement{

	EyeOfSauron eye;
	String name;
	public BadGuy(EyeOfSauron eye, String name)
	{
		this.eye = eye;
		this.name = name;
		eye.registerObserver(this);
	}
	public void update(GoodGuys guys)
	{
		display(guys);
	}
	public void defeated()
	{
		eye.removeObserver(this);
	}
	
	public void display(GoodGuys guys)
	{
		System.out.println("Notifying : " + name + " of " + guys.getHobbits() + " hobbits, " + guys.getElves() + " elves " + guys.getDwarves() + " dwarves " +  guys.getMen() + " men");       
	}
}
