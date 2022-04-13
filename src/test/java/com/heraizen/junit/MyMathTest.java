package com.heraizen.junit;

import com.heraizen.erpSys.junit.MyMath;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;


@TestInstance(Lifecycle.PER_CLASS)
public class MyMathTest {
	
	MyMath mathTest = null;
	@BeforeAll
	void init() {
		mathTest = new MyMath();
	}
	
	@BeforeEach
	void beforeEach() {
		
		System.out.println("Before each");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("After each");
	}
	
	@AfterAll
	void afterAll() {
		System.out.println("After all");
	}
	
	
	@Test
	@DisplayName("Biggest of two - 1")
	void testBiggestOfTwo() {
		Assertions.assertEquals(3, mathTest.biggestOfTwo(2, 3));

	}
	
	@Test
	@DisplayName("Biggest of two - 2")
	void testBiggestOfTwoSecond() {
		
		Assertions.assertEquals(5, mathTest.biggestOfTwo(5, 3));

	}

	@Test
	@DisplayName("Biggest of three")
	void testBiggestOfThree() {
		
		
		Assertions.assertAll("Biggest of three ",
    		() -> Assertions.assertEquals(5, mathTest.biggestOfThree(5, 3, 4)),
    		() -> Assertions.assertEquals(4, mathTest.biggestOfThree(2, 4, 3)),
    		() -> Assertions.assertEquals(5, mathTest.biggestOfThree(2, 4, 5))
    	);
		
	}

	@Test
    void testIsPrime() {
    	Assertions.assertAll("Prime test ",
    		() -> Assertions.assertTrue(mathTest.isPrime(2), "Test for 2"),
    		() -> Assertions.assertTrue(mathTest.isPrime(3), "Test for 3"),
    		() -> Assertions.assertTrue(mathTest.isPrime(7), "Test for 7"),
    		() -> Assertions.assertFalse(mathTest.isPrime(6), "Test for 6"),
    		() -> Assertions.assertFalse(mathTest.isPrime(21), "Test for 21")
    	);
    	
    }
	
	@Test
	@DisplayName("Biggest of N")
	void testBiggestOfN() {
		
		Assertions.assertNotEquals(4, mathTest.biggestOfNIntegers(2, 3, 4, 765 ,34));
	}
	


}
