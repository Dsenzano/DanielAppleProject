package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class iPhonePage extends TestBase {
    public iPhonePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy (className = "typography-hero-eyebrow hero-eyebrow")
    public WebElement iPhoneText;

    @FindBy (className = "button")
    public WebElement buyBtn;


}
