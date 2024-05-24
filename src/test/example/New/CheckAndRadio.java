package New;

import SetUp.Obj;
import SetUp.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class CheckAndRadio extends SetUp {

    Obj obj = new Obj();

    @Test
    public void suggestDropdown() throws InterruptedException {
        driver.get("https://app.endtest.io/guides/docs/how-to-test-checkboxes/");
        // Checkbox
        clickElement(By.id("pet1"));
        Thread.sleep(1000);
        clickElement(By.id("pet3"));
        Thread.sleep(2000);
        clickElement(By.id("pet1"));
        Thread.sleep(1000);
        clickElement(By.id("pet3"));
        Thread.sleep(2000);


        // di chuyển màn hình xuống 1 element
        WebElement move = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/a[1]/span[2]"));
        Actions action = new Actions(driver);
        action.moveToElement(move);
        action.perform();
        Thread.sleep(2000);


    }
}
