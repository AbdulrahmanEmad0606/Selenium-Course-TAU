package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButton=By.cssSelector("ul li:nth-child(1) button");
    private By triggerConfirmButton=By.cssSelector("ul li:nth-child(2) button");
    private By triggerPromptButton=By.cssSelector("ul li:nth-child(3) button");
    private By result=By.id("result");
    public AlertsPage(WebDriver driver){
        this.driver=driver;
    }
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }
    public void cancelAlert(){
        driver.switchTo().alert().dismiss();
    }
    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }
    public void setText(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String getResult(){
        return driver.findElement(result).getText();
    }

}
