package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandAndHomePOM {
	WebDriver driver;
	@FindBy(xpath="(//div[@class=\"shop-menu pull-right\"]//ul//li//a)[3]")
	private WebElement cart;
	
	@FindBy(xpath="((//div[@class=\"shop-menu pull-right\"]//ul//li)[4])")
	private WebElement loginLink;
	
	@FindBy(xpath="//input[@data-qa=\"login-email\"]")
	private WebElement EmailAddress;
	
	@FindBy(xpath="//input[@data-qa=\"login-password\"]")
	private WebElement Pass;
	
	@FindBy(xpath="//button[@data-qa=\"login-button\"]")
	private WebElement loginB;
	
	@FindBy(xpath="//h2[contains(text(),'Features Items')]")
	private WebElement features_I;
	
	public LandAndHomePOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public boolean cartlink()
	{
		boolean enabled=cart.isEnabled();
		return enabled;
	}
	public void LoginMeth()
	{
		loginLink.click();
	}
	public void EnterEmail(String username)
	{
		EmailAddress.sendKeys(username);
	}
	public void Password(String password)
	{
		Pass.sendKeys(password);
	}
	public void LoginButton()
	{
		loginB.click();
	}
	public boolean Features_item()
	{
		boolean FItems=features_I.isDisplayed();
		return FItems;
	}

}
