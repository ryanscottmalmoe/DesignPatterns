
public class Ribbons extends TreeDecorations{
	Tree tree;
	public Ribbons(Tree tree)
	{
		this.tree = tree;
	}
	public String getDescription()
	{
		return tree.getDescription() + ", Ribbons";
	}
	public int cost()
	{
		return 2 + tree.cost();
	}
}
