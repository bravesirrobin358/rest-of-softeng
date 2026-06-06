import java.util.List;
import java.util.ArrayList;
/** Implementation of criteria that filters whatever is male. 
*
* @author Yannick Vaillancourt
* @version 1.0 (07/09/22)
*/
public class CriteriaMale implements Criteria{
	/** Returns List of persons that are male
	 * @param persons List of persons to be filtered
	 * @return Newly-filtered List of persons 
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons){
		List<Person> malePersons = new ArrayList<Person>();

		for(Person person : persons){
			if(person.getGender().equalsIgnoreCase("MALE")){
				malePersons.add(person);
			}
		}
		return malePersons;
	}
}