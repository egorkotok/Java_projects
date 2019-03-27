import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//        1. Открыть https://cloud.google.com/
//        2. Нажать на кнопку EXPLORE ALL PRODUCTS
//        3. Нажать на кнопку SEE PRICING
//        4. В панели слева выбрать Calculators
//        5. Активировать раздел COMPUTE ENGINE вверху страницы
//        6. Заполнить форму следующими данными:
//        * Number of instances: 4
//        * What are these instances for?: оставить пустым
//        * Operating System / Software: Free: Debian, CentOS, CoreOS, Ubuntu, or other User Provided OS
//        * VM Class: Regular
//        * Instance type: n1-standard-8    (vCPUs: 8, RAM: 30 GB)
//        * Выбрать Add GPUs
//        * Number of GPUs: 1
//        * GPU type: NVIDIA Tesla V100
//        * Local SSD: 2x375 Gb
//        * Datacenter location: Frankfurt (europe-west3)
//        * Commited usage: 1 Year
//        7. Нажать Add to Estimate
//        8. Проверить соответствие данных следующих полей: VM Class, Instance type, Region, local SSD, commitment term
//        9. Проверить что сумма аренды в месяц совпадает с суммой получаемой при ручном прохождении теста.

public class HurtMePlenty {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://cloud.google.com/ ");
//
//        WebElement exploreAllProductsButton = driver.findElement(By.xpath("//a[@href=\"https://cloud.google.com/products/\" and @class=\"cloud-button cloud-button--primary\"]"));
//        exploreAllProductsButton.click();
//
//        //WebElement seePricingButton = driver.findElement(By.xpath("//a[@href=\"https://cloud.google.com/pricing/\" and @class=\"cloud-button cloud-button--secondary\"]"));
//        WebElement seePricingButton = waitForElementLocatedBy(driver, By.xpath("//a[@href=\"https://cloud.google.com/pricing/\" and @class=\"cloud-button cloud-button--secondary\"]"));
//        seePricingButton.click();
//
//        WebElement goToPageButton = waitForElementLocatedBy(driver, By.xpath("//a[text()=\"Go to page\"]"));
//        goToPageButton.click();
//
//        WebElement calculatorsbutton = driver.findElement(By.xpath("//a[text()=\"Calculators\"]"));
//        //WebElement calculatorsbutton = waitForElementLocatedBy(driver, By.xpath("//a[text()=\"Calculators\"]"));
//        calculatorsbutton.click();

        driver.get("https://cloud.google.com/products/calculator/");

        //WebElement numberOfInstances = waitForElementLocatedBy(driver, By.id("input_46"));
        //numberOfInstances.click();
        //numberOfInstances.sendKeys("4");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"input_46\"]")).click();





        //WebElement instanceType = driver.findElement(By.xpath("//*[@id=\"select_1753\"]"));
        //instanceType.sendKeys("n1-standard-8    (vCPUs: 8, RAM: 30 GB)");

        driver.close();

    }

    private static WebElement waitForElementLocatedBy(WebDriver driver, By by) {
        return new WebDriverWait(driver, 4)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
