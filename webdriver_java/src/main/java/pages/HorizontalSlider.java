package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlider {
    private WebDriver driver;
    private By slider =By.cssSelector(".sliderContainer input");
    private By range = By.id("range");
    public HorizontalSlider(WebDriver driver){
        this.driver=driver;
    }
    public void clickSlider(){
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
    }
    public String getRange(){
        return driver.findElement(range).getText();
    }
}
