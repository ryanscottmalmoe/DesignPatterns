
public class Star extends TreeDecorations{
	Tree tree;
	public Star(Tree tree)
	{
		this.tree = tree;
	}
	public String getDescription()
	{
		return this.tree.getDescription() + ", a Star";
	}
	public int cost()
	{
		return 4 + this.tree.cost();
	}
}
