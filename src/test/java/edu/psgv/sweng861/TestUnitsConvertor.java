package edu.psgv.sweng861;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 * This class is a JUnit test class.
 * The purpose of this class is to test the UnitsConvertor class.
 * @author chuanwei
 *
 */
public class TestUnitsConvertor {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	/**
	 * This method is designed to test toMil method in the UnitsConvertor class.
	 */
	public void analyzeToMil() {
		
		assertEquals(1 * 39.3701, UnitsConvertor.toMil(1, "mm"));
		
		assertEquals(2 * 39.3701, UnitsConvertor.toMil(2, "millimeter"));
		
		assertEquals(3 * 10 * 39.3701, UnitsConvertor.toMil(3, "cm"));
		
		assertEquals(5 * 10 * 39.3701, UnitsConvertor.toMil(5, "centimeter"));
		
		assertEquals(6 * 1000 * 39.3701, UnitsConvertor.toMil(6, "m"));
		
		assertEquals(7 * 1000 * 39.3701, UnitsConvertor.toMil(7, "meter"));
		
		assertEquals(8 * 1000000 * 39.3701, UnitsConvertor.toMil(8, "km"));
		
		assertEquals(9 * 1000000 * 39.3701, UnitsConvertor.toMil(9, "kilometer"));
		
		// invalid input
		assertEquals(11 * 1000000000 * 39.3701, UnitsConvertor.toMil(11, "magamiter"));
	}
	
	@Test
	/**
	 * This method is designed to test toMm method in the UnitsConvertor class.
	 */
	public void analyzeToMm() {
		
		assertEquals(1 * 1000 * 0.0254, UnitsConvertor.toMm(1, "in"));
		
		assertEquals(2 * 1000 * 0.0254, UnitsConvertor.toMm(2, "inch"));
		
		assertEquals(3 * 12000 * 0.0254, UnitsConvertor.toMm(3, "ft"));
		
		assertEquals(5 * 12000 * 0.0254, UnitsConvertor.toMm(5, "foot"));
		
		assertEquals(6 * 12000 * 0.0254, UnitsConvertor.toMm(6, "feet"));
		
		assertEquals(7 * 36000 * 0.0254, UnitsConvertor.toMm(7, "yd"));
		
		assertEquals(8 * 36000 * 0.0254, UnitsConvertor.toMm(8, "yard"));
		
		assertEquals(9 * 63360000 * 0.0254, UnitsConvertor.toMm(9, "mi"));
		
		assertEquals(12 * 63360000 * 0.0254, UnitsConvertor.toMm(12, "mile"));
		
		assertEquals(11 * 0.0254, UnitsConvertor.toMm(11, "mil"));
		
		// invalid input
		assertEquals(13, UnitsConvertor.toMm(13, "mpg"));
	}
	
	@Test
	/**
	 * This method is designed to test main method in the UnitsConvertor class.
	 */
	public void mainTest() {
		
		// First test: test meter to mile
		// simulated input
		String input1 = "15 cm";
		
		InputStream myIn1 = new ByteArrayInputStream(input1.getBytes());
		System.setIn(myIn1);

		final ByteArrayOutputStream myOut1 = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut1));
		
		// test 1
		UnitsConvertor.main(null);
		
		// Second test: test mile to metric
		// simulated input
		String input2 = "16 feet";

		InputStream myIn2 = new ByteArrayInputStream(input2.getBytes());
		System.setIn(myIn2);

		final ByteArrayOutputStream myOut2 = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut2));
		
		// test 2
		UnitsConvertor.main(null);
		
		// Third test: invalid input with the wrong unit
		// simulated input
		String input3 = "19 ch";

		InputStream myIn3 = new ByteArrayInputStream(input3.getBytes());
		System.setIn(myIn3);

		final ByteArrayOutputStream myOut3 = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut3));
		
		// test 3
		UnitsConvertor.main(null);
		
		// Fourth test: invalid input with wrong numeric value
		// simulated input
		
		String input4 = "twenty one cm";
		
		InputStream myIn4 = new ByteArrayInputStream(input4.getBytes());
		System.setIn(myIn4);

		final ByteArrayOutputStream myOut4 = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut4));
		
		// test 4
		UnitsConvertor.main(null);
	}
}
