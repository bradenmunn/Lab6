
public class Square extends Rectangle 
{
	private double sideLength;
	
	public Square(String id, double size)
	{
		super(id, size, size);
		this.sideLength = size;
		
		//Note: Side lengths added to list through super constructor using the Rectangle constructor
	}
	
	public String getShapeType()
	{
		return "Square";
	}
}
