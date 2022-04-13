package com.heraizen.erpSys.junit;

public interface ArrayOperations {
	public int search (int[] arr, int ele);
	public int[] getPrimeNumbers(int[] arr);
	
	default boolean isPrime(int a) {
		if (a % 2 == 0 && a != 2)
			return false;
		else {
			for (int i = 2; i <= a / 2; i++) {
				if (a % i == 0)
					return false;
			}
			return true;
		}
	}

	default int countOfPrime(int[] arr) {
		int count = 0;
		for (int i: arr) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}
}
