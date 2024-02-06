package leetcode;

public class ValidPalindrome {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panma";
		
		String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println(s1);
		boolean val = true;
		int n = s1.length();
		for(int i = 0 ; i<s1.length()/2; i++) {
			if(s1.charAt(i)==s1.charAt(n-1)) {
				n--;
				continue;
			} else {
				val = false;
				break;
			}
		}
		System.out.println(val);

	}

}
