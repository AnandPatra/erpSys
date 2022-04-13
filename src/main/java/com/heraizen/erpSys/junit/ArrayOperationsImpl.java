package com.heraizen.erpSys.junit;

public class ArrayOperationsImpl implements ArrayOperations {

	// Search element if found return index else return -1
	@Override
	public int search(int[] arr, int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele)
				return i;
		}
		return -1;
	}

	@Override
	public int[] getPrimeNumbers(int[] arr) {
		
		if (arr == null) {
			throw new NullPointerException();
		}
		
		int size = countOfPrime(arr);
		int[] resultArray = new int[size];
		if (size > 0) {
			int index = 0;
			for (int i=0; i< arr.length; i++) {
				if (isPrime(arr[i])) {
					resultArray[index] = arr[i];
					index++;
				}
			}
			return resultArray;
		}

		return new int[] {};
	}

}
