package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class ClassTaskPage {
    public ClassTaskPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "endpoint")
    public WebElement trending_Btn;

    @FindBy(className = "nav-a  ")
    public WebElement bestSeller_Btn;

    @FindBy(linkText = "Business")
    public WebElement chaseBusiness_Btn;
// *****
}
