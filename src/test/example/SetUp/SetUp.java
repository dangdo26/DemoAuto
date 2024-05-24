package SetUp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public abstract class SetUp {

    Obj obj = new Obj();
    public WebDriver driver;

    @BeforeMethod
    public void createDriver() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }

    public void login() throws InterruptedException {
        driver.get("https://beta.admin.techres.vn/login");
        setText(obj.usernameInput,"superadmin@techres.vn");
        setText(obj.passwordInput,"0123");
        clickElement(obj.loginButton);
    }

    public void moveToElement(WebElement elenment, WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(elenment).perform();

    }

    // Click chuột vào elenment
    public void clickElement(By by) throws InterruptedException {
        // Đợi đến khi có thể click

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        Thread.sleep(500);
        // Click
        driver.findElement(by).click();
    }

    // Set text cho input
    public void setText(By by, String data) {

        driver.findElement(by).sendKeys(data);

    }

}
