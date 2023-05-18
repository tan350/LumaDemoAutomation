package Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.CartPage;
import Pages.HomePage;
import TestBase.TestBaseLuma;

public class CartPageTest extends TestBaseLuma {
	
	CartPage cartpage;

	@BeforeSuite
	public void Launch() throws IOException, InterruptedException{
		initialization();
		cartpage=new CartPage();
	}
	
	@Test(priority = 1)
	public void add_to_cart_functonality() throws InterruptedException {
		HomePage homepage=new HomePage();
		homepage.enterProductnameInSearchbox(properties.getProperty("Product1"));
		Thread.sleep(3000);
		homepage.searchUsingKeys();
		Thread.sleep(3000);
		cartpage.addItemToCartFromHomepage();
		Thread.sleep(3000);
		cartpage.selectSize();;
		cartpage.selectColor();
		Thread.sleep(3000);
		cartpage.clickOnAddToCartButton();
		Thread.sleep(3000);
		Assert.assertTrue(cartpage.counterNumber().isDisplayed());
	}
	
	@Test(priority = 2)
	public void proceed_to_checkout_functonality() throws InterruptedException {
		Thread.sleep(3000);
		cartpage.clickOnCart();
		cartpage.clickOnProceedToCheckout();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Checkout");
	}
	
	@Test(priority=3)
	public void shipping_details() throws InterruptedException
	{
		Thread.sleep(5000);
		cartpage.enterEmail(properties.getProperty("Email1"));
		cartpage.enterFirstName(properties.getProperty("Firstname1"));
		cartpage.enterLastName(properties.getProperty("Lastname1"));
		cartpage.enterCompany(properties.getProperty("Company"));
		cartpage.enterStreetAddress(properties.getProperty("Address"));
		cartpage.enterCityname(properties.getProperty("City"));
		cartpage.enterPostalCode(properties.getProperty("Postal"));
		cartpage.enterPhoneNumber(properties.getProperty("PhoneNumber"));
		cartpage.selectCountry();
		cartpage.selectState();
		cartpage.clickOnPriceradioButton();
		cartpage.clickOnNext();
		Thread.sleep(5000);
		Assert.assertTrue(cartpage.placeorder().isDisplayed());
	}
	
	
	@Test(priority=4)
	public void apply_discount_functonality() throws InterruptedException
	{
		Thread.sleep(3000);
		cartpage.clickOnApplyDiscountDropdown();
		cartpage.enterDiscountCode(properties.getProperty("Discountcode"));
		cartpage.clickOnApplyDiscount();
		Assert.assertTrue(cartpage.invalidCodeMessage().isDisplayed());
	}
	
	@Test(priority=5)
	public void placeorder_functonality() throws InterruptedException
	{
		Thread.sleep(3000);
		cartpage.addressSameCheckbox();
		cartpage.clickOnPlaceorder();
		Thread.sleep(3000);
		Assert.assertTrue(cartpage.placeOrderMessage().isDisplayed());
		driver.navigate().back();
	}
	
	@Test(priority = 6)
	public void order_details() throws InterruptedException {
		HomePage homepage= new HomePage();
		homepage.clickOnOrdersAndReturns();
		Thread.sleep(3000);
		cartpage.enterOrderId(properties.getProperty("OrderId"));
		cartpage.enterBillingLastName(properties.getProperty("Lastname1"));
		cartpage.selectFindOrderBy();
		cartpage.enterBillingZipCode(properties.getProperty("Postal"));
		cartpage.clickOncontinueButtonOnOrdersReturns();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Order # 000007565");
	}

	@Test(priority = 7)
	public void shipping_and_billing_address_on_orders_page() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertEquals(cartpage.shippingAndBillingAddressSame(), true);
	}
	
	
	@AfterSuite
	public void Close_quit(){
		Toclose();
	}

}
