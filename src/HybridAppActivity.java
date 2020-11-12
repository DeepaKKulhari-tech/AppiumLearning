import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class HybridAppActivity extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Lists\"))");
		System.out.println("Native app context switch to Web");

		// ------------------------------------------------------------

		// This is to diplay all types of context: Native & Web view
		Thread.sleep(7000);
		Set<String> contexts = driver.getContextHandles();
		for (String s : contexts) {
			System.out.println("s");
		}
		//name of the context
		driver.context("");
		driver.findElementByXPath("//*[name='q']").sendKeys("Enter to the WEB Search");
		driver.findElementByXPath("//*[name='q']").sendKeys(Keys.ENTER);
		// this is to switch from WEB to NATIVE APP
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

	}

}
