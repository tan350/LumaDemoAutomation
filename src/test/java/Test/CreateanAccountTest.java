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

import Pages.CreateNewCustomerAccountPage;
import Pages.HomePage;
import TestBase.TestBaseLuma;

public class CreateanAccountTest extends TestBaseLuma {

	HomePage homepage;
	CreateNewCustomerAccountPage  createaccountpage;
	public ExtentTest test;
	public ExtentReports extent;

	@BeforeSuite
	public void Launch() throws IOException, InterruptedException{
		initialization();
		createaccountpage=new CreateNewCustomerAccountPage();
	}

	@BeforeTest
	public void generateReportinit() {
		extent=new ExtentReports("D:\\workspace\\QA_Project3\\test-output\\LumaDemoExtentReports\\CreateNewCustomerAccountPageExtentReport.html",true);	
	}

	@AfterTest
	public void generateReportend() {
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 1)
	public void navigate_to_homepage_click_on_createanaccount() {
		homepage= new HomePage();
		homepage.clickOnCreateanAccount();
		
		test=extent.startTest("Verify whether Create New Customer Account Page loads successfully.");
		test.log(LogStatus.INFO, "Navigate to Homepage create an account Test is intiated.");
		test.log(LogStatus.INFO,"Verify Create New Customer Account Page loads successfully.");

		String actual=driver.getTitle();
		String expected="Create New Customer Account";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Create New Customer Account Page loaded successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Create New Customer Account is not loaded successfully.");
		}
		Assert.assertEquals(driver.getTitle(),"Create New Customer Account");
	}

	@Test(priority = 2)
	public void visibility_luma_logo() {
		
		test=extent.startTest("Verify whether Create New Customer Account Page loads successfully.");
		test.log(LogStatus.INFO, "Luma logo visibility Test is intiated.");
		test.log(LogStatus.INFO,"Verify Home Page loads successfully.");

		if(createaccountpage.logo().isDisplayed()) {
			test.log(LogStatus.PASS, "Luma logo is visible on Create New Customer Account Page properly.");
		}
		else {
			test.log(LogStatus.FAIL, "Luma logo is not visible on Create New Customer Account Page properly.");
		}
		Assert.assertTrue(createaccountpage.logo().isDisplayed());
	}

	@Test(priority = 3)
	public void visibility_Create_new_customer_account_header() {
		
		test=extent.startTest("Verify whether Create New Customer Account header is visible properly on Create New Customer Account Page.");
		test.log(LogStatus.INFO, "Create New Customer Account header visibility Test is intiated.");
		test.log(LogStatus.INFO,"Verify Create New Customer Account header is visible properly on Create New Customer Account Page.");

		if(createaccountpage.logo().isDisplayed()) {
			test.log(LogStatus.PASS, "Create New Customer Account header is visible properly on Create New Customer Account Page.");
		}
		else {
			test.log(LogStatus.FAIL, "Create New Customer Account header is not visible properly on Create New Customer Account Page.");
		}
		Assert.assertTrue(createaccountpage.createNewCustomerAcoountHeader().isDisplayed());
	}

	@Test(priority = 4)
	public void visibility_personal_information_header() {
		
		test=extent.startTest("Verify whether Personal Information header is visible properly on Create New Customer Account Page.");
		test.log(LogStatus.INFO, "Personal Information header visibility Test is intiated.");
		test.log(LogStatus.INFO,"Verify Personal Information header is visible properly on Create New Customer Account Page.");

		if(createaccountpage.personalInformationHeader().isDisplayed()) {
			test.log(LogStatus.PASS, "Personal Information header is visible properly on Create New Customer Account Page.");
		}
		else {
			test.log(LogStatus.FAIL, "Personal Information header is not visible properly on Create New Customer Account Page.");
		}
		Assert.assertTrue(createaccountpage.personalInformationHeader().isDisplayed());
	}

	@Test(priority = 5)
	public void visibility_sign_in_information_header() {
		
		test=extent.startTest("Verify whether Sign-in Information header is visible properly on Create New Customer Account Page.");
		test.log(LogStatus.INFO, "Sign-in Information header visibility Test is intiated.");
		test.log(LogStatus.INFO,"Verify Sign-in Information header is visible properly on Create New Customer Account Page.");

		if(createaccountpage.signInInformationHeader().isDisplayed()) {
			test.log(LogStatus.PASS, "Sign-in Information header is visible properly on Create New Customer Account Page.");
		}
		else {
			test.log(LogStatus.FAIL, "Sign-in Information header is not visible properly on Create New Customer Account Page.");
		}
		Assert.assertTrue(createaccountpage.signInInformationHeader().isDisplayed());
	}

	@Test(priority = 6)
	public void verify_label_firstname_on_Page()
	{
		test=extent.startTest("Verify whether First Name label is visible properly on Create New Customer Account Page.");
		test.log(LogStatus.INFO, "First Name label visibility Test is intiated.");
		test.log(LogStatus.INFO,"Verify First Name label is visible properly on Create New Customer Account Page.");

		if(createaccountpage.signInInformationHeader().isDisplayed()) {
			test.log(LogStatus.PASS, "First Name label is visible properly on Create New Customer Account Page.");
		}
		else {
			test.log(LogStatus.FAIL, "First Name label is not visible properly on Create New Customer Account Page.");
		}
		Assert.assertTrue(createaccountpage.labelFirstName().isDisplayed());
	}
	
	@Test(priority = 7)
	public void verify_label_lastname_on_Page()
	{
		
		test=extent.startTest("Verify whether Last Name label is visible properly on Create New Customer Account Page.");
		test.log(LogStatus.INFO, "Last Name label visibility Test is intiated.");
		test.log(LogStatus.INFO,"Verify Last Name label is visible properly on Create New Customer Account Page.");

		if(createaccountpage.labelLastName().isDisplayed()) {
			test.log(LogStatus.PASS, "Last Name label is visible properly on Create New Customer Account Page.");
		}
		else {
			test.log(LogStatus.FAIL, "Last Name label is not visible properly on Create New Customer Account Page.");
		}
		Assert.assertTrue(createaccountpage.labelLastName().isDisplayed());
	}
	
	@Test(priority = 8)
	public void verify_label_SignUpForNewsletter_on_Page()
	{
		
		test=extent.startTest("Verify whether SignUp For Newsletter label is visible properly on Create New Customer Account Page.");
		test.log(LogStatus.INFO, "SignUp For Newsletter label visibility Test is intiated.");
		test.log(LogStatus.INFO,"Verify SignUp For Newsletter label is visible properly on Create New Customer Account Page.");

		if(createaccountpage.labelSignUpForNewsletter().isDisplayed()) {
			test.log(LogStatus.PASS, "SignUp For Newsletter label is visible properly on Create New Customer Account Page.");
		}
		else {
			test.log(LogStatus.FAIL, "SignUp For Newsletter label is not visible properly on Create New Customer Account Page.");
		}
		Assert.assertTrue(createaccountpage.labelSignUpForNewsletter().isDisplayed());
	}
	
	@Test(priority = 9)
	public void verify_label_email_on_Page()
	{
		
		test=extent.startTest("Verify whether email label is visible properly on Create New Customer Account Page.");
		test.log(LogStatus.INFO, "email label visibility Test is intiated.");
		test.log(LogStatus.INFO,"Verify email label is visible properly on Create New Customer Account Page.");

		if(createaccountpage.labelEmail().isDisplayed()) {
			test.log(LogStatus.PASS, "email label is visible properly on Create New Customer Account Page.");
		}
		else {
			test.log(LogStatus.FAIL, "email label is not visible properly on Create New Customer Account Page.");
		}
		Assert.assertTrue(createaccountpage.labelEmail().isDisplayed());
	}
	
	@Test(priority = 10)
	public void verify_label_password_on_Page()
	{
		test=extent.startTest("Verify whether password label is visible properly on Create New Customer Account Page.");
		test.log(LogStatus.INFO, "password label visibility Test is intiated.");
		test.log(LogStatus.INFO,"Verify password label is visible properly on Create New Customer Account Page.");

		if(createaccountpage.labelPassword().isDisplayed()) {
			test.log(LogStatus.PASS, "password label is visible properly on Create New Customer Account Page.");
		}
		else {
			test.log(LogStatus.FAIL, "password label is not visible properly on Create New Customer Account Page.");
		}
		Assert.assertTrue(createaccountpage.labelPassword().isDisplayed());
	}
	
	@Test(priority = 11)
	public void verify_label_confirmpassword_on_Page()
	{
		
		test=extent.startTest("Verify whether confirm password label is visible properly on Create New Customer Account Page.");
		test.log(LogStatus.INFO, "confirm password label visibility Test is intiated.");
		test.log(LogStatus.INFO,"Verify confirm password label is visible properly on Create New Customer Account Page.");

		if(createaccountpage.labelConfirmPassword().isDisplayed()) {
			test.log(LogStatus.PASS, "confirm password label is visible properly on Create New Customer Account Page.");
		}
		else {
			test.log(LogStatus.FAIL, "confirm password label is not visible properly on Create New Customer Account Page.");
		}
		Assert.assertTrue(createaccountpage.labelConfirmPassword().isDisplayed());
	}

	@Test(priority = 12)
	public void create_an_account_with_valid_credentials() throws InterruptedException {
		createaccountpage.enterFirstName(properties.getProperty("FirstName"));
		createaccountpage.enterLastName(properties.getProperty("LastName"));
		createaccountpage.checkSignUpForNewsletter();
		createaccountpage.enterEmail(properties.getProperty("Email"));
		createaccountpage.enterPassword(properties.getProperty("Password"));
		createaccountpage.enterConfirmPassword(properties.getProperty("Password"));
		createaccountpage.clickOnCreateAnAccountButton();
		Thread.sleep(3000);
		
		test=extent.startTest("Verify whether account created successfully with valid credentials.");
		test.log(LogStatus.INFO, "Create account with valid credentials Test is intiated.");
		test.log(LogStatus.INFO,"Verify account created successfully with valid credentials.");

		if(createaccountpage.alreadyAccountMessage().isDisplayed()) {
			test.log(LogStatus.PASS, "Account created successfully with valid credentials.");
		}
		else {
			test.log(LogStatus.FAIL, "Account is not created successfully with valid credentials.");
		}
		Assert.assertTrue(createaccountpage.alreadyAccountMessage().isDisplayed());
	}

	@Test(priority = 13)
	public void forgotpassword_redirection() {
		createaccountpage.clickOnForgotPassword();
		
		test=extent.startTest("Verify whether forgot password redirects to Forgot password? Page sucessfully.");
		test.log(LogStatus.INFO, "Create account with valid credentials Test is intiated.");
		test.log(LogStatus.INFO,"Verify forgot password redirects to Forgot password? Page sucessfully.");

		String actual=driver.getTitle();
		String expected="Forgot Your Password?";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "forgot password redirects to Forgot password? Page sucessfully.");
		}
		else {
			test.log(LogStatus.FAIL, "forgot password not redirect to Forgot password? Page sucessfully.");
		}
		Assert.assertEquals(driver.getTitle(),"Forgot Your Password?");
		driver.navigate().back();
	}

	@Test(priority = 14)
	public void subscribe_button_functionality() throws InterruptedException {
		createaccountpage.enterEmailForSubscribe(properties.getProperty("Email"));
		createaccountpage.clickOnSubscribe();
		Thread.sleep(3000);
		
		test=extent.startTest("Verify whether Newsletter gets subscribed upon clicking subscribe button.");
		test.log(LogStatus.INFO, "subscribe Button functionality Test is intiated.");
		test.log(LogStatus.INFO,"Verify Newsletter gets subscribed upon clicking subscribe button.");

		if(createaccountpage.alreadySubscribedMessage().isDisplayed()) {
			test.log(LogStatus.PASS, "Newsletter gets subscribed upon clicking subscribe button.");
		}
		else {
			test.log(LogStatus.FAIL, "Newsletter does not get subscribed upon clicking subscribe button.");
		}
		Assert.assertTrue(createaccountpage.alreadySubscribedMessage().isDisplayed());
	}
	
	@Test(priority = 15)
	public void create_an_account_with_empty_firstname() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		createaccountpage.enterLastName(properties.getProperty("LastName"));
		createaccountpage.checkSignUpForNewsletter();
		createaccountpage.enterEmail(properties.getProperty("Email"));
		createaccountpage.enterPassword(properties.getProperty("Password"));
		createaccountpage.enterConfirmPassword(properties.getProperty("Password"));
		createaccountpage.clickOnCreateAnAccountButton();
		Thread.sleep(3000);
		
		test=extent.startTest("Verify whether user should not able to create an account with empty first name.");
		test.log(LogStatus.INFO, "create an account with empty first name Test is intiated.");
		test.log(LogStatus.INFO,"Verify user should not able to create an account with empty first name.");

		if(createaccountpage.errorMessageFirstName().isDisplayed()) {
			test.log(LogStatus.PASS, "user should not able to create an account with empty first name.");
		}
		else {
			test.log(LogStatus.FAIL, "user should be able to create an account with empty first name.");
		}
		Assert.assertTrue(createaccountpage.errorMessageFirstName().isDisplayed());
	}
	
	@Test(priority = 16)
	public void create_an_account_with_empty_lastname() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		createaccountpage.enterFirstName(properties.getProperty("FirstName"));
		createaccountpage.checkSignUpForNewsletter();
		createaccountpage.enterEmail(properties.getProperty("Email"));
		createaccountpage.enterPassword(properties.getProperty("Password"));
		createaccountpage.enterConfirmPassword(properties.getProperty("Password"));
		createaccountpage.clickOnCreateAnAccountButton();
		Thread.sleep(3000);
		
		test=extent.startTest("Verify whether user should not able to create an account with empty last name.");
		test.log(LogStatus.INFO, "create an account with empty last name Test is intiated.");
		test.log(LogStatus.INFO,"Verify user should not able to create an account with empty last name.");

		if(createaccountpage.errorMessageLastName().isDisplayed()) {
			test.log(LogStatus.PASS, "user should not able to create an account with empty last name.");
		}
		else {
			test.log(LogStatus.FAIL, "user should be able to create an account with empty last name.");
		}
		Assert.assertTrue(createaccountpage.errorMessageLastName().isDisplayed());
	}
	
	@Test(priority = 17)
	public void create_an_account_with_unchecked_Signupfornewsletter_checkbox() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		createaccountpage.enterFirstName(properties.getProperty("FirstName"));
		createaccountpage.enterLastName(properties.getProperty("LastName"));
		createaccountpage.enterEmail(properties.getProperty("Email"));
		createaccountpage.enterPassword(properties.getProperty("Password"));
		createaccountpage.enterConfirmPassword(properties.getProperty("Password"));
		createaccountpage.clickOnCreateAnAccountButton();
		Thread.sleep(3000);
		
		test=extent.startTest("Verify whether user should be able to create an account with unchecked Signup for newsletter checkbox.");
		test.log(LogStatus.INFO, "create an account with unchecked Signup for newsletter checkbox Test is intiated.");
		test.log(LogStatus.INFO,"Verify user should not able to create an account with unchecked Signup for newsletter checkbox.");

		if(createaccountpage.alreadyAccountMessage().isDisplayed()) {
			test.log(LogStatus.PASS, "user should be able to create an account with unchecked Signup for newsletter checkbox.");
		}
		else {
			test.log(LogStatus.FAIL, "user should not able to create an account with unchecked Signup for newsletter checkbox.");
		}
		Assert.assertTrue(createaccountpage.alreadyAccountMessage().isDisplayed());
		
	}
	
	@Test(priority = 18)
	public void create_an_account_with_empty_email() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		createaccountpage.enterFirstName(properties.getProperty("FirstName"));
		createaccountpage.enterLastName(properties.getProperty("LastName"));
		createaccountpage.checkSignUpForNewsletter();
		createaccountpage.enterPassword(properties.getProperty("Password"));
		createaccountpage.enterConfirmPassword(properties.getProperty("Password"));
		createaccountpage.clickOnCreateAnAccountButton();
		Thread.sleep(3000);
		
		test=extent.startTest("Verify whether user should be able to create an account with empty email.");
		test.log(LogStatus.INFO, "create an account with with empty email Test is intiated.");
		test.log(LogStatus.INFO,"Verify user should not able to create an account with empty email.");

		if(createaccountpage.errorMessageEmail().isDisplayed()) {
			test.log(LogStatus.PASS, "user should not able to create an account with empty email.");
		}
		else {
			test.log(LogStatus.FAIL, "user should able to create an account with empty email.");
		}
		Assert.assertTrue(createaccountpage.errorMessageEmail().isDisplayed());
	}
	
	@Test(priority = 19)
	public void create_an_account_with_empty_password() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		createaccountpage.enterFirstName(properties.getProperty("FirstName"));
		createaccountpage.enterLastName(properties.getProperty("LastName"));
		createaccountpage.checkSignUpForNewsletter();
		createaccountpage.enterEmail(properties.getProperty("Email"));
		createaccountpage.enterConfirmPassword(properties.getProperty("Password"));
		createaccountpage.clickOnCreateAnAccountButton();
		Thread.sleep(3000);
		
		test=extent.startTest("Verify whether user should be able to create an account with empty password.");
		test.log(LogStatus.INFO, "create an account with with empty password Test is intiated.");
		test.log(LogStatus.INFO,"Verify user should not able to create an account with empty password.");

		if(createaccountpage.errorMessagePassword().isDisplayed()) {
			test.log(LogStatus.PASS, "user should not able to create an account with with empty password.");
		}
		else {
			test.log(LogStatus.FAIL, "user should be able to create an account with empty password.");
		}
		Assert.assertTrue(createaccountpage.errorMessagePassword().isDisplayed());
	}
	
	@Test(priority = 20)
	public void create_an_account_with_empty_confirmpassword() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		createaccountpage.enterFirstName(properties.getProperty("FirstName"));
		createaccountpage.enterLastName(properties.getProperty("LastName"));
		createaccountpage.checkSignUpForNewsletter();
		createaccountpage.enterEmail(properties.getProperty("Email"));
		createaccountpage.enterPassword(properties.getProperty("Password"));
		createaccountpage.clickOnCreateAnAccountButton();
		Thread.sleep(3000);
		
		test=extent.startTest("Verify whether user should be able to create an account with empty confirm password.");
		test.log(LogStatus.INFO, "create an account with with empty confirm password Test is intiated.");
		test.log(LogStatus.INFO,"Verify user should not able to create an account with empty confirm password.");

		if(createaccountpage.errorMessageConfirmPassword().isDisplayed()) {
			test.log(LogStatus.PASS, "user should not able to create an account with with empty confirm password.");
		}
		else {
			test.log(LogStatus.FAIL, "user should be able to create an account with empty confirm password.");
		}
		Assert.assertTrue(createaccountpage.errorMessageConfirmPassword().isDisplayed());
	}
	
	@Test(priority = 21)
	public void create_an_account_with_invalid_email() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		createaccountpage.enterFirstName(properties.getProperty("FirstName"));
		createaccountpage.enterLastName(properties.getProperty("LastName"));
		createaccountpage.checkSignUpForNewsletter();
		createaccountpage.enterEmail(properties.getProperty("InvalidEmail"));
		createaccountpage.enterPassword(properties.getProperty("Password"));
		createaccountpage.clickOnCreateAnAccountButton();
		Thread.sleep(3000);
		
		test=extent.startTest("Verify whether user should be able to create an account with invalid email.");
		test.log(LogStatus.INFO, "create an account with with invalid email Test is intiated.");
		test.log(LogStatus.INFO,"Verify user should not able to create an account with invalid email.");

		if(createaccountpage.errorMessageEmail().isDisplayed()) {
			test.log(LogStatus.PASS, "user should not able to create an account with invalid email.");
		}
		else {
			test.log(LogStatus.FAIL, "user should be able to create an account with invalid email.");
		}
		Assert.assertTrue(createaccountpage.errorMessageEmail().isDisplayed());
	}
	
	@Test(priority = 22)
	public void create_an_account_with_invalid_password() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		createaccountpage.enterFirstName(properties.getProperty("FirstName"));
		createaccountpage.enterLastName(properties.getProperty("LastName"));
		createaccountpage.checkSignUpForNewsletter();
		createaccountpage.enterEmail(properties.getProperty("Email"));
		createaccountpage.enterPassword(properties.getProperty("InvalidPassword"));
		createaccountpage.clickOnCreateAnAccountButton();
		Thread.sleep(3000);
		
		test=extent.startTest("Verify whether user should be able to create an account with invalid password.");
		test.log(LogStatus.INFO, "create an account with with invalid password Test is intiated.");
		test.log(LogStatus.INFO,"Verify user should not able to create an account with invalid password.");

		if(createaccountpage.errorMessagePassword().isDisplayed()) {
			test.log(LogStatus.PASS, "user should not able to create an account with invalid password.");
		}
		else {
			test.log(LogStatus.FAIL, "user should be able to create an account with invalid password.");
		}
		Assert.assertTrue(createaccountpage.errorMessagePassword().isDisplayed());
	}
	
	@AfterSuite
	public void Close_quit(){
		Toclose();
	}
	
	
}
