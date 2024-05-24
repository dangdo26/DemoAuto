package page;

import helpers.RobotHelper;
import org.openqa.selenium.By;

import java.awt.*;

import static Keywords.WebUi.*;

public class ElementsUploadFileQAPage {

    String URL = "https://demoqa.com/upload-download";

    public By uploadBtn = By.id("uploadFile");

    public void clickUploadBtn() {
        setText(uploadBtn, "C:\\Users\\LENOVO\\OneDrive\\Máy tính\\Hợp đồng.docx");
    }


    public void upload() {
        openURL(URL);
        clickUploadBtn();
        sleep(1);

    }


}
