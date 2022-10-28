package demo;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Verifier;

import demo.FunnyAlgorithms;

import org.junit.Rule;

public class FunnyAlgorithmTest {

	private static FunnyAlgorithms fa; 
	
	@BeforeClass
	public static void testConstructor() {
		System.out.println("Before class");
		System.out.println(DateTime.now());
		fa = new FunnyAlgorithms();
	}
	
	@Test
	public void stringToIntConverterWorksWithSpaces() {		
		assertEquals(233, fa.stringToIntConverter("233 "));
	}
	
	@Test(expected = NumberFormatException.class)
	public void stringToIntConverterThrowsNFException() {
		System.out.println("stringToIntConverterThrowsNFException");
		fa.stringToIntConverter("ew5425");
		fa.stringToIntConverter("2.3");
	}
	
	@Test
	public void selectionSortWorks() {
		int[] array = {5, 4, 8, 1, 2};
		int[] ordinato = {1, 2, 4, 5, 8};
		fa.selectionSort(array, 0);
		assertArrayEquals(ordinato, array);
		System.out.println("selectionSortWorks");
	}
	
	@Test
	public void binarySearchWorksWithNotInArrayElement() {
		int[] array = {1, 2, 4, 5, 8};
		int val = fa.binarySearch(array, 9);
		assertEquals(-1, val);
		System.out.println("binarySearchWorksWithNotInArrayElement");
	}
	
	@Test
	public void binarySearchWorks() {
		int[] array = {1, 2, 4, 5, 8};
		int val = fa.binarySearch(array, 8);
		assertEquals(4, val);
		System.out.println("binarySearchWorks");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
		System.out.println(DateTime.now());
	}
	
}
