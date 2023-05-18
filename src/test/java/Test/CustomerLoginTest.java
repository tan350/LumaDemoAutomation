package Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.CustomerLoginPage;
import Pages.HomePage;
import TestBase.TestBaseLuma;

public class CustomerLoginTest extends TestBaseLuma {
	

	HomePage homepage;
	CustomerLoginPage  customerloginpage;
	public ExtentTest test;
	public ExtentReports extent;

	@BeforeSuite
	public void Launch() throws IOException, InterruptedException{
		initialization();
		customerloginpage=new CustomerLoginPage();
	}
	
	@BeforeTest
	public void generateReportinit() {
//		extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/AccountReport.html",true);	
//		extent=new ExtentReports("C:\\Users\\tasharma\\.jenkins\\workspace\\CustomerLogin\\CustomerLoginPageExtentReport.html",true);
		extent=new ExtentReports("D:\\workspace\\QA_Project3\\test-output\\LumaDemoExtentReports\\CustomerLoginPageExtentReport.html",true);
	}

	@AfterTest
	public void generateReportend() {
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 1)
	public void navigate_to_homepage_click_on_signin() {
		homepage= new HomePage();
		homepage.clickOnSignIn();
		
		test=extent.startTest("Verify whether Customer Login Page loads successfully..");
		test.log(LogStatus.INFO, "Navigate to Homepage and Sign-in Test is intiated.");
		test.log(LogStatus.INFO,"Verify Customer Login Page loads successfully.");

		String actual=driver.getTitle();
		String expected="Customer Login";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Customer Login Page loaded successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Customer Login Page is not loaded successfully.");
		}

