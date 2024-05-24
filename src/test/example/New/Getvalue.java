package New;

import SetUp.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;


public class Getvalue extends SetUp {

    Obj obj = new Obj();

    @Test
    public void suggestDropdown() throws InterruptedException {
        login();
        WebElement dropdownElement = driver.findElement(obj.headermenuRes);
        moveToElement(dropdownElement, driver);
        clickElement(obj.menuResaurant);
        clickElement(obj.btnCloseListResOutOfmoney);


        while (true) {
            List<WebElement> listres = driver.findElements(By.className("title-name-new-table"));
            System.out.println("Total: " + listres.size());
            for (int i = 0; i <= listres.size(); i++) {
                System.out.println( listres.get(i).getText());
            }

            // Tiến tới trang tiếp theo (nếu có)
            WebElement nextPageButton = driver.findElement(By.className("paginate_button next"));
            if (nextPageButton.isEnabled()) {
                nextPageButton.click();
            } else {
                break;
            }
        }

    }


    @Test
    public void getValueInTable() throws InterruptedException {
        login();
        WebElement dropdownElement = driver.findElement(obj.headermenuRes);
        moveToElement(dropdownElement, driver);
        clickElement(obj.menuResaurant);
        clickElement(obj.btnCloseListResOutOfmoney);

        // Xác định phần tử bảng
        WebElement table = driver.findElement(By.id("restaurant-enable"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        int columnIndex = 1;
        // Lặp qua từng hàng và in ra giá trị của cột thứ n
        for (WebElement row : rows) {
            List<WebElement> columns = row.findElements(By.tagName("td"));
            if (!columns.isEmpty()) {
                WebElement resName = columns.get(1);
                WebElement phone = columns.get(columnIndex + 6);
                System.out.println(resName.getText() + " "  +  phone.getText());
            }
        }







    }

    }


