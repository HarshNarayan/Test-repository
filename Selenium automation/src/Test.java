import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 class Test1 {
	void main1() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.navigate().refresh();
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");
	   
	    WebDriver driver1 = new ChromeDriver();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.get("https://www.google.com");
		driver1.navigate().refresh();
		driver1.navigate().to("https://www.flipkart.com");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		System.out.println("Harsh");
		driver1.findElement(By.xpath("//a[@href='/account/login?ret=/']")).click();
		driver1.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("harsh.testing@gmail.com");
		driver1.findElement(By.xpath("//input[@type='password']")).sendKeys("Harsh@11");
		driver1.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actualtitle = driver1.getTitle();
		
		String notitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Exclusive Offers!";
		System.out.println(actualtitle);
		driver1.manage().window().maximize();
		if (actualtitle.equals(notitle)) {
			System.out.println("Thank you harsh");
			
		}
		driver1.close();;

	}
	
}

class Test {
	
	public static void main(String[] args) {
		Test1 n=new Test1();
		n.main1();
		System.out.println("another method");
	}
	
}


