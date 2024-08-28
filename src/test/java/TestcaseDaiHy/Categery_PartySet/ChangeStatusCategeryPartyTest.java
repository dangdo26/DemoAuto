package TestcaseDaiHy.Categery_PartySet;

import DaiHyPage.Categery.ChangeStatusCategery;
import DaiHyPage.Categery_PartySet.ChangeStatusCategery_PartySet;
import common.BaseTest;
import org.testng.annotations.Test;

public class ChangeStatusCategeryPartyTest extends BaseTest {
 ChangeStatusCategery_PartySet changeStatus = new ChangeStatusCategery_PartySet();

    @Test
    public void disableSuccess(){
        changeStatus.disableSuccess();
    }
    @Test
    public void enableSuccess(){
        changeStatus.enableSuccess();
    }

}
