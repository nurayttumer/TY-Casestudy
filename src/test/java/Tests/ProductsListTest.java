package Tests;

import PageModel.ProductsListModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class ProductsListTest {

    ProductsListModel productsListModel = new ProductsListModel();


    @Step("Filtreleme de Marka alanında Monster seçilir")
    public void clickMonster() {
        productsListModel.clickMonster();

    }

    @Step("<key> ürünlerinin geldiği görülür.")
    public void checkFilterProduct(String key) {
        Assert.assertTrue(productsListModel.checkFilterProduct(key));
    }

    @Step("Filtreleme de fiyat Filtresinde min <min> max <max> seçilir.")
    public void setMinMaxPrice(String min, String max) {
        productsListModel.setMinMaxPrice(min, max);

    }

    @Step("İstenilen bir ürün sepete atılır")
    public void addBasket() {
        productsListModel.addBasket();
    }

    @Step("İstenilen bir ürün favorilere eklenir.")
    public void addFavorite() {
        productsListModel.addFavorite();
    }

    @Step("Componentlerdeki ürünlerin varlığı ve fotoğraflarının kırık olmadığı doğrulanır.")
    public void checkAccuracyOfProductAndProductImages() {
        Assert.assertTrue(productsListModel.checkAccuracyOfProductAndProductImages());
    }
}
