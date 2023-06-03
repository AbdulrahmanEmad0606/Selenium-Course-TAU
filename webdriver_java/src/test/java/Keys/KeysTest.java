package Keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AdditionalKeys;

import static org.testng.Assert.assertEquals;

public class KeysTest extends BaseTests {
    @Test
    public void testKeys(){
        AdditionalKeys additionalKeys = homePage.clickAdditionalKeys();
        additionalKeys.setInputField("A"+Keys.BACK_SPACE);
        assertEquals(additionalKeys.getResultText(),"You entered: BACK_SPACE","You entered another key");
    }
    @Test
    public void testPressingOnMultipleButtonsAtOnce(){
        AdditionalKeys additionalKeys = homePage.clickAdditionalKeys();
        additionalKeys.enterPI();
    }

}
