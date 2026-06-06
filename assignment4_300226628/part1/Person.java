/** Person with 3 attributes: their name, gender (male or female), and marital status (single or married)  
*
* @author Yannick Vaillancourt
* @version 1.0 (07/09/22)
*/
public class Person{
	/**Person's name*/
	private String name;
	/**Person's gender*/
	private String gender;
	/**Person's marital status*/
	private String maritalStatus;

	/**Constructor for Person
	 * 
	 * @param name Person's name
	 * @param gender Person's gender
	 * @param maritalStatus Person's marital status
	 */
	public Person(String name, String gender, String maritalStatus){
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	/**name getter
	 * 
	 * @return name
	 */
	public String getName(){
		return name;
	}
	/**gender getter
	 * 
	 * @return gender
	 */
	public String getGender(){
		return gender;
	}
	/**marital status getter
	 * 
	 * @return marital status
	 */
	public String getMaritalStatus(){
		return maritalStatus;
	}
}