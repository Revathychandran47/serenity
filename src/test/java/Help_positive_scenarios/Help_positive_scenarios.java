package Help_positive_scenarios;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import Reusable_Functions.Generic_function;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Help_positive_scenarios extends Generic_function{
	public static boolean value;

	/*Browser launch*/
	@Given("Launch the URL")
	public void browser_launching() throws Exception {
		try {
			Browser_Launch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*TC 001 - Validate that the  'Frequently asked questions’ title  should be present in  Help page*/
	@When("Click on 'Help' tab")
	public void click_help() throws IOException {
		click("welcome_login");
		browser_wait(5000);
		driver.findElement(By.xpath(OR_reader( "login_phone_number"))).sendKeys(td_reader("login_phone_number",9));
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_password",5));
		click("login");
		//Thread.sleep(2000);
		browser_wait(1000);
		value = driver.findElement(By.xpath(OR_reader("header_logo"))).isDisplayed();
		Assert.assertEquals(true,value);
		browser_wait(1000);
		click("help");
	}
	@Then("verify the  Frequently asked questions title")
	public void help_positive_tc_001() throws Exception {
		try {
			browser_wait(5000);
			value = driver.findElement(By.xpath(OR_reader("header_frequently_asked"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("help_positive_tc_001");
		}		
	}

	/*TC 002 - Validate that the 'Second Opinions' title  should be present  and able to see description , when user click on Second Opinions title */
	@When("Click on Second Opinions title")
	public void click_second_opinion() throws Exception {
		try {
			browser_wait(1000);
			click("help_secondassert");
			browser_wait(3000);
			value = driver.findElement(By.xpath(OR_reader( "help_secondabout"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_second_opinion");
		}
	}

	@Then("Verify the Second Opinions description is displayed")
	public void help_positive_tc_002() throws Exception {
		try {
			browser_wait(1000);
			value = driver.findElement(By.xpath(OR_reader("help_secondassert"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("help_positive_tc_002");
		}
	}
	/*TC 003 - Validate that the 'Award Points' title  should be present  and able to see description , when user click on Award Points title  */
	@When("Click on Award Points title")
	public void click_award_points() throws Exception {
		try {
			browser_wait(2000);
			click("help_awardpoints");
			browser_wait(5000);
			value = driver.findElement(By.xpath(OR_reader("help_awardpointsabout"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_award_points");
		}
	}
	@Then("Verify the Award Points description is displayed")
	public void help_positive_tc_003() throws Exception {
		try {
			browser_wait(5000);
			value = driver.findElement(By.xpath(OR_reader("help_awardpoints"))).isDisplayed();
			Assert.assertEquals(true,value);

		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("help_positive_tc_003");
		}
	}


	/*TC 004 - Validate that the 'Referral' title  should be present  and able to see description , when user click on Referral title   */
	@When("Click on Referral title")
	public void click_referral_title() throws Exception {
		try {
			browser_wait(1000);
			click("help_referralassert");
			//browser_wait(5500);
			browser_explicit_wait("help_referralabout");
			value = driver.findElement(By.xpath(OR_reader("help_referralabout"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_referral_title");
		}
	}

	@Then("Verify the Referral description is displayed")
	public void help_positive_tc_004() throws Exception {
		try {
			//browser_wait(10);
			value = driver.findElement(By.xpath(OR_reader("help_referralassert"))).isDisplayed();
			Assert.assertEquals(true,value);

		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("help_positive_tc_004");
		}
	}
	/*TC 005 - Validate that the 'Profile' title  should be present  and able to see description , when user click on Profile title  */
	@When("Click on Profile title")
	public void click_profile_title() throws Exception {
		try {
			browser_wait(1000);
			click("help_profileassert");
			browser_wait(1000);
			value = driver.findElement(By.xpath(OR_reader("help_profileabout"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_profile_title");
		}
	}

	@Then("Verify the Profile description is displayed")
	public void help_positive_tc_005() throws Exception {
		try {
			browser_wait(1000);
			value = driver.findElement(By.xpath(OR_reader( "help_profileassert"))).isDisplayed();
			Assert.assertEquals(true,value);

		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("help_positive_tc_005");
		}
	}

	/*TC 006 - Validate that the 'Payments' title  should be present  and able to see description , when user click on Payments title  */
	@When("Click on Payments title")
	public void click_payments_title() throws Exception {
		try {
			browser_wait(2000);
			click("help_paymentassert");
			//browser_wait(6000);
			browser_explicit_wait("help_paymentabout");
			value = driver.findElement(By.xpath(OR_reader( "help_paymentabout"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_payments_title");
		}
	}
	@Then("Verify the Payments description is displayed")
	public void help_positive_tc_006() throws Exception {
		try {
			browser_wait(1000);
			scrolldown();
			browser_wait(2000);
			value = driver.findElement(By.xpath(OR_reader("help_paymentassert"))).isDisplayed();
			Assert.assertEquals(true,value);

		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("help_positive_tc_006");
		}
	}

	/*TC 007 - Validate that the 'Add coverage' title  should be present  and able to see description , when user click on Add coverage title   */
	@When("Click on Add coverage  title")
	public void click_addcoverage_title() throws Exception {
		try {
			browser_wait(2000);
			click("help_coverageassert");
			//browser_wait(5500);
			browser_explicit_wait("help_coverageabout");
			value = driver.findElement(By.xpath(OR_reader( "help_coverageabout"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("click_addcoverage_title");
		}
	}
	@Then("Verify the Add coverage description is displayed")
	public void help_positive_tc_007() throws Exception {
		try {
			browser_wait(2000);
			value = driver.findElement(By.xpath(OR_reader( "help_coverageassert"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("help_positive_tc_007");
		}
		click("logout");
		System.out.println("Help positive");
		driverquit();
	}
}