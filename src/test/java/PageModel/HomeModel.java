package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomeModel extends BaseModel {


    public static By closePopup = By.id("Combined-Shape");
    public static By searchBox = By.className("search-box");
    public static By textSearchDescription = By.cssSelector(".dscrptn h1");


    public void userVisitSite(String key) {
        webDriver.get(key);
        closePopup();
    }

    public void closePopup() {
        if (isElementPresent(closePopup)) {
            clickElement(closePopup);
        }
    }

    public boolean setSearchBar(String key) {
        sendKeys(searchBox, key);
        sendKeys(searchBox, "" + Keys.ENTER + "");
        return getText(textSearchDescription).equals(key);
    }

}
