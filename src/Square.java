
public class Square extends Rectangle 
{
	private double sideLength;
	
	public Square(String id, double size)
	{
		super(id, size, size);
		this.sideLength = size;
		
		sideLengths.add(size);
	}
	
	public String getShapeType()
	{
		return "Square";
	}
}
