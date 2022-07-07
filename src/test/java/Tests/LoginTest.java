package Tests;

import PageModel.HomeModel;
import PageModel.LoginModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class LoginTest {

    LoginModel loginModel = new LoginModel();
    HomeModel homeModel = new HomeModel();


    @Step("Giriş yap butonuna tıklanır.")
    public void clickLoginBtn() {
        //homeModel.closePopup();
        Assert.assertTrue(loginModel.clickLoginButton());
    }

    @Step("Email alanına <key>, şifre alanına <key> yazılır.")
    public void setEmailPassword(String email, String password) {
        loginModel.setTextEmailPassword(email, password);
    }

    @Step("Email ve password girildikten sonra giriş yap butonuna tıklanır.")
    public void clickSubmit() {
        loginModel.clickSubmitBtn();
    }

    @Step("Başarılı şekilde giriş yapıldığı görülür.")
    public void checkSuccessLogin() {
        Assert.assertTrue("Login Failed", loginModel.checkSuccessLogin());
    }

    @Step("<key> Uyarı mesajı çıktığı görülür.")
    public void checkErrorMessage(String type) {
        Assert.assertTrue("Login fail case failed", loginModel.checkErrorMessage(type));
    }

    @Step("Şifrenin gizli olduğu kontrol edilir.")
    public void checkConfidentialVisible() {
        Assert.assertTrue("Password is not secret", loginModel.checkConfidentialVisible());
    }

    @Step("Göze tıklanır.")
    public void clickEye() {
        loginModel.clickEye();
    }

    @Step("Şifrenin görünür olduğu kontrol edilir.")
    public void checkPasswordVisible() {
        Assert.assertTrue("Password is not visible", loginModel.checkPasswordVisible());

    }
}
