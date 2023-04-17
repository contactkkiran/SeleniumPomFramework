package com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class TestNGTests {
  @Test(groups = {"Smoke"})
  @Parameters({"value1"})
  public void testCase1(String result) {
	  String expectResult = "Hello";
	  String actaulResult = result;
	  assertEquals(actaulResult, expectResult);
	  
  }
  
// @Test()
  public void testCase2() {
	 String expectResult = "Hello";
	  String actaulResult = "Hello";
	  assertEquals(actaulResult, expectResult);
  }
 
// @Test(groups = {"Smoke"})
 public void testCase3() {
	 String expectResult = "Hello";
	  String actaulResult = "hello";
	  assertEquals(actaulResult, expectResult);
 }
 
// @Test()
 public void testCase4() {
	 String expectResult = "Hello";
	  String actaulResult = "hello";
	  assertEquals(actaulResult, expectResult);
 }
 
  
//  @BeforeMethod
//  public void beforeMethod() {
//	  System.out.println("Before Method called");
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//	  System.out.println("After Method called");
//  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class called");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class called");
  }

  
}
