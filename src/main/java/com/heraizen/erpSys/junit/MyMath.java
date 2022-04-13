package com.heraizen.erpSys.junit;

public class MyMath {

    public int biggestOfTwo(int a, int b) {
        return a>b?a:b;
    }

    public int biggestOfThree(int a, int b, int c) {
        return a>b && a>c ? a : b>c ? b: c;
    }

    public int biggestOfNIntegers(int... n) {
        int big = n[0];
        for (int i: n) {
            if (i > big)
                big = i;
        }
        return big;
    }
    
    public boolean isPrime(int a) {
    	if (a % 2 == 0 && a != 2)
    		return false;
    	else {
    		for (int i=2; i <= a/2; i++) {
    			if (a%i == 0) 
    				return false;
    		}
    		return true;
    	}
    	
    }

}
	