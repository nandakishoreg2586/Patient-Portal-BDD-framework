package stepDefinition;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.google.common.collect.Maps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginStepDefi{
	
	private static final Class<Object> String = null;
	public WebDriver driver;
	private String baseUrl = "https://www.nextmd.com/ud2/Login/Login.aspx";
	  
	Logger log = Logger.getLogger("devpinoyLogger");

	@Given("^user is in login page$")
	public void user_in_login_page()
	{
		log.debug("Browser Starts");
		 WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get(baseUrl);
	     log.debug("Browser Starts");
	}
	

	@When("^title of login page is Log into Patient Portal$")
	public void title_of_login_page_is_Log_into_Patient_Portal()  {
		String Tname = driver.getTitle();
		Assert.assertEquals(Tname, "Login - Patient Portal");
	}
	
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
	    
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$Login2$txtUserName")).sendKeys("Nkjune@20");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$Login2$txtPassword")).sendKeys("Nkjune@20");		
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button()  {
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$Login2$btnLogin1")).click();
	}

	@Then("^user is navigated to dashboard$")
	public void user_is_navigated_to_dashboard()  {
		String Tname = driver.getTitle();
		Assert.assertEquals(Tname, "Dashboard - Patient Portal");
	
	}
	
	  
	@Then("^user enters invalid username and password$")
	public void user_enters_invalid_username_and_password()  {
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$Login2$txtUserName")).sendKeys("Nkjune@201");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$Login2$txtPassword")).sendKeys("Nkjune@201");		
	}
	  
	

	@Then("^user is displayed with error message$")
	public void user_is_displayed_with_error_message() {
		String Tname = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Login2_lblErrorMessage")).getText();
		Assert.assertEquals(Tname, "The credentials entered are invalid. Please remember that password is case sensitive. Please try again.");
		driver.quit();
	}

	@Then("^user enters username \"([^\"]*)\" and password \"([^\"]*)\" from script$")
	public void user_enters_username_and_password_from_script(String arg1, String arg2) {
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$Login2$txtUserName")).sendKeys(arg1);
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$Login2$txtPassword")).sendKeys(arg2);	
	}


	@Then("^user click on Request PHR Link$")
	public void user_click_on_Request_PHR_Link() {
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("ctl00_ucHeader_lnkMyChartMenuItem"))).build().perform();
		driver.findElement(By.id("ctl00_ucHeader_lnkRequest_Health_Record")).click();
	}
	
	@Then("^user enters username and password from datatable$")
	public void user_enters_username_and_password_from_datatable(DataTable usnpwd) {
	     List <List<String>> UNPD = usnpwd.raw();
	 	driver.findElement(By.name("ctl00$ContentPlaceHolder1$Login2$txtUserName")).sendKeys(UNPD.get(0).get(0));
	 	driver.findElement(By.name("ctl00$ContentPlaceHolder1$Login2$txtPassword")).sendKeys(UNPD.get(0).get(1));	
	}
	
	@Then("^user enters username and password from MAPS$")
	public void user_enters_username_and_password_from_MAPS(DataTable Credentials) {
	    for(Map<String, String> data: Credentials.asMaps(String.class,String.class))
	    {
	    driver.findElement(By.name("ctl00$ContentPlaceHolder1$Login2$txtUserName")).sendKeys(data.get("username"));
	 	driver.findElement(By.name("ctl00$ContentPlaceHolder1$Login2$txtPassword")).sendKeys(data.get("password"));	
	    }
	}

	
	
}
