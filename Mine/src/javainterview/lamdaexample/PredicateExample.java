package javainterview.lamdaexample;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<String> isNotEmpty = s -> s != null && !s.isEmpty();

		System.out.println(isNotEmpty.test("Hello")); // true
		System.out.println(isNotEmpty.test("")); // false
		System.out.println(isNotEmpty.test(null)); // false
	}

}
