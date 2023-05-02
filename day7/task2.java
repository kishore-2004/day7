package day7;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class task2 {
	int a,b,c;
  @Test(priority = 4)
  public void add() {
	  c=a+b;
	  Assert.assertEquals(c,(a+b));
	  
  }
  @Test(priority = 2)
  public void sub() {
	  c=a-b;
	  Assert.assertEquals(c,(a-b));
  }
  @Test(priority = 1)
  public void multi() {
	  c=a*b;
	  Assert.assertEquals(c,(a*b));
  }
  @Test(priority = 3)
  public void div() {
	  c=a/b;
	  Assert.assertEquals(c,(a/b));
  }
  @BeforeTest
  public void Before() {
	  Scanner sc = new Scanner(System.in);
	  a=sc.nextInt();
	  b=sc.nextInt();
	  
  }
  
  
}
