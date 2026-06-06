import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CriteriaPatternDemoTest {
	List<Person> persons = new ArrayList<Person>();
	List<Person> personsMale = new ArrayList<Person>();
	List<Person> personsSingle = new ArrayList<Person>();
	List<Person> personsFemaleSingle = new ArrayList<Person>();
	CriteriaMale male = new CriteriaMale();
	CriteriaFemale female = new CriteriaFemale();
	CriteriaSingle single = new CriteriaSingle();


	@Test
	public void testPersonsFemaleSingle() {
		AndCriteria singleFemale = new AndCriteria(single, female);
		persons = new ArrayList<Person>();
		personsFemaleSingle = new ArrayList<Person>();
		persons.add(new Person("Robert","Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));
		
		personsFemaleSingle.add(new Person("Diana", "Female", "Single"));
		assertEquals(CriteriaPatternDemo.printPersons(personsFemaleSingle), CriteriaPatternDemo.printPersons(singleFemale.meetCriteria(persons)));
	}
	
	@Test
	public void testPersonsMale() {
		persons = new ArrayList<Person>();
		personsMale = new ArrayList<Person>();
		persons.add(new Person("Robert","Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));
		
		personsMale.add(new Person("Robert","Male", "Single"));
		personsMale.add(new Person("John", "Male", "Married"));
		personsMale.add(new Person("Mike", "Male", "Single"));
		personsMale.add(new Person("Bobby", "Male", "Single"));
		assertEquals(CriteriaPatternDemo.printPersons(personsMale), CriteriaPatternDemo.printPersons(male.meetCriteria(persons)));
	}

	@Test
	public void testPersonsSingle() {
		persons = new ArrayList<Person>();
		personsSingle = new ArrayList<Person>();
		persons.add(new Person("Robert","Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));
		
		personsSingle.add(new Person("Robert","Male", "Single"));
		personsSingle.add(new Person("Diana", "Female", "Single"));
		personsSingle.add(new Person("Mike", "Male", "Single"));
		personsSingle.add(new Person("Bobby", "Male", "Single"));
		assertEquals(CriteriaPatternDemo.printPersons(personsSingle), CriteriaPatternDemo.printPersons(single.meetCriteria(persons)));
	}

}
