package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBaseLuma;

public class ProfilePage extends TestBaseLuma {

	//locating WebElements
	@FindBy(xpath="//button[@class='action switch']")
	WebElement accountDropdownButton;
	
	@FindBy(xpath="//a[text()='My Account']")
	WebElement myAccountOption;
	
	@FindBy(xpath="//a[text()='My Wish List ']")
	WebElement myWishListOption;
	
	@FindBy(xpath="(//li[@class='authorization-link'])[1]")
	WebElement signOutButton;
	
	@FindBy(xpath="//span[text()='You are signed out']")
	WebElement signOutMessage;
	
	@FindBy(xpath="(//span[text()='Edit'])[1]")
	WebElement editContactInfo;
	
	@FindBy(xpath="(//span[text()='Edit'])[2]")
	WebElement editNewsletters;
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement accountInfoFirstName;
	
	@FindBy(xpath="//input[@id='lastname']")
	WebElement accountInfoLastName;
	
	@FindBy(xpath="//button[@title='Save']")
	WebElement saveButton;
	
	@FindBy(xpath="//div[text()='You saved the account information.']")
	WebElement accountInfoSavedMessage;
	
	@FindBy(xpath="//input[@id='subscription']")
	WebElement generalSubscriptionCheckbox;
	
	@FindBy(xpath="(//div[@class='messages'])[1]")
	WebElement subscriptionMessage;
	
	@FindBy(xpath="//a[text()='My Orders']")
	WebElement myOrders;
	
	@FindBy(xpath="//a[text()='My Downloadable Products']")
	WebElement myDownloadableProducts;
	
	@FindBy(xpath="//a[text()='My Wish List']")
	WebElement myWishList;
	
	@FindBy(xpath="//a[text()='Address Book']")
	WebElement addressBook;
	
	@FindBy(xpath="//a[text()='Account Information']")
	WebElement accountInformation;
	
	@FindBy(xpath="//a[text()='Stored Payment Methods']")
	WebElement storedPaymentMethods;
	
	@FindBy(xpath="//a[text()='My Product Reviews']")
	WebElement myProductReviews;
	
	@FindBy(xpath="//a[text()='Newsletter Subscriptions']")
	WebElement newsletterSubscriptions;
	
	@FindBy(xpath="//span[text()='View All']")
	WebElement viewAllMyAccount;
	
	@FindBy(xpath="(//span[text()='View All'])[1]")
	WebElement viewAllMyOrders;
	
	@FindBy(xpath="//span[text()='View Order']")
	WebElement viewOrder;
	
	@FindBy(xpath="//a[@class='action change-password']")
	WebElement changePassword;
	
	@FindBy(xpath="//input[@id='change-password']")
	WebElement changePasswordCheckbox;
	
	@FindBy(xpath="//input[@id='current-password']")
	WebElement currentPassword;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement newPassword;
	
	@FindBy(xpath="//input[@id='password-confirmation']")
	WebElement confirmNewPassword;
	
	@FindBy(xpath="//div[text()='You saved the account information.']")
	WebElement passwordInfoSavedMessage;
	
	@FindBy(xpath="//input[@id='change-email']")
	WebElement changeEmailCheckbox;
	
	@FindBy(xpath="//span[text()='Manage Addresses']")
	WebElement manageAddress;
	
	@FindBy(xpath="//span[text()='Change Billing Address']")
	WebElement changeBillingAddress;
	
	@FindBy(xpath="//span[text()='Change Shipping Address']")
	WebElement changeShippingAddress;
	
	@FindBy(xpath="//input[@id='zip']")
	WebElement zip;
	
	@FindBy(xpath="//button[@title='Save Address']")
	WebElement saveAddress;
	
	@FindBy(xpath="//button[@title='Save Address']")
	WebElement addressSavedMessage;
	
	@FindBy(xpath="(//span[text()='Edit Address'])[1]")
	WebElement editBillingAddress;
	
	@FindBy(xpath="(//span[text()='Edit Address'])[2]")
	WebElement editShippingAddress;
	
	@FindBy(xpath="//input[@id='reorder-item-29515']")
	WebElement radiantTeeCheckbox;
	
	@FindBy(xpath="//button[@title='Add to Cart']")
	WebElement addToCartButton;
	
