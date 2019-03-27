import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HelloWebDriver {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumhq.org");

        //new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("q")));

        //driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        WebElement searchInput = driver.findElement(By.id("q"));
        //WebElement searchInput = waitForElementLocatedBy(driver, By.id("q"));

        searchInput.sendKeys("selenium java");

        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        searchButton.click();

//        new WebDriverWait(driver, 10)
//                .until(ExpectedConditions
//                        .presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class, 'gsc-webResult') and contains(.,'selenium' and contains(.,'java')]")));
//
//        List<WebElement> searchResults = driver.findElements(By.xpath("//div[contains(@class, 'gsc-webResult') and contains(.,'selenium' and contains(.,'java')]"));
//        System.out.println("search result: " + searchResults.size());


//        new WebDriverWait(driver, 10)
//                .until(ExpectedConditions.
//                        attributeToBe(searchInput, "class", "abc"));

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        driver.quit();

    }

    private static WebElement waitForElementLocatedBy(WebDriver driver, By by) {
        return new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
