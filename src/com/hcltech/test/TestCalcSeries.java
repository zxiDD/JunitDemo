package com.hcltech.test;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.hcltech.service.CalcSeries;

@Tag("dev")
public class TestCalcSeries {
    CalcSeries series ;
	
    @BeforeEach
	public void beforeEach() {
    	System.out.println("before each");
		series = new CalcSeries();
	}
	
    @AfterEach
	public void afterEach() {
    	System.out.println("After each");
		series = null;
	}
    
    @BeforeAll
    public static void beforeAll() {
    	System.out.println("before all");
    }
    
    @AfterAll
    public static void afterAll() {
    	System.out.println("after all");
    }
    
    @Test
	public void testSeries1() {
    	System.out.println("test 1");
		Assertions.assertEquals(5.0, series.calcSeries(5, 3, 2));
	}
	
	@Test
	public void testSeries2() {
		System.out.println("test 2");
		Assertions.assertEquals(8.5, series.calcSeries(10, 5, 2));
	}
	
	@Tag("qa")
	@RepeatedTest(3)
	public void testSeries3() {
		System.out.println("test 3");
		
	}
	
}
