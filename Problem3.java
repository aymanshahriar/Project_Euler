import java.util.ArrayList;
public class Problem3 {
	
	
	public static ArrayList<Long> list = new ArrayList<Long>();

	public static void method1() {
		long number = 600851475143L;
		for (long i = 2L; i <= 775147L; i++) {
			while ((number % i) == 0) {
				list.add(i);
				number /= i;
			}
		}
		
		System.out.println(list.get(list.size() - 1));	
		
	}	


	
	public static void main(String[] args) {
		method1();
	}
	
	
	
}
