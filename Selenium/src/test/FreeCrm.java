package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCrm {

	public static void main(String[] args) throws Exception  {
		
	System.setProperty("webdriver.chrome.driver","/Users/suchitraloka/Downloads/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("Suchi");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[2]")).sendKeys("Loka");
		//Thread.sleep(3000);
		System.out.println("Print");
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/a[1]/small")).getText());
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		

	}

}
