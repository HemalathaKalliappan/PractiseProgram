package SamplePrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestProgram  {
	public static void main(String[] args) throws InterruptedException {

		
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver d1 = new ChromeDriver();
	    d1.get("https://www.hotstar.com/");
	    //d1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    d1.manage().window().maximize();
		//driver.findElement(By.xpath("//a=[@href='https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/3510/133510-v']")).click();
	    d1.findElement(By.id("searchField")).sendKeys("hello");
	    Thread.sleep(2000);
	    List<WebElement> y1 =d1.findElements(By.xpath("//article[@class=\"ripple movie-card normal search-card\"]"));
	    y1.get(0).click();
		
	}
	

	public static void ClickOn(WebDriver driver, WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.stalenessOf(element));
		element.click();
	}


	

}
