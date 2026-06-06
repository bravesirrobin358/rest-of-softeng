import java.util.List;
import java.util.ArrayList;
/** Implementation of criteria that filters whatever is female. 
*
* @author Yannick Vaillancourt
* @version 1.0 (07/09/22)
*/
public class CriteriaFemale implements Criteria{
	/** Returns List of persons that are female
	 * @param persons List of persons to be filtered
	 * @return Newly-filtered List of persons 
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons){
		List<Person> femalePersons = new ArrayList<Person>();

		for(Person person : persons){
			if(person.getGender().equalsIgnoreCase("FEMALE")){
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}
}