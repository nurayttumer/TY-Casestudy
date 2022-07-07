package Tests;

import PageModel.BasketModel;
import PageModel.ProductsListModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class BasketTest {
    BasketModel basketModel = new BasketModel();

    @Step("Sepete tıklanır.")
    public void clickBasketButton() {

        basketModel.clickBasketButton();
    }

    @Step("<key> eklenen ürünün sepette eklendiği kontrol edilir.")
    public void checkAddProducts(String key) {

        switch (key) {
            case "Ürün Detaydan":
                Assert.assertTrue(basketModel.checkAddProduct(ProductsListModel.nameProductDetail));
                break;
            case "Favorilerden":
                Assert.assertTrue(basketModel.checkAddProduct(ProductsListModel.nameProductList));
                break;

        }
    }

    @Step("Sepetteki ürün silinir.")
    public void deleteBasketProduct() {
        Assert.assertTrue("The product in the cart has not been deleted", basketModel.deleteBasketProduct());
    }
}
