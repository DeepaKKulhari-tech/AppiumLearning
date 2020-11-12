/*
 * import java.io.File; import java.net.MalformedURLException; import
 * java.net.URL;
 * 
 * import org.openqa.selenium.By; import
 * org.openqa.selenium.remote.DesiredCapabilities;
 * 
 * import io.appium.java_client.MobileElement; import
 * io.appium.java_client.android.AndroidDriver; import
 * io.appium.java_client.android.AndroidElement; import
 * io.appium.java_client.remote.MobileCapabilityType;
 * 
 * public class AppiumPg {
 * 
 * public static void main(String[] args) throws MalformedURLException { // TODO
 * Auto-generated method stub
 * 
 * File f=new File("src"); File fs=new File(f,"APiDemos-Debug.apk");
 * 
 * 
 * DesiredCapabilities cap=new DesiredCapabilities();
 * cap.setCapability(MobileCapabilityType.DEVICE_NAME, "DkNexus5.1");
 * cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
 * 
 * String url= "http://127.0.0.1:4723/wd/hub";
 * 
 * URL con = new URL(url.format(format, args));
 * 
 * AndroidDriver<MobileElement> ad=new AndroidDriver<>(con,cap);
 * ad.findElement(By.className("android.widget.TextView")).click(); }
 * 
 * }
 */