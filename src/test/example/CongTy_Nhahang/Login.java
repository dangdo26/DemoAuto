package CongTy_Nhahang;

import SetUp.DataFake;
import SetUp.Obj;
import SetUp.SetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login extends SetUp {

    Obj obj = new Obj();
    DataFake dataFaker = new DataFake();


    @Test
    public void loginSuccess() throws InterruptedException {
        driver.get("https://beta.admin.techres.vn/login");
        setText(obj.usernameInput, "superadmin@techres.vn");
        setText(obj.passwordInput, "0123");
        clickElement(obj.loginButton);
    }

    @Test
    public void loginWithPassFail() throws InterruptedException {
        driver.get("https://beta.admin.techres.vn/login");
        setText(obj.usernameInput, "superadmin@techres.vn");
        setText(obj.passwordInput, "0000");
        clickElement(obj.loginButton);

    }

    @Test
    public void loginWithUsernameFail() throws InterruptedException {
        driver.get("https://beta.admin.techres.vn/login");
        setText(obj.usernameInput, dataFaker.email);
        setText(obj.passwordInput, "0123");
        clickElement(obj.loginButton);
    }


}
