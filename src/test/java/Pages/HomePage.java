package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBaseLuma;


public class HomePage extends TestBaseLuma {

	//locating WebElements
	@FindBy(xpath="//a[@class='logo']")
	WebElement lumaLogo;

	@FindBy(xpath="(//a[text()='Create an Account'])[1]")
	WebElement createAnAccount;

	@FindBy(xpath="(//li[@class='authorization-link'])[1]")
	WebElement signIn;

	@FindBy(xpath="//input[@id='search']")
	WebElement searchBox;

	@FindBy(xpath="//div//button[@title='Search']")
	WebElement searchButton;

	@FindBy(xpath="//a[@class='action showcart']")
	WebElement cartIcon;

	@FindBy(xpath="//strong[contains(text(),'You have no items')]")
	WebElement cartDialog;

	@FindBy(xpath="//ul[@id='ui-id-2']/li[1]")
	WebElement whatsNew;

	@FindBy(xpath="//span[text()='Women']")
	WebElement womenDropdown;

	@FindBy(xpath="//span[text()='Tops']")
	WebElement womenTops;

	@FindBy(xpath="//span[text()='Jackets']")
	WebElement womenJackets;

	@FindBy(xpath="(//span[text()='Hoodies & Sweatshirts'])[1]")
	WebElement womenHoodiesSweatshirts;

	@FindBy(xpath="(//span[text()='Tees'])[1]")
	WebElement womenTees;

	@FindBy(xpath="(//span[text()='Bottoms'])[1]")
	WebElement womenBottoms;

	@FindBy(xpath="(//span[text()='Pants'])[1]")
	WebElement womenPants;

	@FindBy(xpath="//span[text()='Gear']")
	WebElement gear;

	@FindBy(xpath="//span[text()='Bags']")
	WebElement gearBags;

	@FindBy(xpath="//span[text()='Fitness Equipment']")
	WebElement gearFitnessEquipment;

	@FindBy(xpath="//span[text()='Watches']")
	WebElement gearWatches;

	@FindBy(xpath="//span[text()='Training']")
	WebElement training;

	@FindBy(xpath="//span[text()='Video Download']")
	WebElement trainingVideodownload;

	@FindBy(xpath="//span[text()='Sale']")
	WebElement sale;

	@FindBy(xpath="//span[text()='Men']")
	WebElement menDropdown;

	@FindBy(xpath="(//span[text()='Tops'])[2]")
	WebElement menTops;

	@FindBy(xpath="//span[text()='Tanks']")
	WebElement menTanks;

	@FindBy(xpath="//span[text()='Shop New Yoga']")
	WebElement shopNewYogaButton;

	@FindBy(xpath="//a[@class='block-promo home-main']")
	WebElement shopNewYogaImage;

	@FindBy(xpath="//span[text()='Shop Pants']")
	WebElement shopPantsImage;

	@FindBy(xpath="//span[text()='Shop Tees']")
	WebElement shopTeesImage;

	@FindBy(xpath="//span[text()='Shop Erin Recommends']")
	WebElement shopErinRecommendsImage;

	@FindBy(xpath="//span[text()='Shop Performance']")
	WebElement shopPerformanceImage;

	@FindBy(xpath="//span[text()='Shop Eco-Friendly']")
	WebElement shopEcofriendlyImage;

	@FindBy(xpath="//footer[@class='page-footer']")
	WebElement footer;
	
	@FindBy(xpath="//a[text()='About us']")
	WebElement aboutUs;
	
	@FindBy(xpath="//a[text()='Customer Service']")
	WebElement customerService;
	
	@FindBy(xpath="//a[text()='Selenium Video Courses']")
	WebElement seleniumVideoCourses;
	
	@FindBy(xpath="//a[text()='Write for us']")
	WebElement writeForUs;
	
	@FindBy(xpath="//a[text()='Search Terms']")
	WebElement searchTerms;
	
	@FindBy(xpath="//a[text()='Privacy and Cookie Policy']")
	WebElement privacyAndCookie;
	
	@FindBy(xpath="//a[text()='Advanced Search']")
	WebElement advancedSearch;
	
	@FindBy(xpath="//a[text()='Orders and Returns']")
	WebElement ordersReturns;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	WebElement contactUs;
	
