import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
//imp
import static io.appium.java_client.touch.TapOptions.tapOptions;
//imp
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//imp
import static java.time.Duration.ofSeconds;
//imp
import static io.appium.java_client.touch.offset.ElementOption.element;

public class TapAndLongPress extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
		// driver.findElementByAndroidUIAutomator("text[\"2. Inline\"]").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();

		WebElement first = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement second = driver.findElementByXPath("//*[@content-desc='45']");

		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		WebElement expandList = driver.findElementByAndroidUIAutomator("text(\"Expandable\")");

		TouchAction t = new TouchAction(driver);
		// tap options
		t.tap(tapOptions().withElement(element(expandList))).perform();

		// Long press
		t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(1))).moveTo(element((second)))
				.release().perform();
		// to verify the test case
		driver.findElementByAndroidUIAutomator("").isDisplayed();

		System.out.println("Final");

	}

}
