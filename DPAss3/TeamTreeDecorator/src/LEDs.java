
public class LEDs extends TreeDecorations{
	Tree tree;
	public LEDs(Tree tree)
	{
		this.tree = tree;
	}
	public String getDescription()
	{
		return tree.getDescription() + ", LEDs";
	}
	public int cost()
	{
		return 10 + tree.cost();
	}
}
