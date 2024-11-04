package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumMethods {
	/*
	 * Browser Methods-->get,gettitle,getcurrenturl,close,quit
	 * Navigation methods
	 * Webelement methods-->findelement,click,sendkeys,getattributre,getcssvalue,clear,gettext
	 * swtich
	 * wait
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D:\\Automat\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
	/*	System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		*/
	/*	driver.findElement(By.xpath("//*[@id='header']/nav/div/div[2]/ul/li[3]/a")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().to("https://www.flipkart.com");
		*/
		
//	System.out.println(	driver.findElement(By.xpath("//*[@id='section']/div/h2")).getText());
		WebElement e=driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"));
		e.sendKeys("tom");
		driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"));
		
	//System.out.println(	driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input")).getAttribute("class"));
		
	//System.out.println(	driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input")).getTagName());

	//	System.out.println(	driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/h1")).getCssValue("font"));
		
		
		
	}

}