	@FindBy(xpath="//div[@class='content-heading']")
	WebElement hotsellerHeader;
	
	//method for initializing objects using PageFactory
	public HomePage(){
		PageFactory.initElements(driver,this);
	}

	//methods
	public WebElement lumaLogo() {
		return lumaLogo;
	}
	
	public void clickOnCreateanAccount(){
		createAnAccount.click();
	}

	public void clickOnSignIn(){
		signIn.click();
	}

	public WebElement searchBox() {
		return searchBox;
	}

	public void enterProductnameInSearchbox(String product){
		searchBox.sendKeys(product);
	}

	public void clickOnSearchButton(){
		searchButton.click();
	}

	public void searchUsingKeys() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform(); 
	}

	public void clickOnCartIcon(){
		cartIcon.click();
	}

	public WebElement cartDialog() {
		return cartDialog;
	}


	public void womenTopsJacketsDropdown() {
		Actions action= new Actions(driver);
		action.moveToElement(womenDropdown).perform();
		action.moveToElement(womenTops).perform();
		womenJackets.click();

	}

	public void womenTopsHoodiesSweatshirtsDropdown() {
		Actions action= new Actions(driver);
		action.moveToElement(womenDropdown).perform();
		action.moveToElement(womenTops).perform();
		womenHoodiesSweatshirts.click();

	}

	public void womenTopsTeesDropdown() {
		Actions action= new Actions(driver);
		action.moveToElement(womenDropdown).perform();
		action.moveToElement(womenTops).perform();
		womenTees.click();

	}

	public void womenBottomsPantsDropdown() {
		Actions action= new Actions(driver);
		action.moveToElement(womenDropdown).perform();
		action.moveToElement(womenBottoms).perform();
		womenPants.click();

	}

	public void clickOnWhatsNew() {
		whatsNew.click();
	}

	public void gearBagsDropdown() {
		Actions action= new Actions(driver);
		action.moveToElement(gear).perform();
		gearBags.click();
	}

	public void gearFitnessEquipmentDropdown() {
		Actions action= new Actions(driver);
		action.moveToElement(gear).perform();
		gearFitnessEquipment.click();
	}

	public void gearWatchesDropdown() {
		Actions action= new Actions(driver);
		action.moveToElement(gear).perform();
		gearWatches.click();
	}

	public void trainingVideodownloadDropdown() {
		Actions action= new Actions(driver);
		action.moveToElement(training).perform();
		trainingVideodownload.click();
	}

	public void clickOnSale() {
		sale.click();
	}

	public void menTopsTanksDropdown() {
		Actions action= new Actions(driver);
		action.moveToElement(menDropdown).perform();
		action.moveToElement(menTops).perform();
		menTanks.click();
	}

	public void clickOnShopNewYoga() {
		shopNewYogaButton.click();
	}

	public void clickOnShopNewYogaImage() {
		shopNewYogaImage.click();
	}

	public void clickOnShopPantsImage() {
		shopPantsImage.click();
	}

	public void clickOnShopTeesImage() {
		shopTeesImage.click();
	}

	public void clickOnShopErinRecommendsImage() {
		shopErinRecommendsImage.click();
	}

	public void clickOnShopPerformanceImage() {
		shopPerformanceImage.click();
	}

	public void clickOnShopEcofriendlyImage() {
		shopEcofriendlyImage.click();
	}
	
	public int countLinkInFooter() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		return links.size();
	}
	
	public void clickOnAboutUs() {
		aboutUs.click();
	}
	
	public void clickOnCustomerService() {
		customerService.click();
	}
	
	public void clickOnWriteForUs() {
		writeForUs.click();
	}
	
	public void clickOnSeleniumVideoCourses() {
		seleniumVideoCourses.click();
	}
	
	public void clickOnsearchTerms() {
		searchTerms.click();
	}
	
	public void clickOnPrivacyAndCookiePolicy() {
		privacyAndCookie.click();
	}
	
	public void clickOnAdvancedSearch() {
		advancedSearch.click();
	}
	
	public void clickOnContactUs() {
		contactUs.click();
	}
	
	public void clickOnOrdersAndReturns() {
		ordersReturns.click();
	}
	
	public WebElement hotsellerHeader() {
		return hotsellerHeader;
	}
	
}
