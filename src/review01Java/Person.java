package review01Java;

import java.util.Arrays;

class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	static void PrintPersonDetails(Person people) {
		System.out.println("Name is: " + people.name + ", age is: " + people.age);
	}	
	
	// 4. Write a static method (findOldestPerson) that takes an array of Person objects 
	// as a parameter and returns the Person object with the highest age.
	static Person findOldestPerson(Person[] people) {
		Person oldestPerson = people[0];
		for(int i=1; i<people.length; i++) {
			if(people[i].age > oldestPerson.age) {
				oldestPerson = people[i];
			}
		}
		return oldestPerson;
	}
	// 5. Find the youngestPerson
	static void firstYoungestPerson(Person[] people) {
		Person youngestPerson = people[0];
		Person[] temp = new Person[1] ;
		for(int i=1; i<people.length; i++) {
			if(youngestPerson.age > people[i].age) {
				temp[0] = youngestPerson;
				people[0] = people[i];
				people[i] = temp[0];
			}
		}
		System.out.println(Arrays.toString(people));
	}
	
	@Override
	public String toString() {
		return this.name + this.age;
	}
}