		Assert.assertEquals(driver.getTitle(),"Customer Login");
	}
	
	@Test(priority = 2)
	public void visibility_customer_login_header() {
		
		test=extent.startTest("Verify whether Customer Login Header is visible properly on Customer Login page.");
		test.log(LogStatus.INFO, "Customer Login Header visibility Test is intiated.");
		test.log(LogStatus.INFO,"Verify Customer Login Header is visible properly on Customer Login page.");

		String actual=driver.getTitle();
		String expected="Customer Login";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Customer Login Header is visible properly on Customer Login page.");
		}
		else {
			test.log(LogStatus.FAIL, "Customer Login Header is not visible properly on Customer Login page.");
		}
		Assert.assertTrue(customerloginpage.customerLoginHeader().isDisplayed());
	}

	@Test(priority = 3)
	public void visibility_registered_customers_header() {
		
		test=extent.startTest("Verify whether Registered Customers Header is visible properly on Customer Login page.");
		test.log(LogStatus.INFO, "Registered Customers Header visibility Test is intiated.");
		test.log(LogStatus.INFO,"Verify Registered Customers Header is visible properly on Customer Login page.");

		String actual=driver.getTitle();
		String expected="Customer Login";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Registered Customers Header is visible properly on Customer Login page.");
		}
		else {
			test.log(LogStatus.FAIL, "Registered Customers Header is not visible properly on Customer Login page.");
		}
		Assert.assertTrue(customerloginpage.registeredCustomersHeader().isDisplayed());
	}
	
	@Test(priority = 4)
	public void verify_label_email_on_page(){
		
		test=extent.startTest("Verify whether Email label is visible properly with email text box on Customer Login page.");
		test.log(LogStatus.INFO, "Email label visibility Test is intiated.");
		test.log(LogStatus.INFO,"Verify Email label is visible properly with email text box on Customer Login page.");

		String actual=driver.getTitle();
		String expected="Customer Login";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Email label is visible properly with email text box on Customer Login page.");
		}
		else {
			test.log(LogStatus.FAIL, "Email label is not visible properly with email text box on Customer Login page.");
		}
		Assert.assertTrue(customerloginpage.labelEmail().isDisplayed());
	}
	
	@Test(priority = 5)
	public void verify_label_password_on_page(){
		
		test=extent.startTest("Verify whether Password label is visible properly with Password text box on Customer Login page.");
		test.log(LogStatus.INFO, "Password label visibility Test is intiated.");
		test.log(LogStatus.INFO,"Verify Password label is visible properly with Password text box on Customer Login page.");

		String actual=driver.getTitle();
		String expected="Customer Login";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Password label is visible properly with Password text box on Customer Login page.");
		}
		else {
			test.log(LogStatus.FAIL, "Password label is not visible properly with Password text box on Customer Login page.");
		}
		Assert.assertTrue(customerloginpage.labelPassword().isDisplayed());
	}
	
	@Test(priority = 6)
	public void visibility_try_demo_customer_access_dialog() {
		
		test=extent.startTest("Verify whether try demo customer accesss dialog is visible properly on Customer Login page.");
		test.log(LogStatus.INFO, "try demo customer accesss dialog visibility Test is intiated.");
		test.log(LogStatus.INFO,"Verify try demo customer accesss dialog is visible properly on Customer Login page.");

		String actual=driver.getTitle();
		String expected="Customer Login";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "try demo customer accesss dialog is visible properly on Customer Login page.");
		}
		else {
			test.log(LogStatus.FAIL, "try demo customer accesss dialog is not visible properly on Customer Login page.");
		}
		Assert.assertTrue(customerloginpage.tryDemoCustomerAccessDialog().isDisplayed());
	}
	
	@Test(priority = 7)
	public void createanaccountbutton_redirection() {
		customerloginpage.clickOnCreateAnAccountButton();
		
		test=extent.startTest("Verify whether Create an account button redirects to Create New Customer Account Page successfully.");
		test.log(LogStatus.INFO, "Create an account button redirection Test is intiated.");
		test.log(LogStatus.INFO,"Verify Create an account button redirects to Create New Customer Account Page successfully.");

		String actual=driver.getTitle();
		String expected="Create New Customer Account";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Create an account button redirects to Create New Customer Account Page successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Create an account button does not redirect to Create New Customer Account Page successfully.");
		}
		Assert.assertEquals(driver.getTitle(),"Create New Customer Account");
		driver.navigate().back();
	}
	
	@Test(priority = 8)
	public void forgotyourpasswordbutton_redirection() throws InterruptedException {
		homepage= new HomePage();
		homepage.clickOnSignIn();
		Thread.sleep(2000);
		customerloginpage.clickOnForgotYourPasswordButton();
		Thread.sleep(2000);
		test=extent.startTest("Verify whether Forgot Your Password redirects to Forgot Your Password? Page successfully.");
		test.log(LogStatus.INFO, "Forgot Your Password redirection Test is intiated.");
		test.log(LogStatus.INFO,"Verify Forgot Your Password redirects to Forgot Your Password? Page successfully.");

		String actual=driver.getTitle();
		String expected="Forgot Your Password?";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Forgot Your Password redirects to Forgot Your Password? Page successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Forgot Your Password does not redirect to Forgot Your Password? Page successfully.");
		}
		Assert.assertEquals(driver.getTitle(),"Forgot Your Password?");
		driver.navigate().back();
	}
	
	
	@Test(priority =9)
	public void sign_in_with_invalid_credentials() throws InterruptedException {
		customerloginpage.enterEmail(properties.getProperty("InvalidEmail"));
		customerloginpage.enterPassword(properties.getProperty("InvalidPassword"));
		Thread.sleep(2000);
		customerloginpage.clickOnsignInButton();
		
		test=extent.startTest("Verify that user should not able to sign-in in the application with invalid credentials. ");
		test.log(LogStatus.INFO, "Sign-in with invalid credentials Test is intiated.");
		test.log(LogStatus.INFO,"Verify user should not able to sign-in in the application with invalid credentials.");
		
		if(customerloginpage.errorMessageEmail().isDisplayed()) {
			test.log(LogStatus.PASS, "user should not able to sign-in in the application with invalid credentials.");
		}
		else {
			test.log(LogStatus.FAIL, "user should able to sign-in in the application with invalid credentials successfully.");
		}
		Assert.assertTrue(customerloginpage.errorMessageEmail().isDisplayed());
		driver.navigate().refresh();
	}
	
	@Test(priority = 10)
	public void sign_in_with_invalid_email() throws InterruptedException {
		customerloginpage.enterEmail(properties.getProperty("InvalidEmail"));
		customerloginpage.enterPassword(properties.getProperty("Password"));
		Thread.sleep(2000);
		customerloginpage.clickOnsignInButton();
		
		test=extent.startTest("Verify that user should not able to sign-in in the application with invalid email.");
		test.log(LogStatus.INFO, "Sign-in with invalid email Test is intiated.");
		test.log(LogStatus.INFO,"Verify user should not able to sign-in in the application with invalid email.");
		
		if(customerloginpage.errorMessageEmail().isDisplayed()) {
			test.log(LogStatus.PASS, "user should not able to sign-in in the application with invalid email.");
		}
		else {
			test.log(LogStatus.FAIL, "user should able to sign-in in the application with invalid email successfully.");
		}
		Assert.assertTrue(customerloginpage.errorMessageEmail().isDisplayed());
		driver.navigate().refresh();
	}
	
	@Test(priority = 11)
	public void sign_in_with_invalid_password() throws InterruptedException {
		customerloginpage.enterEmail(properties.getProperty("Email"));
		customerloginpage.enterPassword(properties.getProperty("InvalidPassword"));
		Thread.sleep(2000);
		customerloginpage.clickOnsignInButton();
		Thread.sleep(3000);
		
		test=extent.startTest("Verify that user should not able to sign-in in the application with invalid password.");
		test.log(LogStatus.INFO, "Sign-in with invalid password Test is intiated.");
		test.log(LogStatus.INFO,"Verify user should not able to sign-in in the application with invalid password.");
		
		if(customerloginpage.errorMessageInvalidPassword().isDisplayed()) {
			test.log(LogStatus.PASS, "user should not able to sign-in in the application with invalid password.");
		}
		else {
			test.log(LogStatus.FAIL, "user should able to sign-in in the application with invalid password successfully.");
		}
		Assert.assertTrue(customerloginpage.errorMessageInvalidPassword().isDisplayed());
		driver.navigate().refresh();
	}
	
	@Test(priority = 12)
	public void sign_in_with_blank_email() throws InterruptedException {
		customerloginpage.enterPassword(properties.getProperty("Password"));
		Thread.sleep(2000);
		customerloginpage.clickOnsignInButton();
		
		test=extent.startTest("Verify that user should not able to sign-in in the application with blank email.");
		test.log(LogStatus.INFO, "Sign-in with blank email Test is intiated.");
		test.log(LogStatus.INFO,"Verify user should not able to sign-in in the application with blank email.");
		
		if(customerloginpage.errorMessageEmail().isDisplayed()) {
			test.log(LogStatus.PASS, "user should not able to sign-in in the application with blank email.");
		}
		else {
			test.log(LogStatus.FAIL, "user should able to sign-in in the application with blank email successfully.");
		}
		Assert.assertTrue(customerloginpage.errorMessageEmail().isDisplayed());
		driver.navigate().refresh();
	}
	
	@Test(priority = 13)
	public void sign_in_with_Blank_password() throws InterruptedException {
		customerloginpage.enterEmail(properties.getProperty("Email"));
		Thread.sleep(2000);
		customerloginpage.clickOnsignInButton();
		
		test=extent.startTest("Verify that user should not able to sign-in in the application with blank password.");
		test.log(LogStatus.INFO, "Sign-in with blank password Test is intiated.");
		test.log(LogStatus.INFO,"Verify user should not able to sign-in in the application with blank password.");
		
		if(customerloginpage.errorMessageBlankPassword().isDisplayed()) {
			test.log(LogStatus.PASS, "user should not able to sign-in in the application with blank password.");
		}
		else {
			test.log(LogStatus.FAIL, "user should able to sign-in in the application with blank password successfully.");
		}
		Assert.assertTrue(customerloginpage.errorMessageBlankPassword().isDisplayed());
		driver.navigate().refresh();
	}
	
	@Test(priority = 14)
	public void sign_in_with_Blank_credentials() throws InterruptedException {
		Thread.sleep(2000);
		customerloginpage.clickOnsignInButton();
		
		test=extent.startTest("Verify that user should not able to sign-in in the application with blank credentials.");
		test.log(LogStatus.INFO, "Sign-in with blank credentials Test is intiated.");
		test.log(LogStatus.INFO,"Verify user should not able to sign-in in the application with blank credentials.");
		
		if(customerloginpage.errorMessageBlankPassword().isDisplayed()) {
			test.log(LogStatus.PASS, "user should not able to sign-in in the application with blank credentials.");
		}
		else {
			test.log(LogStatus.FAIL, "user should able to sign-in in the application with blank credentials.");
		}
		Assert.assertTrue(customerloginpage.errorMessageBlankPassword().isDisplayed());
	}

	@Test(priority = 15)
	public void sign_in_with_valid_credentials() throws InterruptedException {
		customerloginpage.enterEmail(properties.getProperty("Email"));
		customerloginpage.enterPassword(properties.getProperty("Password"));
		Thread.sleep(2000);
		customerloginpage.clickOnsignInButton();
		Thread.sleep(2000);
		
		test=extent.startTest("Verify that user should be able to sign-in in the application with valid credentials.");
		test.log(LogStatus.INFO, "Sign-in with valid credentials Test is intiated.");
		test.log(LogStatus.INFO,"Verify user should able to sign-in in the application with valid credentials.");
		
		if(customerloginpage.welcomeMessage().isDisplayed()) {
			test.log(LogStatus.PASS, "user should able to sign-in in the application with valid credentials.");
		}
		else {
			test.log(LogStatus.FAIL, "user should not able to sign-in in the application with valid credentials.");
		}
		Assert.assertTrue(customerloginpage.welcomeMessage().isDisplayed());
	}
	
	@AfterSuite
	public void Close_quit(){
		Toclose();
	}

}
