package com.hcltech.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.hcltech.exceptions.NoValueException;
import com.hcltech.service.CalcSeries;

@Tag("dev")
public class TestAverageNosFromArray {

	CalcSeries series;
	
	@BeforeEach
	public void beforeEach() {
		series = new CalcSeries();
	}
	
	@Test
	public void testAvg1() {
		int[] arr = {5, 10, 3};
		Assertions.assertEquals(6.0, series.averageNosinArray(arr));
	}
	
	@Test
	public void testAvg2() {
		int[] arr = {1,2,3,4,3};
		Assertions.assertEquals(2.6, series.averageNosinArray(arr));
	}
	
	@Tag("qa")
	@Test
	public void testAvg3() {
		Assertions.assertThrows(NoValueException.class,
				                ()->series.averageNosinArray(null));
	}
	
	@Tag("qa")
	@Test
	public void testAvg4() {
		int[] arr = {};
		Assertions.assertThrows(NoValueException.class, 
				                ()->series.averageNosinArray(arr));
	}
}







