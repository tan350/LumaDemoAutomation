package Test;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.CustomerLoginPage;
import Pages.HomePage;
import Pages.ProfilePage;
import TestBase.TestBaseLuma;

public class ProfilePageTest extends TestBaseLuma {
	ProfilePage profilepage;

	@BeforeSuite
	public void Launch() throws IOException, InterruptedException{
		initialization();
		profilepage=new ProfilePage();
	}
	
	@Test(priority = 1)
	public void my_account_redirection() throws InterruptedException {
		HomePage homepage= new HomePage();
		CustomerLoginPage customerloginpage =new CustomerLoginPage();
		homepage.clickOnSignIn();
		Thread.sleep(2000);
		customerloginpage.enterEmail(properties.getProperty("Email"));
		customerloginpage.enterPassword(properties.getProperty("Password"));
		Thread.sleep(2000);
		customerloginpage.clickOnsignInButton();
		Thread.sleep(3000);
		profilepage.clickOnAccountDropdownButton();
		profilepage.clickOnMyAccount();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"My Account");
	}
	
	@Test(priority = 2)
	public void my_wishlist_redirection() throws InterruptedException {
		Thread.sleep(3000);
		profilepage.clickOnAccountDropdownButton();
		profilepage.clickOnMyWishList();
		Assert.assertEquals(driver.getTitle(),"My Wish List");
		driver.navigate().back();
	}
	
	@Test(priority = 3)
	public void edit_contact_info_functionality() throws InterruptedException {
		Thread.sleep(3000);
		profilepage.clickOnEditContactInfo();
		profilepage.firstName().clear();
		profilepage.lastName().clear();
		profilepage.enterFirstName(properties.getProperty("FirstName2"));
		profilepage.enterLastName(properties.getProperty("LastName2"));
		profilepage.clickOnSaveButton();
		Thread.sleep(3000);
		Assert.assertTrue(profilepage.accountInfoSavedMessage().isDisplayed());
	}
	
	@Test(priority = 4)
	public void edit_newsletter_subscription_functionality() throws InterruptedException {
		Thread.sleep(3000);
		profilepage.clickOnEditNewsletters();
		profilepage.checkGeneralSubscriptionCheckbox();
		profilepage.clickOnSaveButton();
		Thread.sleep(3000);
		Assert.assertTrue(profilepage.subscriptionMessage().isDisplayed());
	}
	
	@Test(priority = 5)
	public void my_orders_functionality() throws InterruptedException {
		Thread.sleep(3000);
		profilepage.clickOnMyOrders();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"My Orders");
	}
	
	@Test(priority = 6)
	public void my_downloadable_products_functionality() throws InterruptedException {
		Thread.sleep(3000);
		profilepage.clickOnMyDownloadableProducts();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"My Downloadable Products");
	}
	
	@Test(priority = 7)
	public void my_wish_list_functionality() throws InterruptedException {
		Thread.sleep(3000);
		profilepage.clickOnMyWishListTab();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"My Wish List");
	}
	
	@Test(priority = 8)
	public void address_book_functionality() throws InterruptedException {
		Thread.sleep(3000);
		profilepage.clickOnAddressBook();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Address Book");
	}
	
	@Test(priority = 9)
	public void account_information_functionality() throws InterruptedException {
		Thread.sleep(3000);
		profilepage.clickOnAccountInformation();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Account Information");
	}
	
	@Test(priority = 10)
	public void stored_payment_methods_functionality() throws InterruptedException {
		Thread.sleep(3000);
		profilepage.clickOnStoredPaymentMethods();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Stored Payment Methods");
	}
	
	@Test(priority = 11)
	public void my_product_reviews_functionality() throws InterruptedException {
		Thread.sleep(3000);
		profilepage.clickOnMyProductReviews();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"My Product Reviews");
	}
	
	@Test(priority = 12)
	public void newsletter_subscriptions_functionality() throws InterruptedException {
		Thread.sleep(3000);
		profilepage.clickOnNewsletterSubscriptions();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Newsletter Subscription");
	}
	
	@Test(priority = 13)
	public void viewall_myaccount_functionality() throws InterruptedException {
		Thread.sleep(3000);
		profilepage.clickOnViewAllMyAccount();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),"My Account");
	}
	
	@Test(priority = 14)
	public void vieworder_functionality() throws InterruptedException {
		Thread.sleep(3000);
		profilepage.clickOnViewAllMyOrders();
		Thread.sleep(2000);
		profilepage.clickOnViewOrder();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),"Order # 000007449");
	}
	
	@Test(priority = 15)
	public void signout_button_functionality() throws InterruptedException {
		Thread.sleep(3000);
		profilepage.clickOnAccountDropdownButton();
		profilepage.clickOnSignOutButton();
		Assert.assertTrue(profilepage.signOutMessage().isDisplayed());
	}
	
	@Test(priority = 16,enabled=false)
	public void change_password_redirection() throws InterruptedException {
		profilepage.clickOnChangePassword();
		Assert.assertTrue(profilepage.changePasswordCheckbox().isEnabled());
	}
	
	@Test(priority = 17,enabled=false)
	public void change_password_functionality() throws InterruptedException {
		Thread.sleep(3000);
		profilepage.enterCurrentPassword(properties.getProperty("Password"));
		profilepage.enterNewPassword(properties.getProperty("Password"));
		profilepage.enterConfirmNewPassword(properties.getProperty("Password"));
		Thread.sleep(3000);
		profilepage.clickOnSaveButton();
		Thread.sleep(3000);
		Assert.assertTrue(profilepage.passwordInfoSavedMessage().isDisplayed());
		CustomerLoginPage customerloginpage =new CustomerLoginPage();
		customerloginpage.enterEmail(properties.getProperty("Email"));
		customerloginpage.enterPassword(properties.getProperty("Password"));
		Thread.sleep(3000);
		customerloginpage.clickOnsignInButton();
	}
	
	@Test(priority =18,enabled=false)
	public void change_email_functionality() throws InterruptedException {
		Thread.sleep(3000);
		profilepage.clickOnChangePassword();
		profilepage.checkChangeEmailCheckbox();
		profilepage.changePasswordCheckbox().click();
		profilepage.enterCurrentPassword(properties.getProperty("Password"));
		Thread.sleep(2000);
		profilepage.clickOnSaveButton();
		Thread.sleep(3000);
		Assert.assertTrue(profilepage.passwordInfoSavedMessage().isDisplayed());
	}
	
	@Test(priority =19,enabled=false)
	public void manage_address_redirection() throws InterruptedException {
		CustomerLoginPage customerloginpage =new CustomerLoginPage();
		customerloginpage.enterEmail(properties.getProperty("Email"));
		customerloginpage.enterPassword(properties.getProperty("Password"));
		Thread.sleep(3000);
		customerloginpage.clickOnsignInButton();
		Thread.sleep(3000);
		profilepage.clickOnManageAddress();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Address Book");
	}
	
	@Test(priority =20,enabled=false)
	public void change_billing_address_redirection() throws InterruptedException {
		profilepage.clickOnChangeBillingAddress();
		Assert.assertEquals(driver.getTitle(),"Edit Address");
		driver.navigate().back();
	}
	
	@Test(priority =21,enabled=false)
	public void change_shipping_address_redirection() throws InterruptedException {
		profilepage.clickOnChangeShippingAddress();
		Assert.assertEquals(driver.getTitle(),"Edit Address");
		driver.navigate().back();
	}
	
	@Test(priority = 22,enabled=false)
	public void edit_billing_address_redirection() throws InterruptedException {
		Thread.sleep(3000);
		profilepage.clickOnViewAllMyAccount();
		Thread.sleep(2000);
		profilepage.clickOnEditBillingAddress();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Address Information");
	}
	
	@Test(priority = 23,enabled=false)
	public void edit_shipping_address_redirection() throws InterruptedException {
		Thread.sleep(3000);
		profilepage.clickOnViewAllMyAccount();
		Thread.sleep(2000);
		profilepage.clickOnEditShippingAddress();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Address Information");
	}
	
	@Test(priority = 24,enabled=false)
	public void add_recently_ordered_item_into_cart_functionality() throws InterruptedException {
		Thread.sleep(3000);
		profilepage.clickOnRadiantTeeCheckbox();
		profilepage.clickOnAddToCartButton();
		Thread.sleep(3000);
		Assert.assertTrue(profilepage.addToCartMessage().isDisplayed());
	}
	
	@Test(priority = 25,enabled=false)
	public void reorder_redirection() throws InterruptedException {
		Thread.sleep(3000);
		profilepage.clickOnViewAllMyAccount();
		Thread.sleep(2000);
		profilepage.clickOnReorder();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Shopping Cart");
	}

	@AfterSuite
	public void Close_quit(){
		Toclose();
	}
}
