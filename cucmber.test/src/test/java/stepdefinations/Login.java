package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	public static WebDriver driver;
	
	@Given("Credit Manager is on home page")
	public void user_is_on_homepage() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Work\\Selenium\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@When("Credit Manager navigates to Login Page")
	public void user_navigates_to_login_page() throws Exception {

		driver.get("http://122.170.115.46:28484/qverify-app/login.xhtml?faces-redirect=true");
		System.out.println("**** User is on Home Screen of HDFC FI Application *****");
		Thread.sleep(3000);

	}

	@Then("success message is displayed")
	public void success_message_is_displayed() throws Exception {

		String actual = driver.getCurrentUrl();
		System.out.println("Application Actual Link is:" + actual);
		String Expected_url = "http://122.170.115.46:28484/qverify-app/login.xhtml?faces-redirect=true";
		System.out.println("Expected application url is:" + Expected_url);
		driver.quit();
		
			
	}

	
}
