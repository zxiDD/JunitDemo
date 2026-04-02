package com.hcltech.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.hcltech.service.CalcSeries;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
public class TestSumOfNaturalNos {

	static CalcSeries series;
	
	@BeforeAll
	public static void beforeAll(){
		series = new CalcSeries();
	}
	
	@Tag("dev")
	@Tag("qa")
	@Test
	public void testSumNaturalNos1() {
		assertEquals(55, series.sumNaturalNos(10));
	}
	
	@Tag("dev")
	@Test
	public void testSumNaturalNos2() {
		assertTimeout(Duration.ofNanos(2), ()->series.sumNaturalNos(1000));
	}
	
	@Tag("dev")
	@Test
	public void testSumNaturalNos3() {
		assertTimeout(Duration.ofNanos(2), ()->series.sumNaturalNos(10000));
	}
	
	@Tag("dev")
	@Test
	public void testSumNaturalNos4() {
		assertTimeout(Duration.ofNanos(2), ()->series.sumNaturalNos(100000));
	}
	
	@Tag("dev")
	@Test
	public void testSumNaturalNos5() {
		assertTimeout(Duration.ofNanos(2), ()->series.sumNaturalNos(1000000));
	}
	@Tag("dev")
	@Tag("qa")
	@RepeatedTest(3)
	public void testSumNaturalNos6() {
		assertTimeout(Duration.ofNanos(2), ()->series.sumNaturalNos(10000000));
	}
}







