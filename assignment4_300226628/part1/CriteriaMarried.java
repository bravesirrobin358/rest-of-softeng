import java.util.List;
import java.util.ArrayList;
/** Implementation of criteria that filters whatever is married. 
*
* @author Yannick Vaillancourt
* @version 1.0 (07/09/22)
*/
public class CriteriaMarried implements Criteria{
	/** Returns List of persons that are married
	 * @param persons List of persons to be filtered
	 * @return Newly-filtered List of persons 
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons){
		List<Person> marriedPersons = new ArrayList<Person>();

		for(Person person : persons){
			if(person.getMaritalStatus().equalsIgnoreCase("MARRIED")){
				marriedPersons.add(person);
			}
		}
		return marriedPersons;
	}
}