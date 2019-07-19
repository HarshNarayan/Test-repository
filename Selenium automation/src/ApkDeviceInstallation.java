import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class ApkDeviceInstallation {

	public static void main(String[] args) throws MalformedURLException {
		
			File f=new File("src");
			File fs=new File(f,"Siemens.apk");
			DesiredCapabilities capbility=new DesiredCapabilities();
			capbility.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
			capbility.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
			capbility.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
			
			capbility.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
			AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capbility);
		
		}

	}


