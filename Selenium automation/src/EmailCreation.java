import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailCreation {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.findElement(By.xpath("(//a[@data-pid='23'])[1]")).click();
		driver.findElement(By.xpath("//a[@class='gmail-nav__nav-link gmail-nav__nav-link__create-account']")).click();
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();

		String title = driver.getTitle();
		
		Set<String> s = driver.getWindowHandles();

		for(String windowtitle: s) {
			System.out.println("page title is:" + windowtitle);
			driver.switchTo().window(windowtitle);
		}
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 50); WebElement element =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//p[@class='FgbZLd']"))); element.click();
		 */
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("firstName")).sendKeys("Harsh");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Harsh");
		;
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Narayan");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("h1.smarten");
		driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[1]")).sendKeys("Smarten1");
		driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[2]")).sendKeys("Smarten1");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Phone number']")).sendKeys("8197130679");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();

		System.out.println("Created");

	}

}
