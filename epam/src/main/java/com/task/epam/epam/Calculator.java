/**
 * 
 */
package com.task.epam;

/**
 * @author Chandana
 *
 */
public class Calculator {
public int add(int number1,int number2) {
	int sum=number1+number2;
	return sum;
}
public int multiply(int number1,int number2) {
	int result=number1*number2;
	return result;
}
public float divide(int number1,int number2) {
	float ans=0;
	try {
		ans=(float)number1/number2;
	}
	catch(ArithmeticException e) {
	}
	return ans;
}
}