package leetcode;

public class ProductOfArray {
	
	public static void main(String[] args) {
		int nums[] = new int[] {1,2,3,4};
		
		
		// Brute Force method
//		int res[] = new int[nums.length];
//		for(int i = 0; i< nums.length; i++) {
//			int multi = 1;
//			for(int j = 0 ; j<nums.length; j++) {
//				if(i != j) {
//					multi *= nums[j];
//				}
//			}
//			res[i] = multi;
//		}
//		
//		for(int i = 0; i< res.length; i++) {
//			System.out.println(res[i]);
//		}
		
		// OPTIMZED CODE
		int n = nums.length;
        int pre[] = new int[n];
        int suff[] = new int[n];
        pre[0] = 1;
        suff[n - 1] = 1;
        
        for(int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        for(int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }
        
        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i];
        }
		
		
		for(int i = 0; i< ans.length; i++) {
			System.out.println(ans[i]);
		}
		
	}

}
