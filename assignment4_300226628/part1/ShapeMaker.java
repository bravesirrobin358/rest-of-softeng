/** Implementation of Facade design pattern 
*
* @author Yannick Vaillancourt
* @version 1.0 (07/09/22)
*/
public class ShapeMaker{
	/**Circle generated at the start*/
	private Shape circle;
	/**Rectangle generated at the start*/
	private Shape rectangle;
	/**Square generated at the start*/
	private Shape square;
	
	/**Constructor for ShapeMaker
	 * Generates a circle, rectangle and square
	 */
	public ShapeMaker(){
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	/**Executes draw method of generated rectangle.*/
	public void drawRectangle(){
		rectangle.draw();
	}
	/**Executes draw method of generated circle.*/
	public void drawCircle(){
		circle.draw();
	}
	/**Executes draw method of generated square.*/
	public void drawSquare(){
		square.draw();
	}
}