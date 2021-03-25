import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver;

		// TODO Auto-generated method stub
		File appDir = new File("src");
		File app = new File(appDir, "ApiDemos-debug.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		if (device.equals("emulator"))
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "DKPixel");
		else
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");

		//if we are running test in Chrome browser
		//capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		//capabilities.setCapability(MobileCapabilityType.BROWSER_VERSION, "2.16");
		//capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.setExperimentalOption("w3c", false);
		//capabilities.merge(chromeOptions);
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		

		return driver;
	}

}
