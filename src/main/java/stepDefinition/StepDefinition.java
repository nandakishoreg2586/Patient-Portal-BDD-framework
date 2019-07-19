//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;
//
//public class StepDefinition {
//
//	private static final Class<Object> String = null;
//	public WebDriver driver;
//	private String baseUrl = "https://www.nextmd.com/ud2/Login/Login.aspx";
//	  
//	@Before
//	public void setup()
//	{
//		 WebDriverManager.chromedriver().setup();
//	     driver = new ChromeDriver();
//	     driver.manage().window().maximize();
//	    driver.get(baseUrl);
//	}
//	
//	@After
//	public void teardowm()
//	{
//		driver.close();
//		driver.quit();
//	}
//
//	@Given("^user enters username and password$")
//	public void user_enters_username_and_password() {
//		driver.findElement(By.name("ctl00$ContentPlaceHolder1$Login2$txtUserName")).sendKeys("Nkjune@20");
//		driver.findElement(By.name("ctl00$ContentPlaceHolder1$Login2$txtPassword")).sendKeys("Nkjune@20");		
//
//	}
//
//	@Then("^user click on login button$")
//	public void user_click_on_login_button() {
//		driver.findElement(By.name("ctl00$ContentPlaceHolder1$Login2$btnLogin1")).click();
//	}
//
//	@Then("^user is navigated to dashboard$")
//	public void user_is_navigated_to_dashboard() {
//		String Tname = driver.getTitle();
//		Assert.assertEquals(Tname, "Dashboard - Patient Portal");
//	}
//	
//	
//	
//}
