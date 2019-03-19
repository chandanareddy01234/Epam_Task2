/**
 * 
 */
package com.task.epam;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Chandana
 *
 */
public class CalculatorTest {

	@Test
	public void test() {
	Calculator c=new Calculator();
	 assertEquals(3,c.add(1,2));
	 assertEquals(6,c.add(3,3));
	 assertEquals(8,c.multiply(2, 4));
	 assertEquals(6,c.multiply(2, 3));
	 assertEquals(3,c.divide(6, 2));
	 assertEquals(2,c.divide(2, 2));
	  
	}

}