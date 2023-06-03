package pages;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class AdditionalKeys {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By result = By.id("result");
    public AdditionalKeys(WebDriver driver){
        this.driver=driver;
    }
    public void setInputField(String text){
        driver.findElement(inputField).sendKeys(text);
    }
    public String getResultText(){
        return driver.findElement(result).getText();
    }
    public void enterPI(){
        driver.findElement(inputField).sendKeys(Keys.chord(Keys.ALT,"p") + " = 3.14");
    }

}
