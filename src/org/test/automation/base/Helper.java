package org.test.automation.base;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.test.automation.exception.FrameWorkException;

/**
 * 
 * @author Srinivas Goud Nakka
 *
 */
public class Helper extends BrowserManager {

	public static Duration EXPLICIT_TIMEOUT = Duration.ofSeconds(30);
	public static boolean flag = false;

	public static WebElement getelement(By locator) throws FrameWorkException {
		//Helper.verifyElementLocator(locator);
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(_Driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			element = _Driver.findElement(locator);
		} catch (TimeoutException toe) {
			throw new FrameWorkException("Locator not available: " + locator);
		}

		return element;

	}

	public static List<WebElement> getelements(By locator) throws FrameWorkException {
		List<WebElement> elements = null;

		WebDriverWait wait = new WebDriverWait(_Driver, Duration.ofSeconds(5));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			elements = _Driver.findElements(locator);
		} catch (TimeoutException toe) {
			throw new FrameWorkException("Locator not available: " + locator);
		}

		return elements;

	}

	public static void click(By locator) throws FrameWorkException {
		getelement(locator).click();
		waitForPagetoLoad();
	}

	public static void enterText(By locator, String value) throws FrameWorkException {
		
		getelement(locator).sendKeys(value);
	}

	public static boolean isElementDisplayed(By locator) throws FrameWorkException {
		return getelement(locator).isDisplayed();
	}

	public static String getCSSValue(By locator, String attribute) throws FrameWorkException {
		return getelement(locator).getCssValue(attribute);
	}

	public static ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
		@Override
		public Boolean apply(WebDriver driver) {
			try {
				return (Boolean) ((JavascriptExecutor) driver)
						.executeScript("return window.jQuery != undefined || jQuery.active == 0");
			} catch (Exception e) {
				return true;
			}
		}
	};

	public static ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
		@Override
		public Boolean apply(WebDriver driver) {

			return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
					.equals("complete");
		}
	};
	public static ExpectedCondition<Boolean> xhrLoad = new ExpectedCondition<Boolean>() {
		@Override
		public Boolean apply(WebDriver driver) {
			return ((JavascriptExecutor) driver).executeScript("return XMLHttpRequest.DONE").toString().equals("4");
		}
	};

	static HttpURLConnection con = null;

	public static boolean browserResponse() {
		try {
			HttpURLConnection.setFollowRedirects(true);

			con = (HttpURLConnection) new URL(_Driver.getCurrentUrl()).openConnection();
			con.setRequestMethod("HEAD");

			return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
		} catch (Exception e) {
			// e.printStackTrace();
			return false;
		}
	}

	public static void waitForPagetoLoad() {
		try {
			// 0.5 second delay beyond which we could say slow performance
			Thread.sleep(500);
			WebDriverWait wait = new WebDriverWait(_Driver, EXPLICIT_TIMEOUT);
			flag = wait.until(jQueryLoad) && wait.until(jsLoad) && wait.until(xhrLoad);
			browserResponse();

		} catch (Exception e) {
			// System.out.println("wait for page to load exception");
			browserResponse();
		}
	}

	public static void navigateBack() {
		_Driver.navigate().back();
		waitForPagetoLoad();
	}

	public static String getOSType() {
		return System.getProperty("os.name").toUpperCase();
	}

	public static String getFileSeparator() {
		String OS = System.getProperty("os.name");
		String fs = "";
		System.out.println("Windows: "+OS.contains("Windows"));
		if (OS.contains("WINDOWS")||OS.contains("Windows")) {
			fs = "\\";
		} else if (OS.equalsIgnoreCase("MAC") || OS.equalsIgnoreCase("LINUX")) {
			fs = "/";
		}
		return fs;
	}

	public static boolean verifyElementLocator(By locator) throws FrameWorkException {

		boolean flag = false;
		String by = locator.toString().split(":")[0].trim();
		String loc = locator.toString().split(":")[1].trim();
		List<WebElement> listOFElements = _Driver.findElements(By.tagName("input"));
		for (int i = 0; i < listOFElements.size(); i++) {
			if (by.contains("id")) {
				if (listOFElements.get(i).getAttribute("id").equals(loc)) {
					flag = true;
				}
			} else if (by.contains("name")) {
				if (listOFElements.get(i).getAttribute("name").equals(loc)) {
					flag = true;
				}
			} else if (by.contains("className") || by.contains("cssSelector")) {
				if (listOFElements.get(i).getAttribute("class").contains(loc)) {
					flag = true;
				}
			} else if (by.contains("tagName")) {
				if (listOFElements.get(i).getAttribute("tagName").equals(loc)) {
					flag = true;
				}
			}
		}
		if(!flag)
		{
			throw new FrameWorkException("Locator changed. Looking for "+locator+ ", But its not available in DOM");
		}

		return flag;
	}

}
