package AlertTests;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        var uploadPage=homePage.clickFileUpload();
        uploadPage.uploadFile("D:\\Study\\Selenium Course Code\\selenium-webdriver-java-course-c4.2\\Resources\\test.PNG");
        assertEquals(uploadPage.getUploadedFile(),"File Uploaded!","file is not uploaded");
    }

}
