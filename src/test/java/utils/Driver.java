package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Driver {
    private static String propertyPath = "src/test/resources/conf/configuration.properties";
    private static WebDriver driver;

    // how to log in to saucelabs
    // private static final String sauceUser = ConfigReader.readProperty(propertyPath, "sauceUserName");
   // private static final String sauceKey = ConfigReader.readProperty("sauceKey", propertyPath);
   // private static final String URL = "https://" + sauceUser + "";--> driver from saucelabs


    public static WebDriver getDriver() {
        /*if(driver == null) {
            //for saucelabs
            if (ConfigReader.readProperty("executeTestLocally", propertyPath).equalsIgnoreCase(false)){
                driver = getRemoteDriver();
            }else{
                //switch statament goes here
            }*/
        if(driver == null) {
            switch (ConfigReader.readProperty(propertyPath, "browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    System.out.println("Invalid browser type");
            }
        }
        return driver;
    }

    public static void quitDriver() {
        getDriver().quit();
        driver = null;
    }
// remote control for saucelabs
    /*public static WebDriver getRemoteDriver() {
        WebDriver driver = null;
        try {
            DesiredCapabilities dp = DesiredCapabilities.chrome();
            dp.setCapability("browserNmae", "chrome");
            dp.setCapability("version", ConfigReader.readProperty("browser_version", propertyPath));
            dp.setCapability("platform", ConfigReader.readProperty("os", propertyPath));
            driver = new RemoteWebDriver(new URL(URL), dp);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }*/


}
