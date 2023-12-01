package review01Java;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//1. Create an array of Person objects.
	Person[] people = new Person[3];

	//2-2. Add an objects
	for(int i=0; i<people.length;i++) {
		people[i] = new Person(sc.next(), sc.nextInt());
	}
	
	//3. Print details of each person
	for(Person person : people) {
		Person.PrintPersonDetails(person);
			}
	System.out.println("=========");
	Person.findOldestPerson(people); //null
	
	System.out.println("=========");
	Person.firstYoungestPerson(people);

	}	
}