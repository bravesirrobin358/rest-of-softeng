/** Usage of Factory design pattern 
*
* @author Yannick Vaillancourt
* @version 1.0 (07/09/22)
*/
public class FactoryPatternDemo{
	/** creates ShapeFactory Object, then generate each shape and draw each shape*/
	public static void main(String[] args){
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape shape1 = shapeFactory.getShape("CIRCLE");

		shape1.draw();

		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		shape2.draw();

		Shape shape3 = shapeFactory.getShape("SQUARE");

		shape3.draw();
	}
}