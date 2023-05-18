package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestBase.TestBaseLuma;

public class CartPage extends TestBaseLuma {

	//locating WebElements
	@FindBy(xpath="//img[@alt='Radiant Tee']")
	WebElement itemHomepage;
	
	@FindBy(xpath="//button//span[text()='Add to Cart']")
	WebElement itemMoveToCart;

	@FindBy(xpath="//div[text()='S']")
	WebElement smallSize;
	
	@FindBy(xpath="//div[@option-label='Orange']")
	WebElement orangeColor;
	
	@FindBy(xpath="//button[@id='product-addtocart-button']")
	WebElement addToCartButton;
	
	@FindBy(xpath="//div[@class='minicart-wrapper']")
	WebElement clickOnCart;
	
	@FindBy(xpath="(//button[@title='Proceed to Checkout'])[2]")
	WebElement proceedToCheckoutButtonOnReturnOrder;
	
	@FindBy(xpath="//button[@title='Proceed to Checkout']")
	WebElement proceedToCheckoutButton;
	
	@FindBy(xpath="//span[@class='counter-number']")
	WebElement counterNumber;
	
	@FindBy(xpath="(//input[@type='email'])[2]")
	WebElement email;
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstName;

	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@name='company']")
	WebElement companyName;
	
	@FindBy(xpath="//input[@name='street[0]']")
	WebElement address;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement cityName;
	
	@FindBy(xpath="//input[@name='postcode']")
	WebElement postalCode;
	
	@FindBy(xpath="//input[@name='telephone']")
	WebElement phoneNumber;
	
	@FindBy(xpath="(//select[@class='select'])[1]")
	WebElement state;
	
	@FindBy(xpath="(//select[@class='select'])[2]")
	WebElement country;
	
	@FindBy(xpath="//input[@class='radio']")
	WebElement priceRadioButton;
	
	@FindBy(xpath="//button[@class='button action continue primary']")
	WebElement nextButton;
	
	@FindBy(xpath="//button[@title='Place Order']")
	WebElement placeorderButton;
	
	@FindBy(xpath="//input[@id='billing-address-same-as-shipping-checkmo']")
	WebElement addressSameCheckbox;
	
	@FindBy(xpath="//span[@id='block-discount-heading']")
	WebElement applydiscountDropdown;
	
	@FindBy(xpath="//input[@id='discount-code']")
	WebElement discountCode;
	
	@FindBy(xpath="//button[@value='Apply Discount']")
	WebElement applydiscountButton;
	
	@FindBy(xpath="//div[@role='alert']")
	WebElement invalidCodeMessage;
	
	@FindBy(xpath="//span[text()='Thank you for your purchase!']")
	WebElement placeOrderMessage;
	
	@FindBy(xpath="//input[@id='oar-order-id']")
	WebElement orderId;
	
	@FindBy(xpath="//input[@id='oar-billing-lastname']")
	WebElement billingLastName;
	
	@FindBy(xpath="//select[@class='select']")
	WebElement findOrderBy;
	
	@FindBy(xpath="//input[@id='oar_zip']")
	WebElement billingZipCode;
	
	@FindBy(xpath="//button[@title='Continue']")
	WebElement continueButton;
	
	@FindBy(xpath="(//div[@class='box-content'])[1]")
	WebElement shippingAddress;
	
	@FindBy(xpath="(//div[@class='box-content'])[3]")
	WebElement billingAddress;
	
	@FindBy(xpath="//span[text()='Reorder']")
	WebElement reorderButton;
	
	@FindBy(xpath="//input[@title='Qty']")
	WebElement qty;
	
	
	//method for initializing objects using PageFactory
	public CartPage(){
		PageFactory.initElements(driver,this);
	}

	//methods
	public void addItemToCartFromHomepage() {
		Actions action= new Actions(driver);
		action.moveToElement(itemHomepage).perform();
		itemMoveToCart.click();
	}
	
	public void selectSize() {
		smallSize.click();
	}
	
	public void selectColor() {
		orangeColor.click();
	}
	
	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}

	public WebElement counterNumber() {
		return counterNumber;
	}
	
	public void clickOnCart() {
		clickOnCart.click();
	}
	
	public void clickOnProceedToCheckout() {
		proceedToCheckoutButton.click();;
	}
	
	public void clickOnProceedToCheckoutOnReturnOrder() {
		proceedToCheckoutButtonOnReturnOrder.click();;
	}
	
	public void enterEmail(String emailaddress){
		email.sendKeys(emailaddress);
	}
	
	public void enterFirstName(String first){
		firstName.sendKeys(first);
	}

	public void enterLastName(String last){
		lastName.sendKeys(last);
	}
	
	public void enterCompany(String company){
		companyName.sendKeys(company);
	}

	public void enterStreetAddress(String streetaddress){
		address.sendKeys(streetaddress);
	}
	
	public void enterCityname(String city){
		cityName.sendKeys(city);
	}

	
	public void enterPostalCode(String postal){
		postalCode.sendKeys(postal);
	}

	public void enterPhoneNumber(String phnumber){
		phoneNumber.sendKeys(phnumber);
	}
	
	public void selectState(){
		Select se = new Select(state);
		se.selectByValue("538");
	}
	
	public void selectCountry(){
		Select se = new Select(country);
		se.selectByValue("IN");
	}

	
	public void clickOnPriceradioButton() {
		priceRadioButton.click();
	}
	
	public void clickOnNext() {
		nextButton.click();
	}
	
	public WebElement placeorder() {
		return placeorderButton;
	}
	
	public void clickOnPlaceorder() {
		placeorderButton.click();
	}
	
	public void addressSameCheckbox() {
		addressSameCheckbox.click();
	}
	
	public void clickOnApplyDiscountDropdown() {
		applydiscountDropdown.click();
	}
	
	public void enterDiscountCode(String code){
		discountCode.sendKeys(code);
	}
	
	public void clickOnApplyDiscount() {
		applydiscountButton.click();
	}
	
	public WebElement invalidCodeMessage() {
		return invalidCodeMessage;
	}
	
	public WebElement placeOrderMessage() {
		return placeOrderMessage;
	}
	
	public void enterOrderId(String id){
		orderId.sendKeys(id);
	}
	
	public void enterBillingLastName(String lastname){
		billingLastName.sendKeys(lastname);
	}
	
	public void selectFindOrderBy(){
		Select se = new Select(findOrderBy);
		se.selectByValue("zip");
	}
	
	public void enterBillingZipCode(String zipcode){
		billingZipCode.sendKeys(zipcode);
	}
	
	public void clickOncontinueButtonOnOrdersReturns() {
		continueButton.click();
	}
	
	public boolean shippingAndBillingAddressSame() {
		String shipping=shippingAddress.getText();
		String billing=billingAddress.getText();
		
		if(shipping.equals(billing))
			return true;
		else
			return false;
	}
	
	public void clickOnReorder() {
		reorderButton.click();
	}
	
	public void enterQtyProduct(String quantity) {
		qty.clear();
		qty.sendKeys(quantity);
	}

}
