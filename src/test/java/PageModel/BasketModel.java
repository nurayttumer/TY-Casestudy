package PageModel;

import org.openqa.selenium.By;

public class BasketModel extends BaseModel {

    public static By basketButton = By.className("account-basket");
    public static By basketProductName = By.className("pb-item");
    public static By deleteButton = By.className("i-trash");
    public static By deletePopupButton = By.xpath("//button[text()='Sil']");
    public static By deleteText = By.cssSelector(".pb-empty-basket span");


    public void clickBasketButton() {
        waitSeconds(4);
        clickElement(basketButton);
    }

    public boolean checkAddProduct(String text) {
        String basketName = getAttribute(basketProductName, "title").replace(" ", "").toLowerCase();
        String textProductName = text.replace(" ", "").toLowerCase();

        if (!isElementPresent(basketProductName)) {
            log.warning("basket is empty");
            return false;
        } else if (!textProductName.contains(basketName)) {
            log.warning("The product in the cart is incorrect");
            return false;
        } else {
            return textProductName.contains(basketName);
        }
    }

    public boolean deleteBasketProduct() {
        clickElement(deleteButton);
        clickElement(deletePopupButton);
        waitSeconds(2);
        return getText(deleteText).equals("Sepetinde ürün bulunmamaktadır.");
    }
}
