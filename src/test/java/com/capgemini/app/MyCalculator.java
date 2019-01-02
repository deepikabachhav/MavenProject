package com.capgemini.app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.app.myCalculator.Addition;
import com.capgemini.app.myCalculator.Division;
import com.capgemini.app.myCalculator.Multiplication;
import com.capgemini.app.myCalculator.Subtraction;
/**
 * Test classe for various operations
 * @author dbachhav
 *
 */
public class MyCalculator {
	
	private Addition addition;
	private Subtraction subtraction;
	private Multiplication multiplication;
	private Division division;
	
	@Before
	public void setUp(){
		addition= new Addition();
		subtraction = new Subtraction();
		 multiplication=new Multiplication();
		 division =new Division();
	}

	@Test
	public void testAdditionOfTwoPositiveNumbers() {
		Addition addition=new Addition();
		int result= addition.addNumbers(80, 50);
		assertEquals(130 ,result);
	}
	
	@Test
	public void  testAdditionOfTwoNegativeNumbers() {
		int result= addition.addNumbers(-80, -50);
		assertEquals(-130 ,result);
	}
	
	
	@Test
	public void  testSubtractionOfAdditionOfOnePositiveNumbers() {
		int result= addition.addNumbers(80, -50);
		assertEquals(30 ,result);
	}
	
	@Test
	public void testSubtractionOfTwoPositiveNumbers() {
		int result= subtraction.subtractNumbers(45,10);
		assertEquals(35, result);
	}
	
	@Test
	public void testSubtractionOfTwoNegativeNumbers() {
		int result= subtraction.subtractNumbers(-45,-10);
		assertEquals(-35, result);
	}
	
	@Test
	public void testSubtractionOfOnePositiveNumber() {
		int result= subtraction.subtractNumbers(45,-10);
		assertEquals(55, result);
	}
	
	@Test
	public void testSubtractionOfOneOnePositiveNumber() {
		int result= subtraction.subtractNumbers(-45,10);
		assertEquals(-55, result);
	}
	
	@Test
	public void testSubtractionOfOneZeroeNumber() {
		int result= subtraction.subtractNumbers(0,10);
		assertEquals(-10, result);
	}
	
	@Test
	public void testMultiplicationtionOfTwoPositiveNumber() {
		int result= multiplication.multiplyNumbers(10,10);
		assertEquals(100, result);
	}
	
	@Test
	public void testMultiplicationtionOfTwoNegativeNumber() {
		int result= multiplication.multiplyNumbers(-10,-10);
		assertEquals(100, result);
	}
	
	@Test
	public void testMultiplicationtionOfOneNegativeNumber() {
		int result= multiplication.multiplyNumbers(-10,10);
		assertEquals(-100, result);
	}
	
	@Test
	public void testMultiplicationtionOfOneZeroNumber() {
		int result= multiplication.multiplyNumbers(0,10);
		assertEquals(-0, result);
	}
	

	@Test
	public void testMultiplicationtionOfOneZeroOneNegativeNumber() {
		int result= multiplication.multiplyNumbers(-10,0);
		assertEquals(0, result);
	}
	
	@Test
	public void testDivisiontionOfTwoPositiveNumber() {
		int result= division.divideNumbers(10,10);
		assertEquals(1, result);
	}

	@Test
	public void testDivisiontionOfTwoNegativeNumber() {
		int result= division.divideNumbers(-10,-10);
		assertEquals(1, result);
	}
	
	@Test
	public void testDivisiontionOfOnePositiveNumber() {
		int result= division.divideNumbers(10,-10);
		assertEquals(-1, result);
	}
	
	@Test
	public void testDivisiontionOfOneZeroNumber() {
		int result= division.divideNumbers(0,10);
		assertEquals(0, result);
	}
}
