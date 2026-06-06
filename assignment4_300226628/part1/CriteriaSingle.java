import java.util.List;
import java.util.ArrayList;
/** Implementation of criteria that filters whatever is single. 
*
* @author Yannick Vaillancourt
* @version 1.0 (07/09/22)
*/
public class CriteriaSingle implements Criteria{
	
	/** Returns List of persons that are single
	 * @param persons List of persons to be filtered
	 * @return Newly-filtered List of persons 
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons){
		List<Person> singlePersons = new ArrayList<Person>();

		for(Person person : persons){
			if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}
}