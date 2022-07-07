package PageModel;

import org.openqa.selenium.By;

public class FavoriteModel extends BaseModel {

    public static By favoriteButton = By.className("account-favorites");
    public static By favoriteCheck = By.cssSelector(".favorites-header-wrapper .active");
    public static By favoriteProductName = By.className("prdct-desc-cntnr-ttl-w");
    public static By basketButton = By.className("basket-button");
    public static By favoriteSizeDropdown = By.cssSelector(".lower-dropdown-li:nth-child(1)");
    public static By deleteFavoriteButton = By.className("ufvrt-btn-wrppr");
    public static By emptyFavoriteText = By.className("empty-favorites-header");


    public boolean clickFavorite() {

        clickElement(favoriteButton);
        return getText(favoriteCheck).equals("Favorilerim");
    }

    public boolean checkAddFavorite(String text) {

        if (!isElementPresent(favoriteProductName)) {
            log.warning("favorite is empty");
            return false;
        } else if (!text.toLowerCase().contains(getText(favoriteProductName).toLowerCase())) {
            log.warning("The product in the cart is incorrect");
            return false;
        } else {
            return text.toLowerCase().contains(getText(favoriteProductName).toLowerCase());
        }

    }

    public void clickBasket() {
        clickElement(basketButton);
        if (isElementPresent(favoriteSizeDropdown)) {
            clickElement(favoriteSizeDropdown);
        }
    }

    public boolean deleteFavoriteProduct() {
        clickElement(deleteFavoriteButton);

        return getText(emptyFavoriteText).equals("Favoriler Listeniz Henüz Boş");
    }
}
