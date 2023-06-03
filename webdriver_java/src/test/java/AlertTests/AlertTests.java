package AlertTests;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {
    @Test
    public void testAcceptAlert() {
        var alertPage = homePage.clickAlerts();
        alertPage.triggerAlert();
        alertPage.acceptAlert();
        assertEquals(alertPage.getResult(), "You successfully clicked an alert", "message is not correct");
    }
    @Test
    public void testDismissAlert() {
        var alertPage = homePage.clickAlerts();
        alertPage.triggerConfirm();
        alertPage.cancelAlert();
        assertEquals(alertPage.getResult(), "You clicked: Cancel", "you click on the OK button");
    }
    @Test
    public void testPromptAlert() {
        String text = "test text";
        var alertPage = homePage.clickAlerts();
        alertPage.triggerPrompt();
        alertPage.setText(text);
        alertPage.acceptAlert();
        assertEquals(alertPage.getResult(), "You entered: "+text, "In valid text");
    }
}
