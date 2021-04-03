package demo1git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1git {
	@org.testng.annotations.Test
	public void Test() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soniya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement searchbox=driver.findElement(By.id("search_query_top"));
		searchbox.sendKeys("summer");
		driver.findElement(By.name("submit_search")).click();
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		System.out.println("My first script");

	}

	
}
