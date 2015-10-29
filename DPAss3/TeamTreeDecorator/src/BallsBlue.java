
public class BallsBlue extends TreeDecorations{
	Tree tree;
	public BallsBlue(Tree tree)
	{
		this.tree = tree;
	}
	public String getDescription()
	{
		return tree.getDescription() + ", Balls Blue";
	}
	public int cost()
	{
		return 2 + tree.cost();
	}
}
