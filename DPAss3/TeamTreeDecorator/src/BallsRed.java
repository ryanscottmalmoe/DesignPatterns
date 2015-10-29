
public class BallsRed extends TreeDecorations{
	Tree tree;
	public BallsRed(Tree tree)
	{
		this.tree = tree;
	}
	public String getDescription()
	{
		return tree.getDescription() + ", Balls Red";
	}
	public int cost()
	{
		return 1 + tree.cost();
	}
}
