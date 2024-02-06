package lti;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {

		String s = "I like to play cricket";

		String result = Arrays.stream(s.split("\\s+")).max((word1, word2) -> word1.length() - word2.length())
				.orElse("");

		String s1[] = s.split(" ");

		List<String> li = Arrays.asList(s1);

//		List<Integer> res = li.stream().map(x -> x.length())
//				.reduce(0, (ans,x)-> {if(ans<x) ans =x;});

		System.out.println(result);

	}

}
