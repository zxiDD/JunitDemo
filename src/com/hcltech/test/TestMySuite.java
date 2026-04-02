package com.hcltech.test;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

import org.junit.runners.Suite.SuiteClasses;

@Suite
@SuiteDisplayName("HCL Test suite")
@SelectClasses({TestCalcSeries.class, TestPalindrome.class, 
	TestAverageNosFromArray.class})
@IncludeTags({"qa"})
public class TestMySuite {

}
