package pages;

import static utilities.BaseDriverSetup.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
	
	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);
	}

	public void writeText (By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	
	public void clickOnElement(By locator) {
		getElement(locator).click();
	}
	
	public void moveOnElement(By locator)
	{
		Actions action = new Actions(getDriver());
		action.moveToElement(getElement(locator)).perform();
	}
	
	public void hoverOnElement(By locator)
	{
		Actions action = new Actions(getDriver());
		action.clickAndHold(getElement(locator)).perform();
	}
	
	public void scrollToElemnt(By loactor) {
		WebElement el = getElement(loactor);
		JavascriptExecutor js =(JavascriptExecutor)getDriver();
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("arguments[0].scrollIntoView();", el);
	}
	
	public void closedPopup(By locator) {
		List<WebElement> popups = getDriver().findElements(locator);
		for(WebElement popup : popups) {
			try {
				popup.click();
			} catch (Exception e) {
				System.out.println("Popup Not found to perform close action");
			}
		}
	}

}
