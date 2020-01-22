package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ac-gn-firstfocus")
    public WebElement appleLogo;

    @FindBy(className = "ac-gn-link ac-gn-link-iphone")
    public WebElement iPhone_Btn;
}
