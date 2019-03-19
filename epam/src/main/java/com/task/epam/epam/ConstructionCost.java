/**
 * 
 */
package com.task.epam;

/**
 * @author Chandana
 *
 */
public class CostEstimator {
	public int calculate_Cost(int area, String standard) {
		int cost = 0;
		if (standard.equals("standard")) {
			cost = area * 1200;
		} else if (standard.equals("abovestandard")) {
			cost = area * 1500;
		} else if (standard.equals("highstandard")) {
			cost = area * 1800;
		} else {
			cost = area * 2500;
		}
		return cost;
	}
}