import java.util.List;
/** Abstraction of Criteria
*
* @author Yannick Vaillancourt
* @version 1.0 (07/09/22)
*/
public interface Criteria{
	/** Returns List of persons that meet the specified criteria
	 * @param persons List of persons to be filtered
	 * @return Newly-filtered List of persons 
	 */
	public List<Person> meetCriteria(List<Person> persons);
}