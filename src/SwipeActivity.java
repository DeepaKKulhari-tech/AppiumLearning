import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class SwipeActivity extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Inline\")").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();
		WebElement Fifteen = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement FortyFive = driver.findElementByXPath("//*[@content-desc='45']");

		// For any gestures we will be using TouchAction Class
		//swipe from one element to another to element

		TouchAction t = new TouchAction(driver);
		t.longPress(longPressOptions().withElement(element(Fifteen)).withDuration(ofSeconds(2)))
				.moveTo(element(FortyFive)).release().perform();

	}

}
