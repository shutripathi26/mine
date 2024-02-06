package javainterview.lamdaexample;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator addition = (a, b) -> a + b;
		Calculator subtraction = (a, b) -> a - b;

		System.out.println(addition.calculate(5, 3)); // 8
		System.out.println(subtraction.calculate(10, 4)); // 6
	}

}
