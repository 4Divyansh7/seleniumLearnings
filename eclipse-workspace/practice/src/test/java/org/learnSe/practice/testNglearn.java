package org.learnSe.practice;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testNglearn {
  @Test
  public void f() {
  }
  
  @Test
  public void m1() 
  {        
	  System.out.print("this is first method");
  }
  
  @Test
  public void m2() 
  {        
	  System.out.print("this is second method");
  }
  
  @AfterMethod
  public void aftermethod(){
	  System.out.println("this is before method");
	  Assert.fail();
  }
  
  
  
}
