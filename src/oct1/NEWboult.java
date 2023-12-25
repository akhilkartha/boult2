package oct1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NEWboult {
	ChromeDriver driver ;

	@BeforeTest
	public void setup()
	{
		
	
		ChromeOptions options =new ChromeOptions();
		//options.addArguments("--disable-notifications");
		
		driver=new ChromeDriver(options);
		driver.get("https://www.boultaudio.com/"); 
			
	}

	@Test
	public void test() throws Exception
	{	Actions act = new Actions(driver);
		driver.manage().window().maximize();
		
		//*[@id="wzrk-cancel"]
		driver.findElement(By.xpath("//*[@id='wzrk-cancel']")).click();
		driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/sticky-header/header/div/div[2]/a")).click();
		//*[@id="MainContent"]/div/div/div[1]/a[2]

	//signup
		driver.findElement(By.xpath("//*[@id=\"MainContent\"]/div/div/div[1]/a[2]")).click();
	//name	
		driver.findElement(By.xpath("//*[@id=\"RegisterForm-FirstName\"]")).sendKeys("KARTHIKEYAN");
		driver.findElement(By.xpath("//*[@id=\"RegisterForm-LastName\"]")).sendKeys("T");
	//phone	
		driver.findElement(By.xpath("//*[@id=\"RegisterForm-Number\"]")).sendKeys("9446285052");
	//email	
		driver.findElement(By.xpath("//*[@id=\"RegisterForm-email\"]")).sendKeys("tkarthikeyan115@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"RegisterForm-password\"]")).sendKeys("strongpass123@");
	
		//driver.manage().window().minimize();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\"Details-HeaderMenu-1\"]/summary/span")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.xpath("//*[@id=\"create_customer\"]/button")).click();
		 
		
		//login page
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(200));
		Thread.sleep(1000);
		JavascriptExecutor js2=(JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,350)");
		driver.findElement(By.xpath("//*[@id=\"CustomerEmail\"]")).sendKeys("tkarthikeyan115@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"CustomerPassword\"]")).sendKeys("strongpass123@");
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/button")).click();
		
		//shop by category
	Thread.sleep(1000);
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"Details-HeaderMenu-1\"]/summary/span"));
		act.moveToElement(ele).perform();
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"HeaderMenu-MenuList-1\"]/li[3]/a")));
		driver.findElement(By.xpath("//*[@id=\"HeaderMenu-MenuList-1\"]/li[3]/a")).click();
		//act.doubleClick();
		
	//NECKBAND GREEN
		//Thread.sleep(500);
		JavascriptExecutor js3=(JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,450)");
		driver.findElement(By.xpath("//*[@id=\"product-grid\"]/li[6]/div/div/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ProductInfo-template--14996713799749__main\"]/div[6]/variant-radios/div/fieldset/div[2]/label")).click();

		//*[@id="ProductInfo-template--14996713799749__main"]/div[6]/variant-radios/div/fieldset/div[2]/label
		
		

		//*[@id="customer_login"]/button
		//*[@id="CustomerEmail"]
		
		//driver.findElement(By.xpath("//*[@id=\"HeaderMenu-MenuList-1\"]/li[3]/a")).click();

		 
	//	driver.findElement(By.xpath("//*[@id=\"create_customer\"]/button")).click();

	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));	
	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	/*	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ele=driver.findElement(By.xpath("//*[@id=\\\"create_customer\\\"]/button"));
		act.moveToElement(ele).perform();
		act.click();*/
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
	//	driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
		//act.doubleClick();
		
		
		 
	//	driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
	/*	driver.switchTo().alert().accept();
		WebElement doubleclk=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclk).perform();
		Alert a=driver.switchTo().alert();
		String t=a.getText();
		System.out.println(" text : "+t);
		a.accept();
*/

	}

}
