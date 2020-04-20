package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginStepDefinitions {
	WebDriver driver;
	
	@Before
	public void initialiseBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Given("^user is on the start up page$")
	public void user_is_on_the_start_up_page() {
		
		driver.get("https://www.freecrm.com/");
				
	}
	
	@When("^user clicks on Login option$")
	public void user_clicks_on_Login_option() {
	  		
		 driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
		
		//driver.findElement(By.linkText("Log In")).click();
		
	}
	
	@When("^user enters username and Password$")
	public void user_enters_username_and_Password() throws InterruptedException {
		
	driver.findElement(By.name("email")).sendKeys("naveenk");
	driver.findElement(By.name("password")).sendKeys("test@123");
    Thread.sleep(3000);
		
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		Thread.sleep(3000);
		
	}
	 
	@Then("^invalid user message is displayed$")
	public void invalid_user_message_is_displayed() {
		WebElement actualMessage = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]/p"));
		Assert.assertEquals("Invalid login", actualMessage.getText());
				
		
	}
	 
	@After
	public void closeBrowser() {
		driver.quit();
		//Exit driver
	}
	
	

}
