package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavascriptExecutorr {
	/*
	 * Javscriptexecutor is an interface
	 * 
	 * noraml operation
	 * highlighters
	 * scrrollings
	 *
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D:\\Automat\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		/*js.executeScript("document.getElementById('twotabsearchtextbox').value='oppo';");
		 * */
		 //  Highlighters
	/*	js.executeScript("document.getElementById('nav-search-submit-button').style.border='7px solid red';");
		js.executeScript("document.getElementById('twotabsearchtextbox').style.background='green';");
		*/
		
		
		// scroll
		//js.executeScript("window.scroll(200,300)");

	//	js.executeScript("window.scrollBy(200,300)");
	
	/*	WebElement e=driver.findElement(By.xpath("//div[text()='Make Money with Us']"));
		js.executeScript("arguments[0].scrollIntoView();", e);
		js.executeScript("window.scrollBy(-200,-300)");
		WebElement scr =driver.findElement(By.xpath("(//span[@class='a-color-base'])[2]"));
		*/
		js.executeScript("document.evaluate('(//span[@class='a-color-base'])[2]', documentNode, null, XPathResult.UNORDERED_NODE_ITERATOR_TYPE, null ).scrollLeft+=250","");

		

	}

}
