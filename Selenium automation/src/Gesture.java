import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static java.time.Duration.ofSeconds;

import static io.appium.java_client.touch.offset.ElementOption.element; 
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

public class Gesture extends base {
	
	private static AndroidDriver<AndroidElement> driver;

	public static void main(String[] args) throws MalformedURLException {
		driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		TouchAction t = new TouchAction(driver);
		WebElement webelement = driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']"));
		t.tap(tapOptions().withElement(element(webelement))).perform();
		driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
		WebElement webelement1 = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		t.longPress(longPressOptions().withElement(element(webelement1)).withDuration(ofSeconds(2))).release().perform();
		System.out.println(driver.findElement(By.id("android:id/title")).isDisplayed());
		
		
}}
