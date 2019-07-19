import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class swipedemos extends base {

	private static AndroidDriver<AndroidElement> driver;

	public static void main(String[] args) throws MalformedURLException {
		driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='2. Inline']")).click();
		driver.findElement(By.xpath("//*[@content-desc='9']")).click();
		TouchAction t = new TouchAction(driver);
		WebElement webelement1 = driver.findElement(By.xpath("//*[@content-desc='15']"));
		WebElement webelement2 = driver.findElement(By.xpath("//*[@content-desc='45']"));	
		t.longPress(longPressOptions().withElement(element(webelement1)).withDuration(ofSeconds(2))).moveTo(element(webelement2)).release().perform();
}}
