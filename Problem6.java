public class Problem6 {

	public static int sum() {
		// square of sum
		int count1 = 0;
		for (int i = 1; i <= 100; i++) {
			count1 += i;
		}
		int squareOfSum = count1 * count1;

		// sum of squares
		int count2 = 0;
		for (int i = 1; i <= 100; i++) {
			count2 += (i * i);
		}
		int sumOfSquares = count2;

		
		return (sumOfSquares - squareOfSum);
	}



	public static void main(String[] args) {
		System.out.println(sum());
	}




















}
