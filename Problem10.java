import java.util.ArrayList;
import java.lang.Math;
public class Problem10 {

	
	// create an arraylist filled with all numbers
	public static ArrayList<Integer> list = new ArrayList<Integer>();

	public static long method1() {
	// fill list from 2 to two million
	list.add(2);
	list.add(3);
	list.add(5);
        list.add(7);
	list.add(11);
        list.add(13);
	list.add(17);
        list.add(19);
	for (int i = 21; i <= 2000000; i += 2) {
		if ((i%2 != 0) && (i%3 != 0) && (i%5 != 0) && (i%7 != 0) && (i%11 != 0) && (i%13 != 0) && (i%17 != 0) && (i%19 != 0)) {
			//System.out.println(i);
			list.add(i);
		}
	}
	
	// eliminate all composites
	for (int i = 3; i <= (Math.round(Math.sqrt(2000000)) + 1); i += 2) {
		for (int j = 0; j < list.size(); j++) {
			if ((((list.get(j)) % i) == 0) && (list.get(j) != i)) {
				int n = list.get(j);
				System.out.println(n);
				list.remove(Integer.valueOf(n));
			}

		} 

	}
	// add all the prime numbers that remain in the ArrayList
	long sumOfPrimes = 0L;
	
	for (Integer eachPrime : list) {
		sumOfPrimes += eachPrime;
	} 
	
	
	// the program works with this loop as well
	/**
	for (int i = 0; i < list.size(); i++) {
		sumOfPrimes += list.get(i);
	}
	

	return sumOfPrimes;
	
	}
	*/



	public static void main(String[] args) {
		//method1();
		System.out.println(method1());
	}











}
