package com.heraizen.junit;

import com.heraizen.erpSys.junit.ArrayOperations;
import com.heraizen.erpSys.junit.ArrayOperationsImpl;
import com.heraizen.erpSys.util.CsvReaderUtil;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.Month;

@TestInstance(Lifecycle.PER_CLASS)
public class ArrayOperationTest {

	private ArrayOperations arrayOperations;
//	private TestInfo testInfo;

	@BeforeAll
	void init() {
		arrayOperations = new ArrayOperationsImpl();
	}
	
//	@BeforeEach
//	void initMethods() {
//		testInfo = new TestInfo();
//	}

	@Nested
	@DisplayName("Searching element in array")
	class searchElement {

		@Test
		void searchElementConsists() {
			int[] inputArr = { 1, 2, 3, 4, 5, 6, 7, 8 };
			int expected = 3;
			int elementSearch = 4;
			Assertions.assertEquals(expected, arrayOperations.search(inputArr, elementSearch),
					() -> String.format("Not found element %s in input array", elementSearch));
		}

		@Test
		void searchElementNotConsists() {
			int[] inputArr = { 1, 2, 3, 4, 5, 6, 7, 8 };
			int expected = -1;
			int elementSearch = 32;
			Assertions.assertEquals(expected, arrayOperations.search(inputArr, elementSearch),
					() -> String.format("Not found element %s in input array", elementSearch));
		}
		
		
	}

	@Nested
	@DisplayName("Prime Numbers")
	class primeTests {
		@RepeatedTest(3)
//		@Test
		public void isPrime(TestInfo testInfo) {
			System.out.println(testInfo.toString());
			Assertions.assertTrue(arrayOperations.isPrime(3));
		}

		@Test
		@DisplayName("Get all Prime Numbers")
		void getAllPrimeNumber(TestInfo testInfo) {
			int[] inputArray = { 1, 2, 3, 4, 5, 6 };
			int[] expectedArray = { 1, 2, 3, 5 };
			System.out.println(testInfo.getTestMethod());
			Assertions.assertArrayEquals(expectedArray, arrayOperations.getPrimeNumbers(inputArray));
		}

		@Test
		@DisplayName("Get all Prime Numbers")
		void getNoPrimeNumber() {
			int[] inputArray = { 6, 8 };
			int[] expectedArray = {};
			System.out.println(arrayOperations.getPrimeNumbers(inputArray).toString());
			Assertions.assertArrayEquals(expectedArray, arrayOperations.getPrimeNumbers(inputArray));
		}

		@Test
		@DisplayName("Null array for Prime fetch")
		void getPrimeNullData() {
			int[] inputArray = null;
			Assertions.assertThrows(NullPointerException.class, () -> {
				arrayOperations.getPrimeNumbers(inputArray);
			});
		}

	}
	
	@Test
	void testCsvReader() {
		Assertions.assertTrue(CsvReaderUtil.readDataFromCsvFile().size() > 0, "Size greater than 0");
	}


	@ParameterizedTest
	@CsvSource({ "0,1", "1,1", "2,2", "3,6", "4,24"})
	void factorialExample(int input, int expected) {
		Assertions.assertEquals(expected, factorial(input));
	}

	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}
	
	@ParameterizedTest
	@EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER", "FEBRUARY"})
	void someMonthsAre30DaysLong(Month month) {
	    final boolean isALeapYear = true;
	    Assertions.assertEquals(30, month.length(isALeapYear));
	}
}
