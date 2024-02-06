package leetcode;

public class ContainerWithMostWater {
	
	public static void main(String[] args) {
		int[] arr = new int [] {1,8,6,2,5,4,8,3,7};
		
		int low = 0;
		int high = arr.length-1; // 8
		int max_area = 0;
		int curr_area = 0;
		while(low<high) {
			curr_area = Math.min(arr[low], arr[high]) * (high -low);
			if(curr_area>max_area) max_area = curr_area;
			if(arr[low]<arr[high]) low++;
			else high--;
		}
		System.out.println(max_area);
	}

}
