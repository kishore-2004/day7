package day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1 {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		driver.manage().window().maximize();
		String p = driver.getTitle();
		String expectedtitle = "Guest Registration Form – User Registration";
		Assert.assertEquals(p,expectedtitle);
  }
}
