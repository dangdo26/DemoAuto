package page;

import helpers.RobotHelper;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.awt.*;
import java.io.File;

import static Keywords.WebUi.*;

public class ElementsUploadFileQAPage {

    String URL = "https://demoqa.com/upload-download";

    public By uploadBtn = By.id("uploadFile");
    public By pUploadFilePath = By.id("uploadedFilePath");


    public String filePath = "C:\\Users\\LENOVO\\OneDrive\\Máy tính\\Hợp đồng.docx";

    public void enterFileInput() {
        setText(uploadBtn, filePath);
    }

    public void verifyNameMessageDisplay(String expected, String message) {
        Assert.assertTrue(getWebElement(pUploadFilePath).isDisplayed(), "FAIL. Error message no displays.");
        Assert.assertEquals(getTextElement(pUploadFilePath), expected, message);
    }


    public void upload() throws Exception {
        openURL(URL);
        File file = new File(filePath);
        if (!file.exists()) {
            throw new Exception("File does not exist: " + filePath);
        }
        enterFileInput();
        waitForElementVisible(pUploadFilePath);
    }


}
