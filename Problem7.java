public class Problem7 {
	// find the 10001th prime number
	public static boolean isPrime(int n) {
		if (n == 2) {
			return true;
		}

		for (int i = (n-1); i > 1; i--) {
			if ((n % i) == 0) {
				return false;
			}
		}
		return true;
	}


	
	public static int findPrime() {
		int count = 0;
		int number = 1;
		while (count != 10001) {
			number += 1;
			if (isPrime(number)) {
				System.out.println(number);
				count += 1;
			}
		}
		return number;
	}	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(findPrime());
	}















}
