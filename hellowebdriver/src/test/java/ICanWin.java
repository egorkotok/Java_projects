import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//С помощью Selenium WebDriver автоматизировать следующий сценарий:
//
//        Открыть https://pastebin.com в любом браузере
//        Создать New Paste со следующими деталями:
//        * Код: "Hello from WebDriver"
//
//        * Paste Expiration: "10 Minutes"
//
//        * Paste Name / Title: "helloweb"

public class ICanWin {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com");

        WebElement paste = waitForElementLocatedBy(driver, By.id("paste_code"));
        paste.sendKeys("Hello from WebDriver");

        WebElement pasteExpiration = waitForElementLocatedBy(driver, By.xpath("//*[@id=\"myform\"]/div[3]/div[2]/div[2]/select"));
        pasteExpiration.sendKeys("10 Minutes");

        WebElement pasteName = waitForElementLocatedBy(driver, By.cssSelector("#myform > div.form_frame_left > div:nth-child(5) > div.form_right > input"));
        pasteName.sendKeys("helloweb");

        WebElement createButton = waitForElementLocatedBy(driver, By.id("submit"));
        createButton.click();
    }

    private static WebElement waitForElementLocatedBy(WebDriver driver, By by) {
        return new WebDriverWait(driver, 5)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
