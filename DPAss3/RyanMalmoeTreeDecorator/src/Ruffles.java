
public class Ruffles extends TreeDecorations{
	Tree tree;
	public Ruffles(Tree tree)
	{
		this.tree = tree;
	}
	public String getDescription()
	{
		return tree.getDescription() + ", Ruffles";
	}
	public int cost()
	{
		return 1 + tree.cost();
	}
}
