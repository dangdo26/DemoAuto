package New;

import SetUp.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class AutoSuggestDropdownDemo extends SetUp {

    Obj obj = new Obj();

    @Test
    public void suggestDropdown() throws InterruptedException {

        driver.get("https://www.makemytrip.com/");
        clickElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/label/span"));


        WebElement typeRestaurant = driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
        Thread.sleep(2000);
        typeRestaurant.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        typeRestaurant.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

}
