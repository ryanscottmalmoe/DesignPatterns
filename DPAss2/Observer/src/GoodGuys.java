
public class GoodGuys {
	private int hobbits;
	private int elves;
	private int dwarves;
	private int men;
	
	public GoodGuys(int hobbits, int elves, int dwarves, int men)
	{
		this.setHobbits(hobbits);
		this.setElves(elves);
		this.setDwarves(dwarves);
		this.setMen(men);
	}
	

	public int getHobbits() {
		return hobbits;
	}

	public void setHobbits(int hobbits) {
		this.hobbits = hobbits;
	}


	public int getElves() {
		return elves;
	}


	public void setElves(int elves) {
		this.elves = elves;
	}


	public int getDwarves() {
		return dwarves;
	}


	public void setDwarves(int dwarves) {
		this.dwarves = dwarves;
	}


	public int getMen() {
		return men;
	}


	public void setMen(int men) {
		this.men = men;
	}
}
