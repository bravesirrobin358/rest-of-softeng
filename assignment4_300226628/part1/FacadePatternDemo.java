/** Usage of Facade design pattern 
*
* @author Yannick Vaillancourt
* @version 1.0 (07/09/22)
*/
public class FacadePatternDemo{
	/** Creates ShapeMaker and executes its three draw(Shape) methods*/
	public static void main(String[] args){
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}