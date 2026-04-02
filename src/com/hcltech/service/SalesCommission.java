package com.hcltech.service;

public class SalesCommission {

	
	public  double calcSalesCommission(double amt) {
		double comm =0;
		if(amt >= 50000)
			comm = amt * 0.1;
		else if(amt >= 25000)
			comm = amt * 0.08;
		else if(amt >= 15000)
			comm = amt * 0.05;
		else
			comm = amt * 0.03;
		return  comm;
	}
}
