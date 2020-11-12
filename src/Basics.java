import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HomePage;

public class Basics extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		// It will bring the driver object from the base class
		AndroidDriver<AndroidElement> driver = capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Tag name is TextView which also the class name and @Text is attribute name

		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();

		// OR
		// In PageObjectFactory way, it can be written in this way
		HomePage Hp = new HomePage(driver);
		Hp.Preferences.click();

		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		// Same Xpath will be differentiated by index [2]...index starting from 1
		// this is for handling duplicate instances
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();

		driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
		// Another method for handling duplicate instances...use findElements and use
		// get method with index..Here starting index is 0

		driver.findElementsByClassName("android.widget.Button").get(1).click();

		// OR
		// In PageObjectFactory way, it can be written in this way

		Hp.button.get(1).click();

		// Using UI automator instead of by XPATH format is attribute(value) and \ is
		// used when using quote inside quote
		// SYNTAX :driver.findElementsByAndroidUIAutomator("Attribute(value)");
		driver.navigate().back();
		driver.navigate().back();

		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		// validate the clickable properties of the elements on the screen
		// SYNTAX : driver.findElementsByAndroidUIAutomator("new
		// UiSelector().Property(value)");
		int size = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();
		System.out.println("size of all the clickable properties: " + size);

		System.out.println("Final");

	}

}
