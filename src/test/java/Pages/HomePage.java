package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseClass;

public class HomePage extends BaseClass {

	// Register
	By myAccBtn = By.xpath("//a[@title='My Account']");
	By myAccBtnOpn1 = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[1]/a");
	By firstname = By.xpath("//input[@name='firstname']");
	By lastname = By.xpath("//input[@name='lastname']");
	By email = By.xpath("//input[@name='email']");
	By telephone = By.xpath("//input[@name='telephone']");
	By password = By.xpath("//input[@name='password']");
	By confirmPwd = By.xpath("//input[@name='confirm']");
	By regChkBtn = By.xpath("//div[@class='col-sm-10']/label[2]/input");
	By regChkBtn2 = By.xpath("//input[@name='agree']");
	By continueBtn = By.xpath("//input[@value='Continue']");

	// Login
	By myAccBtnOpn2 = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[2]/a");
	By loginEmail = By.xpath("//input[@name='email']");
	By loginPwd = By.xpath("//input[@name='password']");
	By loginBtn = By.xpath("//input[@value='Login']");

	// Search a product
	By searchBox = By.xpath("//input[@name='search']");
	By searchBtn = By.xpath("//span[@class='input-group-btn']/button");

	// Select Product
	By productLink = By.xpath("//div[@class='caption']/h4/a");

	// Add to cart
	By addToCartBtn = By.xpath("//button[@id='button-cart']");
	By cartBtn = By.xpath("//div[@id='cart']/button");
	By viewCartBtn = By.xpath("//p[@class='text-right']/a[1]");

	// Shipping and Taxes
	By shippingTaxesLink = By.xpath("//div[@class='panel-group']/div[2]/div/h4/a");
	By shippingCountry = By.xpath("//select[@id='input-country']");
	By shippingState = By.xpath("//select[@id='input-zone']");
	By shippingPostCode = By.xpath("//input[@id='input-postcode']");
	By getQuotesBtn = By.xpath("//button[@id='button-quote']");
	By alertRadioBtn = By.xpath("//div[@class='radio']/label/input");
	By alertAcceptBtn = By.xpath("//div[@class='modal-footer']/input");
	By chkotBtn = By.xpath("//div[@class='pull-right']/a");
	By addressRadioBtn = By.xpath("//div[@class='radio'][2]/label/input");
	By continueBtn2 = By.xpath("//div[@class='pull-right'][1]//input");
	By addressFirstName = By.xpath("//div[@id='payment-new']/div[1]/div/input");
	By addressLastName = By.xpath("//div[@id='payment-new']/div[2]/div/input");
	By address1 = By.xpath("//div[@id='payment-new']/div[4]/div/input");
	By addressCity = By.xpath("//div[@id='payment-new']/div[6]/div/input");
	By addressPostCode = By.xpath("//div[@id='payment-new']/div[7]/div/input");
	By addressCountry = By.xpath("//select[@name='country_id']");
	By addressState = By.xpath("//select[@name='zone_id']");
	By addressContinueBtn = By.xpath("//input[@id='button-payment-address']");
	By existAdreesRadBtn = By.xpath("//div[@id='payment-existing']/select");
	By excistAddrDropbox = By.xpath("//div[@id='shipping-existing']/select");
	By addressBtn3 = By.xpath("//div[@class='panel-collapse collapse in']/div/form/div[5]/div/input");
	By deliveryContinueBtn = By.xpath("//input[@id='button-shipping-method']");
	By paymentChkbox = By.xpath("//input[@name='agree']");
	By paymentContinueBtn = By.xpath("//input[@id='button-payment-method']");
	By confirmBtn = By.xpath("//input[@id='button-confirm']");

