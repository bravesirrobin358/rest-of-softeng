import java.util.List;

/** Implementation of criteria that filters whatever doesn't meet both criteria specified. 
*
* @author Yannick Vaillancourt
* @version 1.0 (07/09/22)
*/
public class AndCriteria implements Criteria{
	/**First criteria specified*/
	private Criteria criteria;
	/**Second criteria specified*/
	private Criteria otherCriteria;
	/**Constructor for AndCriteria
	 * @param criteria First criteria specified
	 * @param otherCriteria Second criteria specified
	 */
	public AndCriteria(Criteria criteria, Criteria otherCriteria){
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	/** Returns List of persons that meet both criteria
	 * @param persons List of persons to be filtered
	 * @return Newly-filtered List of persons 
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons){
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}
}