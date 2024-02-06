package leetcode;

public class TrappingRainWater {
	
	public static void main(String[] args) {
		int[] arr = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
		
		int[] left_arr = new int[arr.length];
		int[] right_arr = new int[arr.length];
		int left_max = 0;
		int area = 0;
		for(int i = 0 ; i< arr.length; i++) {
			left_arr[i] = Math.max(left_max, arr[i]); // 4,4,4,4,4,5
			if(left_max<left_arr[i]) left_max = left_arr[i];
		}
		
		int right_max = 0;
		for(int i = arr.length-1; i>=0; i--) {
			right_arr[i] = Math.max(right_max, arr[i]); // 5,5,5,5,5,5
			if(right_max<arr[i])right_max = right_arr[i];
		}
		
		for(int i = 0 ; i< arr.length; i++) {
			area += Math.min(left_arr[i], right_arr[i])-arr[i];
		}
		System.out.println(area);
	}

}