	@FindBy(xpath="//div[text()='You added Radiant Tee to your shopping cart.']")
	WebElement addToCartMessage;
	
	@FindBy(xpath="//span[text()='Reorder']")
	WebElement reorder;
	
	//method for initializing objects using PageFactory
	public ProfilePage(){
		PageFactory.initElements(driver,this);
	}

	//methods
	public void clickOnAccountDropdownButton() {
		accountDropdownButton.click();
	}
	
	public void clickOnMyAccount() {
		myAccountOption.click();
	}
	
	public void clickOnMyWishList() {
		myWishListOption.click();
	}
	
	public void clickOnSignOutButton() {
		signOutButton.click();
	}
	
	public WebElement signOutMessage() {
		return signOutMessage;
	}
	
	public void clickOnEditContactInfo() {
		editContactInfo.click();
	}
	
	public void clickOnEditNewsletters() {
		editNewsletters.click();
	}
	
	public WebElement firstName() {
		return accountInfoFirstName;
	}
	
	public WebElement lastName() {
		return accountInfoLastName;
	}
	
	public void enterFirstName(String first){
		accountInfoFirstName.sendKeys(first);
	}

	public void enterLastName(String last){
		accountInfoLastName.sendKeys(last);
	}
	
	public void clickOnSaveButton() {
		saveButton.click();
	}
	
	public WebElement accountInfoSavedMessage() {
		return accountInfoSavedMessage;
	}
	
	public void checkGeneralSubscriptionCheckbox() {
		generalSubscriptionCheckbox.click();
	}
	
	public WebElement subscriptionMessage() {
		return subscriptionMessage;
	}
	
	public void clickOnMyOrders() {
		myOrders.click();
	}
	
	public void clickOnMyDownloadableProducts() {
		myDownloadableProducts.click();
	}
	
	public void clickOnMyWishListTab() {
		myWishList.click();
	}
	
	public void clickOnAddressBook() {
		addressBook.click();
	}
	
	public void clickOnAccountInformation() {
		accountInformation.click();
	}
	
	public void clickOnStoredPaymentMethods() {
		storedPaymentMethods.click();
	}
	
	public void clickOnMyProductReviews() {
		myProductReviews.click();
	}
	
	public void clickOnNewsletterSubscriptions() {
		newsletterSubscriptions.click();
	}
	
	public void clickOnViewAllMyAccount() {
		viewAllMyAccount.click();
	}
	
	public void clickOnViewAllMyOrders() {
		viewAllMyOrders.click();
	}
	
	public void clickOnViewOrder() {
		viewOrder.click();
	}
	
	public void clickOnChangePassword() {
		changePassword.click();
	}
	
	public WebElement changePasswordCheckbox() {
		return changePasswordCheckbox;
	}
	
	public void enterCurrentPassword(String currentpass){
		currentPassword.sendKeys(currentpass);
	}
	
	public void enterNewPassword(String newpass){
		newPassword.sendKeys(newpass);
	}
	
	public void enterConfirmNewPassword(String confirmnewpass){
		confirmNewPassword.sendKeys(confirmnewpass);
	}
	
	public WebElement passwordInfoSavedMessage() {
		return passwordInfoSavedMessage;
	}
	
	public void checkChangeEmailCheckbox() {
		changeEmailCheckbox.click();
	}
	
	public void clickOnManageAddress() {
		manageAddress.click();
	}
	
	public void enterZipCode(String zipcode){
		zip.sendKeys(zipcode);
	}
	
	public WebElement zipCode() {
		return zip;
	}
	
	public void clickOnChangeBillingAddress() {
		changeBillingAddress.click();
	}
	
	public void clickOnChangeShippingAddress() {
		changeShippingAddress.click();
	}
	
	public void clickOnSaveAddressButton() {
		saveAddress.click();
	}
	
	public WebElement addressSavedMessage() {
		return addressSavedMessage;
	}
	
	public void clickOnEditBillingAddress() {
		editBillingAddress.click();
	}
	
	public void clickOnEditShippingAddress() {
		editShippingAddress.click();
	}
	
	public void clickOnRadiantTeeCheckbox() {
		radiantTeeCheckbox.click();
	}
	
	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}
	
	public WebElement addToCartMessage() {
		return addToCartMessage;
	}
	
	public void clickOnReorder() {
		reorder.click();
	}
}
