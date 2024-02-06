package javainterview.lamdaexample;

import java.util.function.Function;

public class FunctionExample {
	
    public static void main(String[] args) {
        Function<String, Integer> stringLength = s -> s.length();

        System.out.println(stringLength.apply("Java"));   // 4
        System.out.println(stringLength.apply("Lambda")); // 6
    }

}