	//Select product2
	By phonesLink=By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[6]/a");
	By productTitles=By.xpath("//div[@class='caption']/h4/a");
	By mp3player=By.xpath("//ul[@class='nav navbar-nav']/li[8]/a");
	By showALLmp3Link=By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[8]/div/a");
	By mp3playerslist=By.xpath("//div[@class='product-thumb']/div[2]/div/h4/a");
	By mp3playerBtn=By.xpath("//button[@id='button-cart']");
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void register() {
		driver.findElement(myAccBtn).click();
		driver.findElement(myAccBtnOpn1).click();
		driver.findElement(firstname).sendKeys("Syamili");
		driver.findElement(lastname).sendKeys("Mohandas");
		driver.findElement(email).sendKeys("syamili.das@gmail.com");
		driver.findElement(telephone).sendKeys("9986834505");
		driver.findElement(password).sendKeys("Syamili123!");
		driver.findElement(confirmPwd).sendKeys("Syamili123!");
		driver.findElement(regChkBtn).click();
		driver.findElement(regChkBtn2).click();
		driver.findElement(continueBtn).click();

	}

	public void login1() {
		driver.findElement(myAccBtn).click();
		driver.findElement(myAccBtnOpn2).click();
		
	}
	public void setValues(String emailid,String password)
	{
		driver.findElement(loginEmail).sendKeys(emailid);
		driver.findElement(loginPwd).sendKeys(password);
		
	}
	public void login2()
	{
		driver.findElement(loginBtn).click();

	}

