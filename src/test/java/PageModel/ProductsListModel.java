package PageModel;

import Tests.BasketTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductsListModel extends BaseModel {
    public static By checkBoxMonster = By.xpath("//div[@class='fltr-item-text' and text()='Monster']");
    //public static By monsterProducts = By.cssSelector("[title='MONSTER']");
    public static By selectedFilter = By.className("slctd-fltr-item");
    public static By minPriceArea = By.cssSelector(".fltr-srch-prc-rng .min");
    public static By maxPriceArea = By.cssSelector(".fltr-srch-prc-rng .max");
    public static By priceFilterButton = By.className("fltr-srch-prc-rng-srch");
    public static By filterProducts = By.cssSelector(".prdct-cntnr-wrppr .p-card-chldrn-cntnr");
    public static By addToBasket = By.className("add-to-basket");
    public static By productDetailName = By.className("pr-new-br");
    public static By favoriteButton = By.cssSelector(".prdct-cntnr-wrppr .fvrt-btn");
    public static By emptyArea = By.xpath("//html");
    public static By popupColorProduct = By.className("popup");
    public static By productListProductName = By.className("two-line-text");
    public static By homeTabItem = By.cssSelector("li[class*='tab-link']");
    public static By firstComponentItem = By.cssSelector(".component-item:nth-child(1) a");
    public static By boutiqueProducts = By.cssSelector(".products .boutique-product");
    public static By boutiqueProductCardImage = By.cssSelector(".products .p-card-img");


    Random random = new Random();
    List<WebElement> products;
    List<WebElement> boutiqueProduct;
    List<WebElement> boutiqueProductImage;
    List<WebElement> tabs;
    List<WebElement> productsName;
    public static String nameProductDetail;
    public static String nameProductList;


    public void clickMonster() {
        clickElement(checkBoxMonster);
    }

    public boolean checkFilterProduct(String filter) {
        return getText(selectedFilter).equals(filter);
    }

    public void setMinMaxPrice(String min, String max) {
        sendKeys(minPriceArea, min);
        sendKeys(maxPriceArea, max);
        clickElement(priceFilterButton);
        waitSeconds(3);
    }

    public void addBasket() {
        products = findElements(filterProducts);
        int productNumber = random.nextInt(products.size());
        clickElement(products.get(productNumber));
        switchToPageElement(1);
        nameProductDetail = getText(productDetailName);
        waitSeconds(2);
        clickElement(addToBasket);
    }

    public void addFavorite() {
        if (isElementPresent(popupColorProduct)) {
            clickElement(emptyArea);
        }
        products = findElements(favoriteButton);
        productsName = findElements(productListProductName);
        int productNumber = random.nextInt(products.size());
        nameProductList = productsName.get(productNumber).getText();
        waitSeconds(3);
        clickElement(products.get(productNumber));
    }


    public boolean checkAccuracyOfProductAndProductImages() {
        boolean result = false;
        tabs = findElements(homeTabItem);

        for (int i = 0; i < tabs.size(); i++) {

            tabs = findElements(homeTabItem);
            clickElement(tabs.get(i));
            waitSeconds(1);

            clickElement(firstComponentItem);
            boutiqueProduct = findElements(boutiqueProducts);
            boutiqueProductImage = findElements(boutiqueProductCardImage);
            for (int j = 0; j < 4; j++) {

                if (!boutiqueProduct.get(j).isDisplayed()) {
                    log.warning("" + getAttribute(boutiqueProduct.get(j), "title") + " product the product cannot be displayed");
                    return false;
                } else if (getAttribute(boutiqueProductImage.get(j), "src") == null ||
                        getAttribute(boutiqueProductImage.get(j), "src").contains("/Content/images/defaultThumb.jpg")) {
                    log.warning("" + getAttribute(boutiqueProduct.get(j), "title") + " product the picture is broken");
                    return false;
                } else if (boutiqueProduct.get(j).isDisplayed() &&
                        getAttribute(boutiqueProductImage.get(j), "src") != null &&
                        getAttribute(boutiqueProductImage.get(j), "src").contains("https://cdn.dsmcdn.com/mnresize/415/622")) {
                    log.info("" + getAttribute(boutiqueProduct.get(j), "title") + " product and picture looks good");
                    result = true;
                }

            }

        }

        return result;
    }
}
