package ohrm_pom_ele_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ele_ohrm {
	@FindBy(xpath="//input[@name='email']")
	private WebElement un_home;
	
	public Ele_ohrm(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement log()
	{
		return un_home;
	}
}
