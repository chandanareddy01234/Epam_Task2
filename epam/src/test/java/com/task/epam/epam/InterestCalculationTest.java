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
public class InterestCalculationTest {

	@Test
	public void test() {
		InterestCalculation i=new InterestCalculation();
		assertEquals(100,i.calculateCompoundInterest(100,2,3,1));
		assertEquals(50,i.calculateCompoundInterest(50, 4, 9, 2));
		assertEquals(6,i.calculateSimpleInterest(100, 2, 3));
		assertEquals(3,i.calculateSimpleInterest(100,3,1));
		assertEquals(1,i.calculateSimpleInterest(100,1,1));
	}

}