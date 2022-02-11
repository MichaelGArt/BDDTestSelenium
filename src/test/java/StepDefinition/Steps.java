package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.example.PageGoogle;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {

	private WebDriver driver;
	static ExtentReports extent;
	static ExtentTest test;
	private PageGoogle pageGoogle;


	@Before
	public void initDriver() {
	WebDriverManager.chromedriver().setup();
	extent = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
	test = extent.startTest("Steps");
	driver = new ChromeDriver();
	driver.get("https://www.google.com");
	pageGoogle = new PageGoogle(driver);
	}
//	
//	Steps(Scenario scenario){
//		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		//pgGoogle = new PageGoogle(driver);	
//	}

	@Given("^User opens the browser$")
	public void user_opens_the_browser() throws Throwable {
	}

	@Given("^User opens Google$")
	public void user_opens_Google() throws Throwable {
		driver.get("https://www.google.com");

		System.out.println("executed :  https://www.google.com");

	}

	@Given("^User verifies Gmail link exists$")
	public void user_verifies_Gmail_link_exists() throws Throwable {

		By gmailLink = By.xpath("(//*[@class='gb_d'])[1]");
		String gmailLinkName = driver.findElement(gmailLink).getText();
		System.out.println("gmailLinkName value is : " + gmailLinkName);

	}

	@Given("^User verifies Images link exists$")
	public void user_verifies_Images_link_exists() throws Throwable {
		System.out.println("executed but not implemented");

	}

	@Given("^User verifies About link exists$")
	public void user_verifies_About_link_exists() throws Throwable {
		System.out.println("executed but not implemented");

	}

	@Given("^User verifies Store link exists$")
	public void user_verifies_Store_link_exists() throws Throwable {
		System.out.println("executed but not implemented");

	}

	@Then("^User prints all the above link values$")
	public void user_prints_all_the_above_link_values() throws Throwable {
		System.out.println("executed but not implemented");

	}

	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) throws Throwable {
		System.out.println("executed" + arg1);

	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Throwable {
		System.out.println("executed" + arg1);

	}

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() throws Throwable {
		System.out.println("executed but not implemented");

	}

	@Then("^I verify the Fail in step$")
	public void i_verify_the_Fail_in_step() throws Throwable {
		System.out.println("executed but not implemented");

	}

	/***
	 * below are amazon step/feature methods , test cases
	 */
	@Given("^User verifies Prime link exists$")
	public void user_verifies_Prime_link_exists() throws Throwable {

	}

	@Given("^User verifies Books link exists$")
	public void user_verifies_Books_link_exists() throws Throwable {

	}

	@Given("^User verifies Registry link exists$")
	public void user_verifies_Registry_link_exists() throws Throwable {

	}

	@Then("^User prints all the amazon link values$")
	public void user_prints_all_the_amazon_link_values() throws Throwable {

	}

	@Then("^I want to verify the status with success$")
	public void i_want_to_verify_the_status_with_success() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^I want to verify the status with Fail$")
	public void i_want_to_verify_the_status_with_Fail() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	// BBC**********************************************************************************************************
	@Given("^User opens BBC$")
	public void user_opens_BBC() throws Throwable {
		driver.get("https://www.bbc.com/");
		if (pageGoogle.getMessageText().contains("BBC")) {
			test.log(LogStatus.PASS, "BBC page is available");
			} else {
			test.log(LogStatus.FAIL, "BBC page is available is not available");
			}
	}

	@Given("^User verifies the link News$")
	public void user_verifies_the_link_News() throws Throwable {
		System.out.println((pageGoogle.checkNewsLink() != "News") ? "User verifies the link News Excuted" : "User verifies the link News Failed");
		if (pageGoogle.checkNewsLink().contains("News")) {
			test.log(LogStatus.PASS, "News link is available");
			} else {
			test.log(LogStatus.FAIL, "News link is available is not available");
			}
	}

	@Given("^User verifies the link Sport$")
	public void user_verifies_the_link_Sport() throws Throwable {
		System.out.println((pageGoogle.checkSportLink() != "Sport") ? "User verifies the link Sport Excuted" : "User verifies the link Sport Failed");
		if (pageGoogle.checkSportLink().contains("Sport")) {
			test.log(LogStatus.PASS, "Sport link is available");
			} else {
			test.log(LogStatus.FAIL, "Sport link is available is not available");
			}
	}

	@Given("^User verifies the link Reel$")
	public void user_verifies_the_link_Reel() throws Throwable {
		System.out.println((pageGoogle.checkReelLink() != "Reel") ? "User verifies the link Reel Excuted" : "User verifies the link Reel Failed");
		if (pageGoogle.checkReelLink().contains("Reel")) {
			test.log(LogStatus.PASS, "Reel link is available");
			} else {
			test.log(LogStatus.FAIL, "Reel link is available is not available");
			}
	}
	
	@Given("^User verifies the link Worklife$")
	public void user_verifies_the_link_Worklife() throws Throwable {
		System.out.println((pageGoogle.checkWorklifeLink() != "Worklife") ? "User verifies the link Worklife Excuted" : "User verifies the link Worklife Failed");
		if (pageGoogle.checkWorklifeLink().contains("Worklife")) {
			test.log(LogStatus.PASS, "Worklife link is available");
			} else {
			test.log(LogStatus.FAIL, "Worklife link is available is not available");
			}
	}
	
	@Then("^Print out all above link values$")
	public void print_out_all_above_link_values() throws Throwable {
	}
	

	
	@After
	public void endReport() {
	try {
	driver.close();
	test.log(LogStatus.PASS, "Driver closed");
	} catch (Exception ex) {
	test.log(LogStatus.FAIL, "Driver close Failed");
	} finally {
	System.out.println("Driver close task is executed");
	}
	extent.endTest(test);
	extent.flush();
	extent.close();
	}


}
