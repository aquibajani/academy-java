package com.bptn.course._26_calculator_junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class CalculatorDemoTest {

	private CalculatorTest calculator;

	@BeforeEach
	public void setup() {
		calculator = new CalculatorTest();
	}

	@Test
	public void testAdd() {
		assertEquals(10, calculator.add(5, 5), "5+5 should equal 10");
		assertEquals(20, calculator.add(15, 5), "15+5 should equal 20");
	}

	@Test
	public void testSubtract() {
		assertEquals(10, calculator.subtract(15, 5), "15-5 should equal 10");
	}

}
