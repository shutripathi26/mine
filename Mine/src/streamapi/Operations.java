package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Operations {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		Employee e1 = new Employee("Ajay", 35,"Male");
		Employee e2 = new Employee("Avijay", 4,"Male");
		Employee e3 = new Employee("Zack", 30,"Male");
		Employee e4 = new Employee("David", 51,"Male");
		Employee e5 = new Employee("Isha", 32,"Female");
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		
		List<Employee> employees1 = new ArrayList<>();
		Employee e6 = new Employee("Amit", 53,"Male");
		Employee e7 = new Employee("Vinod", 50,"Male");
		Employee e8 = new Employee("Zuban", 3,"Male");
		Employee e9 = new Employee("Dhrona", 15,"Female");
		Employee e10 = new Employee("Indeajeet", 23,"Female");
		
		employees1.add(e6);
		employees1.add(e7);
		employees1.add(e8);
		employees1.add(e9);
		employees1.add(e10);
		
		Operations operations = new Operations();
		operations.findEmployeeNameWithA(employees);
		operations.mergeTwoListBasedOnAgeAsc(employees, employees1);
		operations.evenAndSumOfAll();
		operations.sortByNameAndAge(employees);
		operations.sortByGenderAndAgeMoreThan30(employees);
		operations.findLargestWord();

	}

	public void findEmployeeNameWithA(List<Employee> emp) {

		List<Employee> res = emp.stream().filter(x -> x.getName().startsWith("A")).collect(Collectors.toList());

		printEmployee(res);

	}

	public void mergeTwoListBasedOnAgeAsc(List<Employee> emp1, List<Employee> emp2) {
		List<Employee> res = Stream.concat(emp1.stream(), emp2.stream())
				.sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
		printEmployee(res);
	}

	public void evenAndSumOfAll() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6); // Your list of numbers

		int sumOfEvenNumbers = numbers.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();

		System.out.println(sumOfEvenNumbers);

	}

	public void sortByNameAndAge(List<Employee> emp) {
//		List<Employee> res = emp.stream().sorted(Comparator.comparing(Employee::getName)).sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
		List<Employee> res = emp.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge)).collect(Collectors.toList());
		printEmployee(res);

	}

	public void sortByGenderAndAgeMoreThan30(List<Employee> emp) {
		List<Employee> res = emp.stream().sorted(Comparator.comparing(Employee::getGender)).filter(x -> x.getAge()>30).collect(Collectors.toList());
		printEmployee(res);

	}

	public void printEmployee(List<Employee> emp) {
		emp.stream().forEach(x -> System.out.println(x.getName() + " " + x.getAge() + " " + x.getGender()));
		System.out.println("**************");
	}
	
	public void findLargestWord() {
		String s = "I like to play cricket";
		
		String res = Arrays.stream(s.split(" ")).max((word1, word2) -> word1.length() - word2.length()).orElse(null);
		System.out.println(res);
	}
	
	
	public void find() {
		

		
		
		
	
	}
	
	

}
