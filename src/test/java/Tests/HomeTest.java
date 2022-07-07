package Tests;

import PageModel.HomeModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class HomeTest {

    HomeModel homeModel = new HomeModel();

    @Step("Kullanıcı <key> sitesini ziyaret eder")
    public void userVisitSite(String key) {
        homeModel.userVisitSite(key);

    }

    @Step("Search alanına <key> yazılır.")
    public void setSearchBar(String key) {
        Assert.assertTrue("The requested text was not found.", homeModel.setSearchBar(key));

    }

}
