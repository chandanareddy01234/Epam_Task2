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
public class ConstructionCostTest {

	@Test
	public void test() {
		ConstructionCost ce = new ConstructionCost();
		assertEquals(4800, ce.calculate_Cost(4, "standard"));
		assertEquals(4500, ce.calculate_Cost(3, "abovestandard"));
		assertEquals(5400, ce.calculate_Cost(3, "highstandard"));
	}

}