package com.hcltech.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.hcltech.exceptions.PalindromeException;
import com.hcltech.service.PalindromeService;
//@Disabled
public class TestPalindrome {

	static PalindromeService service;
	
	@BeforeAll
	public static void beforeAll() {
		service = new PalindromeService();
		
	}
	
	@Disabled
	@Test
	@DisplayName("Test nitin")
	@Tag("dev")
	public void testPalindrome1() {
		Assertions.assertTrue(service.findPalindrome("nitin"));
	}
	
	@Disabled
	@Test
	@DisplayName("Test NiTIn")
	@Tag("dev")
	@Tag("qa")
	public void testPalindrome2() {
		Assertions.assertTrue(service.findPalindrome("NiTIn"));
	}
	
	@Tag("dev")
	@Test
	@DisplayName("Test rama")
	public void testPalindrome3() {
		Assertions.assertFalse(service.findPalindrome("rama"));
	}
	
	@Tag("dev")
	@Test
	@DisplayName("Test null string")
	public void testPalindrome4() {
		Assertions.assertThrows(PalindromeException.class, ()->service.findPalindrome(null));
	}
	
	@Tag("dev")
	@Tag("qa")
	@DisplayName("Test palindrome strings")
	@ParameterizedTest
	@ValueSource(strings={"malayalam", "MadAM", "Rotator"})
	public void testPalindrome5(String str) {
		Assertions.assertTrue(service.findPalindrome(str));
	}
	
	@Tag("dev")
	@Tag("qa")
	@DisplayName("Test invalid palindrome strings")
	@ParameterizedTest
	@ValueSource(strings={"a", "", "    ", "ab123", "a$b_"})
	public void testPalindrome6(String str) {
		Assertions.assertThrows(PalindromeException.class, ()->service.findPalindrome(str));
	}
}





