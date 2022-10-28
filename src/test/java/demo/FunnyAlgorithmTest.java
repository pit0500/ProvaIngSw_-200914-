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
	public void stringToIntConverterWorksNormal() {
		assertEquals(821, fa.stringToIntConverter("821"));
	}

	
	
}
