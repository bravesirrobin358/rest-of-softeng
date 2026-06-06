/** Implementation of Factory design pattern 
*
* @author Yannick Vaillancourt
* @version 1.0 (07/09/22)
*/
public class ShapeFactory{
	/** Generates specified shape type
	 * @param shapeType Specified shape to be generated
	 * @return Newly-created, specified shape. Otherwise, null. 
	 */
	public Shape getShape(String shapeType){
		if(shapeType == null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		} else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		return null;
	}
}