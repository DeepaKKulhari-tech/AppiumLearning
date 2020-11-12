
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class ChromeBrowserTest extends Base {

	public static void main(String args[]) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = capabilities("emulator");
		driver.get("http://facebook.com/");
		driver.findElementByXPath("//*[@id='m_login_email']").sendKeys("deepak");
		driver.findElementByXPath("//*[@id='m_login_password']").sendKeys("kumar");
		driver.findElementByXPath("//*[@name='login']").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("WEB Browser test end");
		// this is invoke CromeBrowser.exe. Use below line to start the Appium chrome in
		// case it cause error
		// C:\Users\deepak.kumar\AppData\Roaming\npm\node_modules\appium\node_modules\appium-chromedriver\chromedriver\win

	}
}
