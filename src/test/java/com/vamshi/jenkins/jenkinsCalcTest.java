package com.vamshi.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class jenkinsCalcTest {

	@Test
	public void addTest() {
		jenkinsCalculator myCalc=new jenkinsCalculator();
		assertEquals(10,myCalc.addNumbers(5,5));
	}
	@Test
	public void subtractTest() {
		jenkinsCalculator myCalc=new jenkinsCalculator();
		assertEquals(5,myCalc.subtractNumbers(10,5));
	}
}
