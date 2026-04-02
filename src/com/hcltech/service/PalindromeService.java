package com.hcltech.service;

import com.hcltech.exceptions.PalindromeException;

public class PalindromeService {

	
	public boolean findPalindrome(String str) {
		if(null == str) throw new PalindromeException();
		String trimmedString = str.trim();
		if(trimmedString.length() <=1)throw new PalindromeException();
		if(!trimmedString.matches("[a-zA-Z]+"))throw new PalindromeException();
		StringBuilder sb = new StringBuilder(trimmedString);
		String rev = sb.reverse().toString();
		if(str.equalsIgnoreCase(rev))	return true;
		return false;
	}
}
