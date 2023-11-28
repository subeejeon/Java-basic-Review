package review01Java;

public class Main {
	public static void main(String[] args) {

	//1. Create an array of Person objects.
	Person[] people = new Person[3];
	
	//2. Populate the array with different Person instances.	
	Person people1 = new Person("A",10);
	Person people2 = new Person("B",20);
	Person people3 = new Person("C",30);
	//2-1. sAdd an objects
	people[0] = people1;
	people[1] = people2;
	people[2] = people3;
	//3. Print details of each person
	for(Person person : people) {
		Person.PrintPersonDetails(person);
		}
	
	Person.findOldestPerson(people);
	}
}