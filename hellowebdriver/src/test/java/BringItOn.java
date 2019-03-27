import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Открыть https://pastebin.com в любом браузере
//        Создать New Paste со следующими деталями:
//        * Код:
//
//        git config --global user.name  "New Sheriff in Town"
//        git reset $(git commit-tree HEAD^{tree} -m "Legacy code")
//        git push origin master --force
//        * Syntax Highlighting: "Bash"
//        * Paste Expiration: "10 Minutes"
//        * Paste Name / Title: "how to gain dominance among developers"
//
//        3. Сохранить paste и проверить следующее:
//        * Заголовок страницы браузера соответствует Paste Name / Title
//        * Синтаксис подвечен для bash
//        * Проверить что код соответствует введенному в пункте 2

public class BringItOn {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com");

        WebElement paste = waitForElementLocatedBy(driver, By.id("paste_code"));
        paste.sendKeys("git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force");

        WebElement syntaxHighlighting = waitForElementLocatedBy(driver, By.xpath("//*[@class=\"post_select select2_search select2-hidden-accessible\"]"));
        syntaxHighlighting.sendKeys("Bash");

        WebElement pasteExpiration = waitForElementLocatedBy(driver, By.xpath("//*[@id=\"myform\"]/div[3]/div[2]/div[2]/select"));
        pasteExpiration.sendKeys("10 Minutes");

        WebElement pasteName = waitForElementLocatedBy(driver, By.cssSelector("#myform > div.form_frame_left > div:nth-child(5) > div.form_right > input"));
        pasteName.sendKeys("how to gain dominance among developers");

        WebElement createButton = waitForElementLocatedBy(driver, By.id("submit"));
        createButton.click();
    }

    private static WebElement waitForElementLocatedBy(WebDriver driver, By by) {
        return new WebDriverWait(driver, 5)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
