package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task5 {
  @Test(groups = "SmokeTest")
  public void f() {
	  WebDriverManager.edgedriver().setup();
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.godaddy.com/");
		Assert.assertEquals(driver.getTitle(), "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy INnull");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.godaddy.com/");
  }
  @Test(groups = "Regeression Tes	tcase")
  public void tset2() throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
	EdgeOptions co = new EdgeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver = new EdgeDriver(co);
	driver.manage().window().maximize();
	driver.get("https://www.godaddy.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
	  
  }
 
  
}

