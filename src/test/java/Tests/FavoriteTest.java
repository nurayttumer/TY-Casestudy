package Tests;

import PageModel.FavoriteModel;
import PageModel.ProductsListModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class FavoriteTest {

    FavoriteModel favoriteModel = new FavoriteModel();


    @Step("Favorilere tıklanır.")
    public void clickFavorite() {
        Assert.assertTrue("Failed to enter favorites screen", favoriteModel.clickFavorite());
    }

    @Step("<key> favorilere eklenen ürünün eklendiği kontrol edilir.")
    public void checkAddFavorite(String key) {

        switch (key) {
            case "Ürün Detaydan":
                Assert.assertTrue(favoriteModel.checkAddFavorite(ProductsListModel.nameProductList));

        }
    }

    @Step("Favorilerdeki ürün sepete eklenir.")
    public void clickBasket() {
        favoriteModel.clickBasket();
    }

    @Step("Favorilerdeki ürün silinir.")
    public void deleteFavoriteProduct() {
        Assert.assertTrue("product in favorites not deleted", favoriteModel.deleteFavoriteProduct());
    }
}
