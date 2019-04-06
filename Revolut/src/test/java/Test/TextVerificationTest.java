package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utils.BaseClass;
import junit.framework.Assert;

public class TextVerificationTest extends BaseClass{
	@Test
	public void TextVerification() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("search-field"))).click().sendKeys("We got a banking licence")
		.build().perform();
		driver.findElement(By.xpath("//a[contains(@href,'/we-got-a-banking-licence/')]")).click();
		WebElement text=driver.findElement(By.xpath("//h1[contains(@class,'post-full-title')]"));
		System.out.println(text.getText());
		boolean text1=text.isDisplayed();
		Assert.assertEquals(true,text1);
		
		
		
	}

}