	public void selectProduct() throws InterruptedException {
		driver.findElement(searchBox).sendKeys("Palm Treo Pro");
		driver.findElement(searchBtn).click();
		driver.findElement(productLink).click();
		driver.findElement(addToCartBtn).click();
		driver.findElement(cartBtn).click();
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(3));
		w1.until(ExpectedConditions.visibilityOfElementLocated(viewCartBtn));
		driver.findElement(viewCartBtn).click();
		driver.findElement(shippingTaxesLink).click();
		w1.until(ExpectedConditions.elementToBeClickable(shippingCountry));
		WebElement country = driver.findElement(shippingCountry);
		Select country1 = new Select(country);
		country1.selectByVisibleText("United States");
		w1.until(ExpectedConditions.elementToBeClickable(shippingCountry));
		WebElement state = driver.findElement(shippingState);
		Select state1 = new Select(state);
		state1.selectByVisibleText("Colorado");
		driver.findElement(shippingPostCode).clear();
		driver.findElement(shippingPostCode).sendKeys("680306");
		w1.until(ExpectedConditions.elementToBeClickable(getQuotesBtn));
		driver.findElement(getQuotesBtn).click();
		w1.until(ExpectedConditions.visibilityOfElementLocated(alertRadioBtn));
		driver.findElement(alertRadioBtn).click();
		driver.findElement(alertAcceptBtn).click();
		w1.until(ExpectedConditions.elementToBeClickable(chkotBtn));
		driver.findElement(chkotBtn).click();
		w1.until(ExpectedConditions.elementToBeSelected(chkotBtn));

	}
	
	public void selectProduct2() throws InterruptedException
	{
		
		/*
		 * driver.findElement(phonesLink).click(); List<WebElement>
		 * items=driver.findElements(productTitles); for(int i=0;i<items.size();i++) {
		 * String title=items.get(i).getText(); if(title.equals("Palm Treo Pro")) {
		 * items.get(i).click(); } }
		 */
	
	
		
		  driver.findElement(mp3player).click();
		  driver.findElement(showALLmp3Link).click(); 
		  List<WebElement> items=driver.findElements(mp3playerslist); 
		  for(int i=0;i<items.size();i++)
		  {
		  String title=items.get(i).getText();
		  if(title.equals("iPod Touch")) 
		  {
		  items.get(i).click(); 
		  } 
		  }
		  Thread.sleep(2000);
		  driver.findElement(mp3playerBtn).click();
		  driver.findElement(cartBtn).click();
	
//	  driver.findElement(addToCartBtn).click();
//	  driver.findElement(cartBtn).click();
		  
	WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(3));
	w1.until(ExpectedConditions.visibilityOfElementLocated(viewCartBtn));
	driver.findElement(viewCartBtn).click();
	driver.findElement(shippingTaxesLink).click();
	w1.until(ExpectedConditions.elementToBeClickable(shippingCountry));
	WebElement country = driver.findElement(shippingCountry);
	Select country1 = new Select(country);
	country1.selectByVisibleText("United States");
	w1.until(ExpectedConditions.elementToBeClickable(shippingCountry));
	WebElement state = driver.findElement(shippingState);
	Select state1 = new Select(state);
	state1.selectByVisibleText("Colorado");
	driver.findElement(shippingPostCode).clear();
	driver.findElement(shippingPostCode).sendKeys("680306");
	w1.until(ExpectedConditions.elementToBeClickable(getQuotesBtn));
	driver.findElement(getQuotesBtn).click();
	w1.until(ExpectedConditions.visibilityOfElementLocated(alertRadioBtn));
	driver.findElement(alertRadioBtn).click();
	driver.findElement(alertAcceptBtn).click();
	w1.until(ExpectedConditions.elementToBeClickable(chkotBtn));
	driver.findElement(chkotBtn).click();
	w1.until(ExpectedConditions.elementToBeSelected(chkotBtn));

	
	}

	public void newAddress() throws InterruptedException {

		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(4));
		w1.until(ExpectedConditions.elementToBeClickable(addressRadioBtn));
		driver.findElement(addressRadioBtn).click();
		driver.findElement(continueBtn2).click();
		w1.until(ExpectedConditions.presenceOfElementLocated(addressFirstName));
		driver.findElement(addressFirstName).sendKeys("leena");
		driver.findElement(addressLastName).sendKeys("Mohandas");
		driver.findElement(address1).sendKeys("Vellani");
		driver.findElement(addressCity).sendKeys("Thrissur");
		driver.findElement(addressPostCode).sendKeys("680504");
		WebElement dropdown1 = driver.findElement(addressCountry);
		Select dropdown2 = new Select(dropdown1);
		dropdown2.selectByVisibleText("United States");
		w1.until(ExpectedConditions.elementToBeClickable(addressCountry));
		WebElement dropdown3 = driver.findElement(addressState);
		Select dropdown4 = new Select(dropdown3);
		dropdown4.selectByVisibleText("Colorado");
		driver.findElement(addressContinueBtn).click();
		w1.until(ExpectedConditions.elementToBeClickable(excistAddrDropbox));
		WebElement dropdown8 = driver.findElement(excistAddrDropbox);
		Select dropdown7 = new Select(dropdown8);
		dropdown7.selectByVisibleText("leena Mohandas, Vellani, Thrissur, Colorado, United States");
		w1.until(ExpectedConditions.elementToBeClickable(addressBtn3));
		driver.findElement(addressBtn3).click();
		w1.until(ExpectedConditions.elementToBeSelected(addressBtn3));
	}

	public void excistingAddress() throws InterruptedException {
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(4));
		WebElement dropdown5 = driver.findElement(existAdreesRadBtn);
		Select dropdown6 = new Select(dropdown5);
		dropdown6.selectByValue("3322");
		w1.until(ExpectedConditions.elementToBeClickable(addressBtn3));
		driver.findElement(addressBtn3).click();
		w1.until(ExpectedConditions.elementToBeClickable(excistAddrDropbox));
		WebElement dropdown8 = driver.findElement(excistAddrDropbox);
		Select dropdown7 = new Select(dropdown8);
		dropdown7.selectByValue("3322");
		w1.until(ExpectedConditions.elementToBeClickable(addressBtn3));
		driver.findElement(addressBtn3).click();
	}

	public void payment() throws InterruptedException {
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(4));
		w1.until(ExpectedConditions.elementToBeClickable(deliveryContinueBtn));
		w1.until(ExpectedConditions.visibilityOfElementLocated(deliveryContinueBtn));
		driver.findElement(deliveryContinueBtn).click();
		w1.until(ExpectedConditions.elementToBeClickable(paymentChkbox));
		driver.findElement(paymentChkbox).click();
		driver.findElement(paymentContinueBtn).click();
		w1.until(ExpectedConditions.elementToBeClickable(confirmBtn));
		driver.findElement(confirmBtn).click();
	}
}
