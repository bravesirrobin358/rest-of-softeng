import java.util.List;

/** Implementation of criteria that filters whatever doesn't meet either criteria specified. 
*
* @author Yannick Vaillancourt
* @version 1.0 (07/09/22)
*/
public class OrCriteria implements Criteria{
	/**First criteria specified*/
	private Criteria criteria;
	/**Second criteria specified*/
	private Criteria otherCriteria;
	
	/**Constructor for OrCriteria
	 * @param criteria First criteria specified
	 * @param otherCriteria Second criteria specified
	 */
	public OrCriteria(Criteria criteria, Criteria otherCriteria){
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	/** Returns List of persons that meet either criteria
	 * @param persons List of persons to be filtered
	 * @return Newly-filtered List of persons 
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons){
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		List<Person> secondCriteriaPersons = otherCriteria.meetCriteria(persons);
		for(Person person: secondCriteriaPersons){
			if(!firstCriteriaPersons.contains(person)){
				firstCriteriaPersons.add(person);
			}
		}
		return firstCriteriaPersons;
	}
}