import java.util.List;
import java.util.ArrayList;
/** Usage of Filter design pattern 
*
* @author Yannick Vaillancourt
* @version 1.0 (07/09/22)
*/
public class CriteriaPatternDemo {
	/** creates list of persons and test various filtering operations*/
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Robert","Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));
		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleMale = new AndCriteria(single, male);
		Criteria singleOrFemale = new OrCriteria(single, female);
		System.out.println("Males: ");
		System.out.println(printPersons(male.meetCriteria(persons)));
		System.out.println("\nFemales: ");
		System.out.println(printPersons(female.meetCriteria(persons)));
		System.out.println("\nSingle Males: ");
		System.out.println(printPersons(singleMale.meetCriteria(persons)));
		System.out.println("\nSingle Or Females: ");
		System.out.println(printPersons(singleOrFemale.meetCriteria(persons))); 
	}
	/** prints list of persons, and displays each persons attributes
	 * 
	 * @param persons the List of persons to print
	 * @return personList String representation of list of persons.
	 */
	public static String printPersons(List<Person> persons){
		String personList = "";
		for (Person person : persons) {
			personList += ("Person : [ Name : " + person.getName() + ", Gender : " +
			person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]\n"); 
		} 
		return personList;
	} 
}