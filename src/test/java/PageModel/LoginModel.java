package PageModel;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LoginModel extends BaseModel {

    public static By accountUser = By.className("account-user");
    public static By loginBtn = By.className("login-button");
    public static By loginPageText = By.cssSelector("#login-register .lr-title h3");
    public static By email = By.id("login-email");
    public static By password = By.id("login-password-input");
    public static By submitButton = By.cssSelector("[type='submit']");
    public static By errorBox = By.id("error-box-wrapper");
    public static By passwordClosedEye = By.className("i-eye-close");
    public static By passwordOpenedEye = By.className("i-eye-open");


    public void hoverAccountUser() {
        hoverToElement(findElement(accountUser));
    }

    public boolean clickLoginButton() {
        hoverAccountUser();
        clickElement(loginBtn);


        if (!isElementPresent(loginPageText) || !getText(loginPageText).contains("Trendyol’a giriş yap veya hesap oluştur, indirimleri kaçırma!")) {
            log.warning("Failed to login to login page");
            return false;
        }
        return true;
    }

    public void setTextEmailPassword(String emailText, String passwordtext) {
        sendKeys(email, emailText);
        sendKeys(password, passwordtext);
    }

    public void clickSubmitBtn() {
        clickElement(submitButton);
    }

    public boolean checkSuccessLogin() {
        waitSeconds(3);
        return getText(accountUser).equals("Hesabım");
    }

    public boolean checkErrorMessage(String type) {
        switch (type) {
            case "Hatalı":
                return getText(errorBox).equals("E-posta adresiniz ve/veya şifreniz hatalı.");
            case "Geçersiz Mail":
                return getText(errorBox).equals("Lütfen geçerli bir e-posta adresi giriniz.");
            case "Geçersiz Şifre":
                return getText(errorBox).equals("Lütfen şifrenizi giriniz.");
        }
        return false;
    }

    public boolean checkConfidentialVisible() {
        return getAttribute(password, "type").equals("password") && isElementPresent(passwordClosedEye);

    }

    public void clickEye() {
        clickElement(passwordClosedEye);
    }

    public boolean checkPasswordVisible() {
        return getAttribute(password, "type").equals("text") && isElementPresent(passwordOpenedEye);
    }
}
