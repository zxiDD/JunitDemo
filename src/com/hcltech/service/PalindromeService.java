package com.hcltech.service;

import com.hcltech.exceptions.PalindromeException;

public class PalindromeService {

	
	public boolean findPalindrome(String str) {
		if(null == str) throw new PalindromeException();
		String trimmedStr = str.trim();
		if(trimmedStr.length() <=1)throw new PalindromeException();
		if(!trimmedStr.matches("[a-zA-Z]+"))throw new PalindromeException();
		StringBuilder sb = new StringBuilder(trimmedStr);
		String rev = sb.reverse().toString();
		if(str.equalsIgnoreCase(rev))	return true;
		return false;
	}
}
