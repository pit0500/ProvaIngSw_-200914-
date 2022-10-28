package demo;

import static org.junit.Assert.assertEquals;

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
	public void testConstructor() {
		System.out.println("testConstructor");
		fa = new FunnyAlgorithms();
	}
	
	@Test
	public void stringToIntConverterWorks() {
		assertEquals(821, fa.stringToIntConverter("821"));
		assertEquals(233, fa.stringToIntConverter("233 "));
	}
	
	@Test(expected = NumberFormatException.class)
	public void stringToIntConverterThrowsNFException() {
		System.out.println("stringToIntConverterThrowsNFException");
		fa.stringToIntConverter("ew5425");
		fa.stringToIntConverter("2.3");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void stringToIntConverterThrowsIAException() {
		System.out.println("stringToIntConverterThrowsIAException");
		fa.stringToIntConverter("40000");
	}
	
	
	
}
