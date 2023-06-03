package Hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FigureCaption;
import pages.HomePage;

import static org.testng.Assert.*;

public class Hover extends BaseTests {
    @Test
    public void testHover() {
        var hoverPage = homePage.clickHoverPage();
        FigureCaption figureCaption = hoverPage.hoverOverFigure(1);
        assertTrue(figureCaption.isCaptionDisplayed(), "Caption is not displayed");
        assertEquals(figureCaption.getTitle(), "name: user1");
        assertEquals(figureCaption.getLinkText(), "View profile", "text is incorrect");
        assertTrue(figureCaption.getLink().endsWith("/users/1"), "title does not end with user1");
    }
}
