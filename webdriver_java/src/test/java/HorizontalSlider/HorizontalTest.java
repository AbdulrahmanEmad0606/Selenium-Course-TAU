package HorizontalSlider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalTest extends BaseTests {
    @Test
    public void testHorizontalSlider(){
        var horizontal = homePage.clickHorizontalSlider();
        while (true){
        horizontal.clickSlider();
        System.out.println(horizontal.getRange());
        if (horizontal.getRange().equals("4")){
            break;
        }
        }
        assertEquals(horizontal.getRange(),"4","Range != 4");
    }
}
