package javainterview.lamdaexample;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Double> randomDouble = () -> Math.random();

		System.out.println(randomDouble.get()); // (random double value)
		System.out.println(randomDouble.get()); // (another random double value)
	}

}
