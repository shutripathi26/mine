package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args) {
		int nums[] = new int[] {0,0,3,4};
		int target = 0;
		int res[] = new int[2];
		
		Map<Integer, Integer> hmap = new HashMap<>();
		
//		for(int i =0; i<nums.length; i++) {
//			hmap.put(nums[i],i);
//		}
//		
//		for(Map.Entry<Integer, Integer> m : hmap.entrySet()) {
//			if(hmap.containsKey(target - m.getKey())) {
//				res[0] = m.getValue()+1;
//				res[1]= hmap.get(target - m.getKey())+1;
//			}
//		}
//		
//		for(int r : res) {
//			System.out.println(r);
//		}
		
//		for(int i =0; i<nums.length; i++) {
//			int num = nums[i];
//			
//			if(hmap.containsKey(target-nums[i])) {
//				return new int[] {i,hmap.get(target-nums[i])};
//			}
//			hmap.put(nums[i], i);
//		}
		
	}

}
