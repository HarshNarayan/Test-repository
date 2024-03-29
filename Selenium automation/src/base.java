import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		File f=new File("src");
		File fs=new File(f,"Mex.apk");
		DesiredCapabilities capbility=new DesiredCapabilities();
		capbility.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus5X");
		capbility.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capbility);
		return driver;

	}

}
