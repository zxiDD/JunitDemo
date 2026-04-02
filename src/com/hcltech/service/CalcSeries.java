package com.hcltech.service;

import java.util.Arrays;

import com.hcltech.exceptions.NoValueException;

public class CalcSeries {

	
	public double calcSeries(int a, int b, int c) {
		double res = (a + b + c) / 2.0;
		return res;
	}
	
	public double averageNosinArray(int[] values) {
		if(null == values || values.length ==0)throw new NoValueException();
		int sum = Arrays.stream(values).sum();
		double avg = sum/(double)values.length;
		return avg;
	}
	
	public int sumNaturalNos(int n) {
		int sum =n * (n + 1)/2;
		
		return sum;
	}
}
