import java.util.ArrayList;
public class Problem4 {


	public static boolean isPalindrome(int n) {
	
		String str = String.valueOf(n);
		int length = String.valueOf(n).length();
		int count = 0;
	
		
		for (int i = 0, j = (length - 1); i < (length / 2); i++, j--) {
			
			//System.out.println(str.charAt(i) + "  " + str.charAt(j));
			if (str.charAt(i) == str.charAt(j)) {
				count += 1;
			}
			
		}
		//System.out.println(count);
		if (count == (length / 2)) {
			return true;
		} else {
			return false;
		}
	}


	public static int largestThreeDigitPalindrome() {
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= 100; j--) {
				int number = i * j;
				if (isPalindrome(number)) {
					list.add(number);
				}
			}
		}
	
	
		// sort arraylist into largest numbers first
		for (int i = 0; i <= list.size(); i++) {
			for (int j = 0; j < (list.size() - 1); j++) {
				if (list.get(j) < list.get(j+1)) {
					int n = list.get(j+1);
					list.remove(j+1);
					list.add(j, n);
				}
			}
		}	
	
		return list.get(0);
	
	
	
	
	
	
	}





	public static void main(String[] args) {
		//System.out.println(isPalindrome(105001));
		System.out.println(largestThreeDigitPalindrome());

	}

















}
