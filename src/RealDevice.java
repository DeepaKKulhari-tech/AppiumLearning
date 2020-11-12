import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import okhttp3.internal.platform.Platform;

public class RealDevice {

	public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver;

		// TODO Auto-generated method stub
		// Real Device Configuration
		 File appDir = new File("src");
	     File app = new File(appDir, "ApiDemos-debug.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		// for real devices
		//capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "net.one97.paytm");
		//capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "net.one97.paytm.AJRMainActivity");

		// capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");

		return driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		/*
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * driver.findElementByXPath("//android.widget.TextView[@text='Preference']").
		 * click(); driver.
		 * findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']"
		 * ).click(); driver.findElementById("android:id/checkbox").click();
		 * driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		 * driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
		 * driver.findElementsByClassName("android.widget.Button").get(1).click();
		 */

	}

}
