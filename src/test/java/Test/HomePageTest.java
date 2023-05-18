package Test;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.HomePage;
import TestBase.TestBaseLuma;

public class HomePageTest extends TestBaseLuma {

	HomePage homepage;
	public ExtentTest test;
	public ExtentReports extent;

	@BeforeSuite
	public void Launch() throws IOException, InterruptedException{
		initialization();
		homepage=new HomePage();
	}

	@BeforeTest
	public void generateReportinit() {
		extent=new ExtentReports("D:\\workspace\\QA_Project3\\test-output\\LumaDemoExtentReports\\HomePageExtentReport.html",true);	
	}

	@AfterTest
	public void generateReportend() {
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 1)
	public void visibility_luma_logo() {

		test=extent.startTest("Verify whether Home Page loads successfully.");
		test.log(LogStatus.INFO, "Luma logo visibility Test is intiated.");
		test.log(LogStatus.INFO,"Verify Home Page loads successfully.");

		String actual=driver.getCurrentUrl();
		String expected="https://magento.softwaretestingboard.com/";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Home Page loaded successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Home Page is not loaded successfully.");
		}
		Assert.assertTrue(homepage.lumaLogo().isDisplayed());
	}

	@Test(priority = 2)
	public void visibility_searchbox() {

		test=extent.startTest("Verify whether Home Page loads successfully.");
		test.log(LogStatus.INFO, "Search box visibility Test is intiated.");
		test.log(LogStatus.INFO,"Verify Home Page loads successfully.");

		String actual=driver.getCurrentUrl();
		String expected="https://magento.softwaretestingboard.com/";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Home Page loaded successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Home Page is not loaded successfully.");
		}
		Assert.assertTrue(homepage.searchBox().isDisplayed());
	}

	@Test(priority = 3)
	public void cartIcon_functionality() throws InterruptedException {

		homepage.clickOnCartIcon();
		Thread.sleep(3000);

		test=extent.startTest("Verify whether Shopping cart Page loads successfully.");
		test.log(LogStatus.INFO, "Cart Icon functionality Test is intiated.");
		test.log(LogStatus.INFO,"Verify Shopping cart Page loads successfully.");

		String actual=driver.getTitle();
		String expected="Shopping Cart";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Shopping cart Page loaded successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Shopping cart Page is not loaded successfully.");
		}

		Assert.assertEquals(driver.getTitle(),"Shopping Cart");
		driver.navigate().back();
	}

	@Test(priority = 4)
	public void search_functionality() throws InterruptedException {
		homepage.enterProductnameInSearchbox(properties.getProperty("Product"));
		Thread.sleep(3000);
		homepage.searchUsingKeys();
		Thread.sleep(3000);

		test=extent.startTest("Verify whether search is performed successfully.");
		test.log(LogStatus.INFO, "Search functionality Test is intiated.");
		test.log(LogStatus.INFO,"Verify Search is performed successfully.");

		String actual=driver.getTitle();
		String expected="Search results for: 'Bag'";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Search is performed successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Search is not performed successfully.");
		}
		Assert.assertEquals(driver.getTitle(),"Search results for: 'Bag'");		
		driver.navigate().back();
	}

	@Test(priority = 4, enabled=false)
	public void search_suggestion_list_functionality() throws InterruptedException {
		homepage.enterProductnameInSearchbox(properties.getProperty("Product"));
		Thread.sleep(8000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.DOWN).perform();
		action.sendKeys(Keys.DOWN).perform();
		action.sendKeys(Keys.ENTER).perform();  

	}

	@Test(priority = 5)
	public void whatsNew_functionality() throws InterruptedException {
		Thread.sleep(3000);
		homepage.clickOnWhatsNew();
		Thread.sleep(3000);

		test=extent.startTest("Verify whether What's New Page loads successfully.");
		test.log(LogStatus.INFO, "What's New linktext functionality Test is intiated.");
		test.log(LogStatus.INFO,"Verify What's New Page loads successfully.");

		String actual=driver.getTitle();
		String expected="What's New";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "What's New Page is loaded successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "What's New Page is not loaded successfully.");
		}
		Assert.assertEquals(driver.getTitle(),"What's New");
		driver.navigate().back();
	}

	@Test(priority = 6)
	public void women_tops_jackets_functionality() throws InterruptedException {
		Thread.sleep(3000);
		homepage.womenTopsJacketsDropdown();
		Thread.sleep(3000);

		test=extent.startTest("Verify whether Women Drop down leads to Tops then redirect to Jackets Page successfully.");
		test.log(LogStatus.INFO, "Women-Tops_Jackets functionality Test is intiated");
		test.log(LogStatus.INFO,"Verify Women Drop down leads to Tops then redirect to Jackets Page successfully.");

		String actual=driver.getTitle();
		String expected="Jackets - Tops - Women";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Women Drop down leads to Tops then redirect to Jackets Page successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Women Drop down leads to Tops then redirect to Jackets Page not properly.");
		}
		Assert.assertEquals(driver.getTitle(),"Jackets - Tops - Women");	
		driver.navigate().back();
	}

	@Test(priority = 7)
	public void women_tops_hoodies_sweatshirts_functionality() throws InterruptedException {
		Thread.sleep(3000);
		homepage.womenTopsHoodiesSweatshirtsDropdown();
		Thread.sleep(3000);

		test=extent.startTest("Verify whether Women Drop down leads to Tops then redirect to Hoodies & Sweatshirts Page successfully.");
		test.log(LogStatus.INFO, "Women-Tops-Hoodies-Sweatshirts functionality Test is intiated");
		test.log(LogStatus.INFO,"Verify Women Drop down leads to Tops then redirect to Hoodies & Sweatshirts Page successfully.");

		String actual=driver.getTitle();
		String expected="Hoodies & Sweatshirts - Tops - Women";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Women Drop down leads to Tops then redirect to Hoodies & Sweatshirts Page successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Women Drop down leads to Tops then redirect to Hoodies & Sweatshirts Page not properly.");
		}
		Assert.assertEquals(driver.getTitle(),"Hoodies & Sweatshirts - Tops - Women");
		driver.navigate().back();
	}

	@Test(priority = 8)
	public void women_tops_tees_functionality() throws InterruptedException {
		Thread.sleep(3000);
		homepage.womenTopsTeesDropdown();
		Thread.sleep(3000);

		test=extent.startTest("Verify whether Women Drop down leads to Tops then redirect to Tees Page successfully.");
		test.log(LogStatus.INFO, "Women-Tops-Tees functionality Test is intiated");
		test.log(LogStatus.INFO,"Verify Women Drop down leads to Tops then redirect to Tees Page successfully.");

		String actual=driver.getTitle();
		String expected="Tees - Tops - Women";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Women Drop down leads to Tops then redirect to Tees Page successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Women Drop down leads to Tops then redirect to Tees Page not properly.");
		}
		Assert.assertEquals(driver.getTitle(),"Tees - Tops - Women");
		driver.navigate().back();
	}

	@Test(priority = 9)
	public void women_bottoms_pants_functionality() throws InterruptedException {
		Thread.sleep(3000);
		homepage.womenBottomsPantsDropdown();
		Thread.sleep(3000);

		test=extent.startTest("Verify whether Women Drop down leads to Tops then redirect to Pants Page successfully.");
		test.log(LogStatus.INFO, "Women-Tops-Pants functionality Test is intiated");
		test.log(LogStatus.INFO,"Verify Women Drop down leads to Tops then redirect to Pants Page successfully.");

		String actual=driver.getTitle();
		String expected="Pants - Bottoms - Women";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Women Drop down leads to Tops then redirect to Pants Page successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Women Drop down leads to Tops then redirect to Pants Page not properly.");
		}
		Assert.assertEquals(driver.getTitle(),"Pants - Bottoms - Women");
		driver.navigate().back();
	}

	@Test(priority = 10)
	public void men_bottoms_tanks_functionality() throws InterruptedException {
		Thread.sleep(3000);
		homepage.menTopsTanksDropdown();
		Thread.sleep(3000);

		test=extent.startTest("Verify whether Men Drop down leads to Bottoms then redirect to Tanks Page successfully.");
		test.log(LogStatus.INFO, "Men-Bottoms-Tanks functionality Test is intiated");
		test.log(LogStatus.INFO,"Verify Men Drop down leads to Bottoms then redirect to Tanks Page successfully.");

		String actual=driver.getTitle();
		String expected="Tanks - Tops - Men";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Men Drop down leads to Bottoms then redirect to Tanks Page successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Men Drop down leads to Bottoms then redirect to Tanks Page not properly.");
		}
		Assert.assertEquals(driver.getTitle(),"Tanks - Tops - Men");
		driver.navigate().back();
	}

	@Test(priority = 11)
	public void gear_bags_functionality() throws InterruptedException {
		Thread.sleep(3000);
		homepage.gearBagsDropdown();
		Thread.sleep(3000);

		test=extent.startTest("Verify whether Gear Drop down leads to Bags then redirect to Bags Page successfully.");
		test.log(LogStatus.INFO, "Gear-Bags functionality Test is intiated");
		test.log(LogStatus.INFO,"Verify Gear Drop down leads to Bags then redirect to Bags Page successfully.");

		String actual=driver.getTitle();
		String expected="Bags - Gear";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Gear Drop down leads to Bags then redirect to Bags Page successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Gear Drop down leads to Bags then redirect to Bags Page not properly.");
		}
		Assert.assertEquals(driver.getTitle(),"Bags - Gear");
		driver.navigate().back();
	}

	@Test(priority = 12)
	public void gear_fitness_equipment_functionality() throws InterruptedException {
		Thread.sleep(3000);
		homepage.gearFitnessEquipmentDropdown();
		Thread.sleep(3000);

		test=extent.startTest("Verify whether Gear Drop down leads to Fitness Equipment then redirect to Fitness Equipment Page successfully.");
		test.log(LogStatus.INFO, "Gear-Fitness Equipment functionality Test is intiated");
		test.log(LogStatus.INFO,"Verify Gear Drop down leads to Fitness Equipment then redirect to Fitness Equipment Page successfully.");

		String actual=driver.getTitle();
		String expected="Fitness Equipment - Gear";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Gear Drop down leads to Fitness Equipment then redirect to Fitness Equipment Page successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Gear Drop down leads to Fitness Equipment then redirect to Fitness Equipment Page not properly.");
		}
		Assert.assertEquals(driver.getTitle(),"Fitness Equipment - Gear");
		driver.navigate().back();
	}

	@Test(priority = 13)
	public void gear_watches_functionality() throws InterruptedException {
		Thread.sleep(3000);
		homepage.gearWatchesDropdown();
		Thread.sleep(3000);

		test=extent.startTest("Verify whether Gear Drop down leads to Watches then redirect to Watches Page successfully.");
		test.log(LogStatus.INFO, "Gear-Watches functionality Test is intiated");
		test.log(LogStatus.INFO,"Verify Gear Drop down leads to Watches then redirect to Watches Page successfully.");

		String actual=driver.getTitle();
		String expected="Watches - Gear";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Gear Drop down leads to Watches then redirect to Watches Page successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Gear Drop down leads to Watches then redirect to Watches Page not properly.");
		}
		Assert.assertEquals(driver.getTitle(),"Watches - Gear");
		driver.navigate().back();
	}

	@Test(priority = 14)
	public void training_videodownload__functionality() throws InterruptedException {
		Thread.sleep(3000);
		homepage.trainingVideodownloadDropdown();
		Thread.sleep(3000);

		test=extent.startTest("Verify whether Training Drop down leads to Videodownload then redirect to Videodownload Page successfully.");
		test.log(LogStatus.INFO, "Training-Videodownload functionality Test is intiated");
		test.log(LogStatus.INFO,"Verify Training Drop down leads to Videodownload then redirect to Videodownload Page successfully.");

		String actual=driver.getTitle();
		String expected="Video Download - Training";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Training Drop down leads to Videodownload then redirect to Videodownload Page successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Training Drop down leads to Videodownload then redirect to Videodownload Page not properly.");
		}
		Assert.assertEquals(driver.getTitle(),"Video Download - Training");
		driver.navigate().back();
	}


	@Test(priority = 15)
	public void Sale_functionality() throws InterruptedException {
		Thread.sleep(3000);
		homepage.clickOnSale();
		Thread.sleep(3000);

		test=extent.startTest("Verify whether Sale Page loads successfully.");
		test.log(LogStatus.INFO, "Sale linktext functionality Test is intiated.");
		test.log(LogStatus.INFO,"Verify Sale Page loads successfully.");

		String actual=driver.getTitle();
		String expected="Sale";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Sale Page is loaded successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Sale Page is not loaded successfully.");
		}
		Assert.assertEquals(driver.getTitle(),"Sale");
		driver.navigate().back();
	}

	@Test(priority = 16)
	public void shop_new_yoga_functionality() throws InterruptedException {
		Thread.sleep(3000);
		homepage.clickOnShopNewYoga();
		Thread.sleep(3000);

		test=extent.startTest("Verify whether New Luma Yoga Collection Page loads successfully.");
		test.log(LogStatus.INFO, "Shop New Yoga Button functionality Test is intiated.");
		test.log(LogStatus.INFO,"Verify New Luma Yoga Collection Page loads successfully.");

		String actual=driver.getTitle();
		String expected="New Luma Yoga Collection";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "New Luma Yoga Collection Page is loaded successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "New Luma Yoga Collection Page is not loaded successfully.");
		}
		Assert.assertEquals(driver.getTitle(),"New Luma Yoga Collection");
		driver.navigate().back();
	}

	@Test(priority = 17)
	public void shop_new_yoga_image_redirection() throws InterruptedException {
		Thread.sleep(3000);
		homepage.clickOnShopNewYogaImage();
		Thread.sleep(3000);

		test=extent.startTest("Verify whether New Luma Yoga Collection Page loads successfully.");
		test.log(LogStatus.INFO, "Shop New Yoga Image redirection functionality Test is intiated.");
		test.log(LogStatus.INFO,"Verify New Luma Yoga Collection Page loads successfully.");

		String actual=driver.getTitle();
		String expected="New Luma Yoga Collection";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "New Luma Yoga Collection Page is loaded successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "New Luma Yoga Collection Page is not loaded successfully.");
		}
		Assert.assertEquals(driver.getTitle(),"New Luma Yoga Collection");
		driver.navigate().back();
	}

	@Test(priority = 18)
	public void shop_pants_image_redirection() throws InterruptedException {
		Thread.sleep(3000);
		homepage.clickOnShopPantsImage();
		Thread.sleep(3000);

		test=extent.startTest("Verify whether Pants Page loads successfully.");
		test.log(LogStatus.INFO, "Shop Pants Image redirection functionality Test is intiated.");
		test.log(LogStatus.INFO,"Verify Pants Page loads successfully.");

		String actual=driver.getTitle();
		String expected="Pants";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Pants Page is loaded successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Pants Page is not loaded successfully.");
		}
		Assert.assertEquals(driver.getTitle(),"Pants");
		driver.navigate().back();
	}

	@Test(priority = 19)
	public void shop_tees_image_redirection() throws InterruptedException {
		Thread.sleep(3000);
		homepage.clickOnShopTeesImage();
		Thread.sleep(3000);

		test=extent.startTest("Verify whether Tees Page loads successfully.");
		test.log(LogStatus.INFO, "Shop Tees Image redirection functionality Test is intiated.");
		test.log(LogStatus.INFO,"Verify Tees Page loads successfully.");

		String actual=driver.getTitle();
		String expected="Tees";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Tees Page is loaded successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Tees Page is not loaded successfully.");
		}
		Assert.assertEquals(driver.getTitle(),"Tees");
		driver.navigate().back();
	}

	@Test(priority = 20)
	public void shop_erin_recommends_image_redirection() throws InterruptedException {
		Thread.sleep(3000);
		homepage.clickOnShopErinRecommendsImage();
		Thread.sleep(3000);

		test=extent.startTest("Verify whether Erin Recommends Page loads successfully.");
		test.log(LogStatus.INFO, "Shop Erin Recommends Image redirection functionality Test is intiated.");
		test.log(LogStatus.INFO,"Verify Erin Recommends Page loads successfully.");

		String actual=driver.getTitle();
		String expected="Erin Recommends";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Erin Recommends Page is loaded successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Erin Recommends Page is not loaded successfully.");
		}
		Assert.assertEquals(driver.getTitle(),"Erin Recommends");
		driver.navigate().back();
	}

	@Test(priority = 21)
	public void shop_performance_image_redirection() throws InterruptedException {
		Thread.sleep(3000);
		homepage.clickOnShopPerformanceImage();
		Thread.sleep(3000);

		test=extent.startTest("Verify whether Performance Fabrics Page loads successfully.");
		test.log(LogStatus.INFO, "Shop Performance Fabrics Image redirection functionality Test is intiated.");
		test.log(LogStatus.INFO,"Verify Performance Fabrics Page loads successfully.");

		String actual=driver.getTitle();
		String expected="Performance Fabrics";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Performance Fabrics Page is loaded successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Performance Fabrics Page is not loaded successfully.");
		}
		Assert.assertEquals(driver.getTitle(),"Performance Fabrics");
		driver.navigate().back();
	}

	@Test(priority = 22)
	public void shop_ecofriendly_image_redirection() throws InterruptedException {
		Thread.sleep(3000);
		homepage.clickOnShopEcofriendlyImage();
		Thread.sleep(3000);

		test=extent.startTest("Verify whether Eco Friendly Page loads successfully.");
		test.log(LogStatus.INFO, "Shop Eco Friendly Image redirection functionality Test is intiated.");
		test.log(LogStatus.INFO,"Verify Eco Friendly Page loads successfully.");

		String actual=driver.getTitle();
		String expected="Eco Friendly";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Eco Friendly Page is loaded successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Eco Friendly Page is not loaded successfully.");
		}
		Assert.assertEquals(driver.getTitle(),"Eco Friendly");
		driver.navigate().back();
	}

	@Test(priority = 23)
	public void count_link_in_footer() throws InterruptedException {
		Thread.sleep(3000);
		int count=homepage.countLinkInFooter();
		test=extent.startTest("Verify the link count in footer section.");
		test.log(LogStatus.INFO, "Link count in footer Test is intiated.");
		test.log(LogStatus.INFO,"Verify link count in footer section.");

		int actual=count;
		int expected=80;
		if(actual==expected) {
			test.log(LogStatus.PASS, "link count in footer section is as expected.");
		}
		else {
			test.log(LogStatus.FAIL, "link count in footer section is not as expected.");
		}
		Assert.assertEquals(count, 80);
	}

	@Test(priority = 24)
	public void write_for_us_redirection() throws InterruptedException {

		Thread.sleep(3000);
		homepage.clickOnWriteForUs();
		Thread.sleep(3000);
		
		test=extent.startTest("Verify whether Write for Us Page loads successfully.");
		test.log(LogStatus.INFO, "Write for Us redirection functionality Test is intiated.");
		test.log(LogStatus.INFO,"Verify Write for Us Page loads successfully.");

		String actual=driver.getTitle();
		String expected="Write For Us - Software Testing Board";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Write for Us Page is loaded successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Write for Us Page is not loaded successfully.");
		}
		Assert.assertEquals(driver.getTitle(),"Write For Us - Software Testing Board");
		driver.navigate().back();
	}
	
	@Test(priority = 25)
	public void orders_and_returns_in_footer() throws InterruptedException {

		Thread.sleep(3000);
		homepage.clickOnOrdersAndReturns();
		Thread.sleep(3000);
		
		test=extent.startTest("Verify whether Orders & Returns Page loads successfully.");
		test.log(LogStatus.INFO, "Orders & Returns redirection functionality Test is intiated.");
		test.log(LogStatus.INFO,"Verify Orders & Returns Page loads successfully.");

		String actual=driver.getTitle();
		String expected="Orders and Returns";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Orders & Returns Page is loaded successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Orders & Returns Page is not loaded successfully.");
		}
		Assert.assertEquals(driver.getTitle(),"Orders and Returns");
		driver.navigate().back();
	}

	
	@Test(priority = 26)
	public void search_terms_redirection() throws InterruptedException {

		Thread.sleep(3000);
		homepage.clickOnsearchTerms();
		Thread.sleep(3000);
		
		test=extent.startTest("Verify whether Search Terms Page loads successfully.");
		test.log(LogStatus.INFO, "Search Terms redirection functionality Test is intiated.");
		test.log(LogStatus.INFO,"Verify Search Terms Page loads successfully.");

		String actual=driver.getTitle();
		String expected="Popular Search Terms";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Search Terms Page is loaded successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Search Terms Page is not loaded successfully.");
		}
		Assert.assertEquals(driver.getTitle(),"Popular Search Terms");
		driver.navigate().back();
	}
	
	@Test(priority = 27)
	public void privacy_and_cookie_policy_redirection() throws InterruptedException {

		Thread.sleep(3000);
		homepage.clickOnPrivacyAndCookiePolicy();
		Thread.sleep(3000);
		
		test=extent.startTest("Verify whether Privacy & Cookie Policy Page loads successfully.");
		test.log(LogStatus.INFO, "Privacy & Cookie Policy redirection functionality Test is intiated.");
		test.log(LogStatus.INFO,"Verify Privacy & Cookie Policy Page loads successfully.");

		String actual=driver.getTitle();
		String expected="Privacy Policy";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Privacy & Cookie Policy Page is loaded successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Privacy & Cookie Policy Page is not loaded successfully.");
		}
		Assert.assertEquals(driver.getTitle(),"Privacy Policy");
		driver.navigate().back();
	}
	
	@Test(priority = 28)
	public void advanced_search_redirection() throws InterruptedException {

		Thread.sleep(3000);
		homepage.clickOnAdvancedSearch();
		Thread.sleep(3000);
		
		test=extent.startTest("Verify whether Advanced Search Page loads successfully.");
		test.log(LogStatus.INFO, "Advanced Search redirection functionality Test is intiated.");
		test.log(LogStatus.INFO,"Verify Advanced Search Page loads successfully.");

		String actual=driver.getTitle();
		String expected="Advanced Search";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Advanced Search Page is loaded successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Advanced Search Page is not loaded successfully.");
		}
		Assert.assertEquals(driver.getTitle(),"Advanced Search");
		driver.navigate().back();
	}

	@Test(priority = 29)
	public void contact_us_redirection() throws InterruptedException {

		Thread.sleep(3000);
		homepage.clickOnContactUs();
		Thread.sleep(3000);
		
		test=extent.startTest("Verify whether Contact Us Page loads successfully.");
		test.log(LogStatus.INFO, "Contact Us redirection functionality Test is intiated.");
		test.log(LogStatus.INFO,"Verify Contact Us Page loads successfully.");

		String actual=driver.getTitle();
		String expected="Contact Us";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Contact Us Page is loaded successfully.");
		}
		else {
			test.log(LogStatus.FAIL, "Contact Us Page is not loaded successfully.");
		}
		Assert.assertEquals(driver.getTitle(),"Contact Us");
		driver.navigate().back();
	}
	
	@Test(priority = 30)
	public void hotseller_header_visibility() throws InterruptedException {
		
		Thread.sleep(2000);
		test=extent.startTest("Verify whether Hot Sellers header is visible on HomePage below the shop Eco-friendly image.");
		test.log(LogStatus.INFO, "Hot Sellers header visibility Test is intiated.");
		test.log(LogStatus.INFO,"Verify Hot Sellers header is visible on HomePage below the shop Eco-friendly image.");

		if(homepage.hotsellerHeader().isDisplayed()) {
			test.log(LogStatus.PASS, "Hot Sellers header is visible on HomePage below the shop Eco-friendly image.");
		}
		else {
			test.log(LogStatus.FAIL, "Hot Sellers header is not visible on HomePage below the shop Eco-friendly image.");
		}
		Assert.assertTrue(homepage.hotsellerHeader().isDisplayed());
	}
	
	@AfterSuite
	public void Close_quit(){
		Toclose();
	}
}
