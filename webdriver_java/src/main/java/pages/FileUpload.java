package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;

public class FileUpload {
    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By submitBtn = By.id("file-submit");
    private By uploadedFiles = By.cssSelector(".example h3");
    public FileUpload(WebDriver driver){
        this.driver=driver;
    }
    public void clickUploadButton(){
        driver.findElement(inputField).click();
    }
    public void uploadFile(String absolutePathOfFile){
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
        driver.findElement(submitBtn).click();
    }
    public String getUploadedFile(){
        return driver.findElement(uploadedFiles).getText();
    }
}
