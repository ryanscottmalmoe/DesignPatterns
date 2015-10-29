//Ryan Malmoe
public class Students {
	private String name;
	private int id;
	
	public Students(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public int getId()
	{
		return this.id;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String toString()
	{
		return "Student ID: " + this.getId() + " Student Name: " + this.getName();
	}
}
