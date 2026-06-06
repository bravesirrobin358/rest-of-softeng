/** Usage of Factory design pattern 
*
* @author Yannick Vaillancourt
* @version 1.0 (07/09/22)
*/
public class SingletonPatternDemo{
	/** Displays message from only SingleObject 
	 * 
	 * @param args default main parameter
	 */
	public static void main(String[] args){
		SingleObject object = SingleObject.getInstance();

		object.showMessage();
	}
}