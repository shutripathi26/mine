package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {

		// a+b+c = 0 a+b = 0-c

		int nums[] = new int[] { -1, 0, 1, 2, -1, -4 };
		Arrays.sort(nums);
		List<List<Integer>> res = new LinkedList<List<Integer>>();

		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int low = i +1;
				int high = nums.length - 1;
				while (low < high) {
					int sum = 0 - nums[i];
					if (nums[low] + nums[high] == sum) {
						res.add(Arrays.asList(nums[i], nums[low], nums[high]));
						while(low<high && nums[low] == nums[low+1]) low++;
						while(low<high && nums[high] == nums[high-1]) high--;
						low++;
						high--;
						
					} else if(nums[low] + nums[high] > sum) high --;
					else low++;
				}
			}
		}
		
		
//        Arrays.sort(nums);
//		Set<List<Integer>> res = new HashSet<List<Integer>>();
//
//		for (int i = 0; i < nums.length - 2; i++) {
//			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
//				int low = i+ 1;
//				int high = nums.length - 1;
//				while (low < high) {
//					int sum = nums[low] +nums[high];
//					if (nums[low] + nums[high] == sum) {
//						res.add(Arrays.asList(nums[i], nums[low++], nums[high--]));
//
//						
//					} else if(nums[low] + nums[high] > sum) high --;
//					else low++;
//				}
//			}
//		}
//        List<List<Integer>> res1 = new ArrayList<>(res);
//        
        System.out.println();

	}

}
