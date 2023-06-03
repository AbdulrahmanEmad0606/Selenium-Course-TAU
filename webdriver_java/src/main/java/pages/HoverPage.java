package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class HoverPage {
    private WebDriver driver;
    private By figures = By.className("figure");
    public By boxCaption = By.className("figcaption");

    public HoverPage(WebDriver driver) {
        this.driver = driver;
    }
    /** to generate java doc firstly add the param to the method
     * */
    /***
     *
     * @param index => starts from 1
     */
    public FigureCaption hoverOverFigure(int index) {
        WebElement figure = driver.findElements(figures).get(index - 1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FigureCaption(driver.findElement(boxCaption));
    }
}

