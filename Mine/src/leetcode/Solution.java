package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		int[] result = solution.topKFrequent(nums, k);
		System.out.println(Arrays.toString(result)); // Output: [1, 2]

	}

	public int[] topKFrequent(int[] nums, int k) {
		// Step 1: Count Frequencies
		Map<Integer, Integer> freqCount = new HashMap<>();
		for (int num : nums) {
			freqCount.put(num, freqCount.getOrDefault(num, 0) + 1);
		}

		// Step 2: Create Frequency Buckets
		List<Integer>[] buckets = new List[nums.length + 1];
		for (int i = 0; i <= nums.length; i++) {
			buckets[i] = new ArrayList<>();
		}

		// Step 3: Fill Buckets
		for (Map.Entry<Integer, Integer> entry : freqCount.entrySet()) {
			buckets[entry.getValue()].add(entry.getKey());
		}

		// Step 4: Extract Top K Elements
		List<Integer> result = new ArrayList<>();
		for (int i = buckets.length - 1; i >= 0; i--) {
			if (k == 0) {
				break;
			}
			result.addAll(buckets[i]);
			k -= buckets[i].size();
		}

		// Convert the result list to an array
		
//		return result.toArray();
		int[] topK = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			topK[i] = result.get(i);
		}
		return topK;

//		 topK;
	}

}
