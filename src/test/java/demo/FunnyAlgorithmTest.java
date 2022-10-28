package demo;

import static org.junit.Assert.assertEquals;

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
	
	private static int[] array = {5, 4, 8, 1, 2}; 
	
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
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
		System.out.println(DateTime.now());
	}
	
}
