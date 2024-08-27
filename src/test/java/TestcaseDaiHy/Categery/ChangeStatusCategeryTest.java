package TestcaseDaiHy.Categery;

import DaiHyPage.Categery.ChangeStatusCategery;
import common.BaseTest;
import org.testng.annotations.Test;

public class ChangeStatusCategeryTest extends BaseTest {
 ChangeStatusCategery changeStatus = new ChangeStatusCategery();

    @Test
    public void disableSuccess(){
        changeStatus.disableSuccess();
    }
    @Test
    public void enableSuccess(){
        changeStatus.enableSuccess();
    }

}
