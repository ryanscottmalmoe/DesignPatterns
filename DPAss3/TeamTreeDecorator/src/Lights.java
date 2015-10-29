
public class Lights extends TreeDecorations{
	Tree tree;
	public Lights(Tree tree)
	{
		this.tree = tree;
	}
	public String getDescription()
	{
		return tree.getDescription() + ", Lights";
	}
	public int cost()
	{
		return 5 + tree.cost();
	}
}
