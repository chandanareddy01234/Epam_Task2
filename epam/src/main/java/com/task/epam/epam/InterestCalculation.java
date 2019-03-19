/**
 * 
 */
package com.task.epam;

/**
 * @author Chandana
 *
 */
public class InterestCalculation {
	public int calculateCompoundInterest(int principle,int ratio,int time,int n) {
		double compound_interest=0;
		compound_interest=principle*Math.pow((1+(ratio/time)),n*time);
		return (int)compound_interest;
	}
	public int calculateSimpleInterest(int principle, int rate, int time) {
		float simple_interest = (principle * rate * time) / 100;
		return (int)simple_interest;
	}
}