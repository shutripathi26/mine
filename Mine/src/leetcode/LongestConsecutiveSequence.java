package leetcode;

import java.util.HashMap;

public class LongestConsecutiveSequence {
	
	public static void main(String[] args) {
		int nums[] = new int[] {3,1,2,1,4};
		HashMap<Integer, Integer> mp = new HashMap<>();
        int currSeq = 0;
        int seq = 0;
        //put all the elems in a hash to be easy to check if elem exists 
        for(int n : nums)
            mp.put(n, mp.getOrDefault(n, 0)+1);
        
        int n = 0;
        for(int i = 0; i < nums.length; i++){
            n = nums[i];
            currSeq = 0;

            if(!(mp.containsKey(nums[i]-1))){//beginning of a sequence
                currSeq++;
                while(mp.containsKey(n+1)){//check if next elem exists in mp
                    currSeq++;//if exists add to the sequence
                    n++;
                }
            }
            seq = Math.max(seq, currSeq);
        }
       System.out.println(seq);

	}

}
