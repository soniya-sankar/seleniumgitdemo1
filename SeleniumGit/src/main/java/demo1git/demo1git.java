package demo1git;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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
	@org.testng.annotations.Test
    public void Test1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soniya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();			
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        //Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();		
	}
	@org.testng.annotations.Test
    public void Test2() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soniya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//Classname
		int sliders=driver.findElements(By.className("homeslider-container")).size();
		System.out.println(sliders);
		//Tagname
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		
		driver.findElement(By.className("login")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		/*
		//Create an account 
		driver.findElement(By.id("email_create")).sendKeys("soniyashree225@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("soniya");
		driver.findElement(By.id("customer_lastname")).sendKeys("sankar");
		driver.findElement(By.id("passwd")).sendKeys("sankar");
		WebElement day=driver.findElement(By.id("days"));
		Select day_1=new Select(day);
		day_1.selectByValue("22");
		WebElement month=driver.findElement(By.id("months"));
		Select month_1=new Select(month);
		month_1.selectByValue("5");
		WebElement year=driver.findElement(By.id("years"));
		Select year_1=new Select(year);
		year_1.selectByValue("1998");
		driver.findElement(By.id("address1")).sendKeys("17,nethaji street");
		driver.findElement(By.id("city")).sendKeys("Madurai");
		WebElement state=driver.findElement(By.id("id_state"));
		Select state_1=new Select(state);
		state_1.selectByValue("47");
		driver.findElement(By.id("postcode")).sendKeys("98003");
		WebElement country=driver.findElement(By.id("id_country"));
		Select country_1=new Select(country);
		country_1.selectByValue("21");
		driver.findElement(By.id("phone_mobile")).sendKeys("123456789");
		driver.findElement(By.id("submitAccount")).click();*/
		//Already Registered
		driver.findElement(By.id("email")).sendKeys("soniyashree225@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("sankar");
		driver.findElement(By.id("SubmitLogin")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Mouseover an element
		WebElement women=driver.findElement(By.linkText("Women"));
		Actions action=new Actions(driver);
		action.moveToElement(women).perform();
		driver.findElement(By.linkText("T-shirts")).click();
	}

	
}
