package com.hcltech.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.hcltech.service.SalesCommission;

public class TestSalesCommission {

	static SalesCommission sales = new SalesCommission();
	
	@Test
	public void testSalesCommission1() {
		Assertions.assertEquals(6000.0, sales.calcSalesCommission(60000.0));
	}
	
	@Test
	public void testSalesCommission2() {
		Assertions.assertEquals(2400.0, sales.calcSalesCommission(30000.0));
	}
	
	@Test
	public void testSalesCommission3() {
		Assertions.assertEquals(1000.0, sales.calcSalesCommission(20000.0));
	}
	
	@Test
	public void testSalesCommission4() {
		Assertions.assertEquals(300.0, sales.calcSalesCommission(10000.0));
	}
}








