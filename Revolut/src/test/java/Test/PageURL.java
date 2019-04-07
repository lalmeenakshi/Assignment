package Test;





import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseClass;

public class PageURL extends BaseClass {

	@Test
	public void VerifypageURL(){
		WebElement elementUS = driver.findElement(By.xpath("//*[contains(text(),'United States')]"));
	    JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",elementUS);
		elementUS.click();
		WebElement elementUK=driver.findElement(By.xpath("//*[contains(text(),'United Kingdom')]"));
		js.executeScript("arguments[0].scrollIntoView(true);",elementUK);
		elementUK.click();
		String URL=js.executeScript("return document.URL").toString();
	    System.out.println("PageURL----->" + URL);
	}

}