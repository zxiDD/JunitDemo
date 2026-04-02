package com.hcltech.test;

import org.junit.jupiter.api.Test;

import com.hcltech.service.EmpService;
import com.hcltech.service.EmpService.Emp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
public class TestEmpService {

	public static EmpService service = EmpService.getServiceInstance();
	public static Emp emp1;
	public static List<String> expectedLst;
	
	@BeforeAll
	public static void beforeAll() {
		emp1 = EmpService.map.get(1001);
		expectedLst = Arrays.asList("rama", "sam", "david");
	}
	
	
	@Test
	public void testFindById1() {
		assertEquals(emp1, service.findByEmpId(1001));
	}
	
	@Test
	public void testFindById2() {
		assertNotNull(service.findByEmpId(1001));
	}
	
	@Test
	public void testFindById3() {
		assertNull(service.findByEmpId(2001));
	}
	
	@Test
	public void testServiceSingleton() {
		assertSame(service, EmpService.getServiceInstance());
	}
	
	@Test
	public void testEmpNames1() {
		assertTrue(service.getEmpNames().size() == expectedLst.size());
	}
	
	@Test
	public void testEmpNames2() {
		assertArrayEquals(expectedLst.toArray(), service.getEmpNames().toArray());
	}
	
}



