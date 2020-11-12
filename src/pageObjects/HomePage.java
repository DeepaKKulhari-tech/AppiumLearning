package pageObjects;

	

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class HomePage {

	public HomePage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
    @AndroidFindBy(xpath="//android.widget.TextVeiw[@text='Preference']")
	public WebElement Preferences;
    
    @AndroidFindBy(className="android.widget.Button")
    public List<WebElement> button;
	
	
	
	 //findElementbyXpath("//*[@text='Preference']");
}
