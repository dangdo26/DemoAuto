package testCase;

import com.fasterxml.jackson.databind.ser.Serializers;
import common.BaseTest;
import org.testng.annotations.Test;
import page.BranchesPage;

public class BranchesTest extends BaseTest {

    BranchesPage brachePage = new BranchesPage();


    @Test
    public void addBranchSuccess() {
        brachePage.addNewBranch();

    }


}
