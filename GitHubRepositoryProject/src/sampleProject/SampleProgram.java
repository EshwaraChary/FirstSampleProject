package sampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleProgram {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\driver's\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.guru99.com/take-screenshot-selenium-webdriver.html#3");
		driver.findElement(By.id("")).sendKeys("");

	}

}
