import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
public class DragAndDropActivity extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"View\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();

		WebElement src = driver.findElementsByClassName("android.view.View").get(0);
		WebElement dest = driver.findElementsByClassName("android.view.View").get(1);

		TouchAction t = new TouchAction(driver);
		t.longPress(element(src)).moveTo(element(dest)).release().perform();

	}

}
