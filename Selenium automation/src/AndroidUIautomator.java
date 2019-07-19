import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidUIautomator extends base {

	private static AndroidDriver<AndroidElement> driver;

	public static void main(String[] args) throws MalformedURLException {
		driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	
		driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		int a=driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();
		System.out.println(a);
}
}