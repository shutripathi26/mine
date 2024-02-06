package op;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();

		List<Item> itemslist = list.stream().filter(list1 -> list instanceof Item).map(list1 -> (Item) list1)
				.collect(Collectors.toList());

		List<Coupons> coupounslist = list.stream().filter(list1 -> list instanceof Coupons)
				.map(list1 -> (Coupons) list1).collect(Collectors.toList());
		
		
	}

}
