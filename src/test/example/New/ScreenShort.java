package New;
import SetUp.*;
import org.apache.commons.io.FileUtils; // FileUtils thực hiện các chức năng đọc, ghi, copy, so sánh file
import org.openqa.selenium.OutputType; // Thực hiện capture screenshot và lưu trữ tại nơi chỉ định
import org.openqa.selenium.TakesScreenshot; // Thực hiện capture screenshot và lưu trữ tại nơi chỉ định
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class ScreenShort extends SetUp {
    Obj obj = new Obj();
    DataFake dataFaker = new DataFake();

    @Test(priority = 1, description = "takeSnap")
    public void takeScreenShort() throws IOException, InterruptedException {
        driver.get("https://beta.admin.techres.vn/login");
        Thread.sleep(2000);
        File takeScreen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(takeScreen, new File("C://Users//LENOVO//OneDrive//Máy tính//ScreenShort/screen1.png"));
        System.out.print(dataFaker.current);

    }




}
