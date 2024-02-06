package javainterview.lamdaexample;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());

		printUpperCase.accept("hello"); // HELLO
		printUpperCase.accept("lambda"); // LAMBDA
	}

}
