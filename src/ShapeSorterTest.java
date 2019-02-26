import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for ShapeSorter.
 * Implicitly tests that the comparators are implemented correctly.
 *
 * @author Stephen/Braden
 * @version 2019-02-18
 */
public class ShapeSorterTest
{
	/**
	 * Test that shapes are added correctly.
	 */
	@Test
	public void AddShapeTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);

		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(3), d);
	}

	/**
	 * Tests sorting via the default ordering.
	 */
	@Test
	public void SortShapesDefaultTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 4, 6); // Area = 24.0, Perimeter = 20.0
		Shape b = new EquilateralTriangle("test2", 4); // Area = 6.9282, Perimeter = 12.0
		Shape c = new Rectangle("test3", 2, 12); // Area = 24.0, Perimeter = 28.0
		Shape d = new Circle("test4", 1.5); // Area = 7.0686, Perimeter = 9.4248
		
		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		sorter.sortShapes();
		
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(0), b);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(1), d);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(2), a);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(3), c);
		
	}

	/**
	 * Tests sorting by area ordering.
	 */
	@Test
	public void SortShapesAreaTest()
	{
		// TODO: complete this...
	}

	/**
	 * Tests sorting by perimeter ordering.
	 */
	@Test
	public void SortShapesPerimeterTest()
	{
		// TODO: complete this...
	}

	/**
	 * Tests the toString.
	 */
	@Test
	public void ToStringTest()
	{
		// TODO: complete this...
	}
}
