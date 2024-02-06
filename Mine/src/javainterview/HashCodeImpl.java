package javainterview;

import java.util.HashMap;
import java.util.Map;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		// A simple hash code implementation based on fields
		int result = 17;
		result = 31 * result + name.hashCode();
		result = 31 * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// Check for reference equality
		if (this == obj)
			return true;

		// Check if the other object is null or of a different class
		if (obj == null || getClass() != obj.getClass())
			return false;

		// Check for equality based on fields
		Person otherPerson = (Person) obj;
		return age == otherPerson.age && name.equals(otherPerson.name);
	}
}

public class HashCodeImpl {
	
	public static void main(String[] args) {
        Map<Person, String> personMap = new HashMap<>();

        Person person1 = new Person("John", 25);
        Person person2 = new Person("Jane", 30);
        Person person3 = new Person("John", 25);

        // Adding persons to the map
        personMap.put(person1, "Employee");
        personMap.put(person2, "Manager");

        // Retrieving information based on a person
        System.out.println("Person 1 is a " + personMap.get(person1));  // Employee
        System.out.println("Person 3 is a " + personMap.get(person3));  // null because person3 is not present in the map

        // Checking equality and hash code
        System.out.println("person1.equals(person3): " + person1.equals(person3));  // true
        System.out.println("person1.hashCode() == person3.hashCode(): " + (person1.hashCode() == person3.hashCode()));  // true
    }

}
