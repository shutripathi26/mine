package javainterview.lamdaexample;

import java.util.function.Predicate;

public class PredicateCombinationExample {

	public static void main(String[] args) {
		Predicate<String> isNotNull = s -> s != null;
		Predicate<String> isNotEmpty = s -> !s.isEmpty();

		Predicate<String> isNotNullAndNotEmpty = isNotNull.and(isNotEmpty);

		System.out.println(isNotNullAndNotEmpty.test("Hello")); // true
		System.out.println(isNotNullAndNotEmpty.test("")); // false
		System.out.println(isNotNullAndNotEmpty.test(null)); // false
	}

}
