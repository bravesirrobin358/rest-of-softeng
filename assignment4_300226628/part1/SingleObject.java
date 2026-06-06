/** Implementation of Singleton design pattern 
*
* @author Yannick Vaillancourt
* @version 1.0 (07/09/22)
*/
public class SingleObject{
	/** Container for the only generated instance of SingleObject*/
	private static SingleObject instance = new SingleObject();
	/**Constructor for SingleObject*/
	private SingleObject(){};
	/** Generates specified shape type
	 * @return Single instance of generated SingleObject
	 */
	public static SingleObject getInstance(){
		return instance;
	}
	/** Displays "Hello World" */
	public void showMessage(){
		System.out.println("Hello World");
	}
}