package review01Java;

class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	static void PrintPersonDetails(Person people) {
		System.out.println("Name is: " + people.name + " age is: " + people.age);
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
}