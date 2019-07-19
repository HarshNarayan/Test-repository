import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base {

	private static AndroidDriver<AndroidElement> driver;

	public static void main(String[] args) throws MalformedURLException {
		driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/title' and @text='WiFi settings']")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='android:id/edittext_container']")).sendKeys("Harsh");
		driver.findElement(By.xpath("//android.widget.Button[@resource-id='android:id/button1']")).click();
		System.out.println("B");	
	}

}