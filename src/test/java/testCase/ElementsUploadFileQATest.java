package testCase;

import common.BaseTest;
import lombok.SneakyThrows;
import org.testng.annotations.Test;
import page.ElementsUploadFileQAPage;

import java.awt.*;

public class ElementsUploadFileQATest extends BaseTest {
    ElementsUploadFileQAPage eUpload = new ElementsUploadFileQAPage();


    @Test
    public void uploadTest() throws Exception {
        eUpload.upload();
        eUpload.verifyNameMessageDisplay(eUpload.filePath,"not match filePath");

    }


}
