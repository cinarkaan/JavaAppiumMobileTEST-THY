package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface WebElementMethods {

    public WebElement findById (WebDriver webDriver, String id);
    public WebElement findByXpath (WebDriver webDriver, String Xpath);


}
