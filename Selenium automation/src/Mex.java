import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Mex extends base {

	private static AndroidDriver<AndroidElement> driver;

	public static void main(String[] args) throws MalformedURLException {
		driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); {
	
	
		}
}
}
