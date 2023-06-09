package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        clickOnElement("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown(){
        clickOnElement("Dropdown");
        return new DropdownPage(driver);
    }
    public HoverPage clickHoverPage(){
        clickOnElement("Hovers");
        return new HoverPage(driver);
    }
    public AdditionalKeys clickAdditionalKeys(){
        clickOnElement("Key Presses");
        return new AdditionalKeys(driver);
    }
    public HorizontalSlider clickHorizontalSlider(){
        clickOnElement("Horizontal Slider");
        return new HorizontalSlider(driver);
    }
    public AlertsPage clickAlerts(){
        clickOnElement("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    public FileUpload clickFileUpload(){
        clickOnElement("File Upload");
        return new FileUpload(driver);
    }
    private void clickOnElement(String link){
        driver.findElement(By.linkText(link)).click();
    }
}