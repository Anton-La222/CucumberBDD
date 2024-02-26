package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.ClassTaskPage;
import step_impl.HomePageImpl;
import utils.CucumberUtils;
import utils.Driver;
import utils.Screenshot;
import utils.SeleniumUtils;

public class ClassTaskStepsTest {
    /*@Given("I open Youtube page")
    public void i_open_youtube_page() {
        Driver.getDriver().get("https://www.youtube.com/");
    }
    @Then("I verify title is YouTube")
    public void i_verify_title_is_you_tube() {
        Assert.assertEquals("YouTube", Driver.getDriver().getTitle());
    }


    @Given("I open amazon home page")
    public void iOpenAmazonHomePage() {
        Driver.getDriver().get("https://www.amazon.com/");
    }
    @Then("I verify title is Amazon.com")
    public void iVerifyTitleIsAmazonCom() {
        Assert.assertEquals("Amazon.com", Driver.getDriver().getTitle());
    }


    @Given("I open Chase bank home page")
    public void iOpenChaseBankHomePage() {
        Driver.getDriver().get("https://www.chase.com/");
    }
    @And("i verify title is Credit Card, Mortgage, Banking, Auto | Chase Online | Chase.com")
    public void iVerifyTitleIsCreditCardMortgageBankingAutoChaseOnlineChaseCom() {
        Assert.assertEquals("Credit Card, Mortgage, Banking, Auto | Chase Online | Chase.com", Driver.getDriver().getTitle());
    }*/

    @Given("I open {string}")
    public void iOpen(String websiteName) {
        switch (websiteName) {
            case "youtube": Driver.getDriver().get("https://www.youtube.com/");
            break;
            case "amazon": Driver.getDriver().get("https://www.amazon.com/");
            break;
            case "chase bank": Driver.getDriver().get("https://www.chase.com/");
            break;
            default:
                Driver.getDriver().get(websiteName);
        }
        CucumberUtils.logInfo(" opened website: " + websiteName, true);
    }

    @Then("I verify title is {string}")
    public void iVerifyTitleIs(String title) {
        Assert.assertEquals(title, Driver.getDriver().getTitle());
        CucumberUtils.logInfo("Actual title is: " + Driver.getDriver().getTitle(), true);
    }


    @When("I click {string} button")
    public void iClickButton(String button) {
        String xpath = "";
        switch (button) {
            case "Trending": xpath = "//a[@id='endpoint' and @title='Trending']";
                break;
            case "Best sellers": xpath = "(//a[text()='Best Sellers'])[1]";
                break;
            case "Business": xpath = "(//*[text()='Business'])[1]";
                break;
            default:
                System.out.println("Invalid button");
        }
        SeleniumUtils.click(Driver.getDriver().findElement(By.xpath(xpath)));
        CucumberUtils.logInfo("clicked button: " + button, true);
    }

}
