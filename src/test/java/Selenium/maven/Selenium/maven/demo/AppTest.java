package Selenium.maven.Selenium.maven.demo;

import static org.junit.Assert.assertTrue;

//import java.awt.List;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
//  public static WebDriver driver;
 
  @Test
  public void BrowserTest() throws InterruptedException {
	  
		  System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32\\chromedriver.exe");
		  WebDriver chromedriver= new ChromeDriver();
		//  String baseUrl = "https://accounts.simplilearn.com/user/login?redirect_url=https%3A%2F%2Flms.simplilearn.com%2F";
		// String expectedTitle = "Hello Selenium";
		//String actualTitle ="";
	        String baseUrl = "http://demo.guru99.com/test/upload/";

		chromedriver.get(baseUrl);
	//	String actualTitle = chromedriver.getTitle();
	//	String expectedTitle = "Online Certification Training Courses for Professionals | Simplilearn";
	//	System.out.println(actualTitle);
		
		// new code
		
		WebElement uploadElement = chromedriver.findElement(By.id("uploadfile_0"));
        uploadElement.sendKeys("C:\\Users\\Ashwini\\Desktop\\HowtoUpload.html");
        chromedriver.findElement(By.id("terms")).click();
        chromedriver.findElement(By.id("submitbuttonVV ")).click();

        
        
	//Login
	/*			
		WebElement email = chromedriver.findElement(By.name("user_login"));
		WebElement password = chromedriver.findElement(By.name("user_pwd"));
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefgh");
		email.clear();			
        password.clear();
		System.out.println("Text field cleared");
		
		WebElement login =chromedriver.findElement(By.name("btn_login"));
		
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefgh");
		login.click();
		System.out.println("Login Done with Click");
		
	/*
		chromedriver.get(baseUrl);
		chromedriver.findElement(By.name("user_login")).sendKeys("abcd@gmail.com");							
        chromedriver.findElement(By.name("user_pwd")).sendKeys("abcdefghlkjl");							
        chromedriver.findElement(By.id("SubmitLogin")).submit();					
        System.out.println("Login Done with Submit");					
         
		//driver.close();
	//	chromedriver.findElement(By.id("header_srch")).sendKeys("Selenium");
	//	chromedriver.findElement(By.id("pass")).sendKeys("poora");
		/*
		chromedriver.findElement(By.xpath("//SPAN[@class='search_icon input-search-icon']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		chromedriver.findElement(By.xpath("//H2[@class='default-text-bold ng-binding'][text()='Selenium 3.0 Training']")).click();
		Thread.sleep(2000);
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed");			
		} else {
			System.out.println("Test Failed");
		} 
		*/
		
		System.out.println("Ran this code");
		
	//	chromedriver.findElement(By.xpath("//A[@class='btn opt-btn'][text()='Enroll now']")).click();
		/*
		List<WebElement> elements = chromedriver.findElements(By.name("tags"));
			System.out.println("Number of elements:" +elements.size());
			
			for(int i=0; i<elements.size();i++) {
				System.out.println("Radio Button text:" +elements.get(i).getAttribute("placeholder"));
			}
			
			System.out.println("==================================");
			
			WebElement element = chromedriver.findElement(By.name("tags"));
			System.out.println("element is "+ element.getAttribute("placeholder"));
			
		
		chromedriver.close();
		
		//chromedriver.close();
		//System.exit(0);
		//chromedriver.quit();
		System.out.println("ran this");
		*/
		chromedriver.close();
		System.out.println("GIT COMMANDS");
	  }
  }
   