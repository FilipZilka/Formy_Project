package org.example;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class AutomatedForm {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fiňo\\Desktop\\repository\\SeleniumSk8test\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        submitTheForm(driver);

        waitForTheAlert(driver);

        assertEquals("The form was successfully submitted!", getAlertBanner(driver));

        driver.quit();
    }

    public static void submitTheForm (WebDriver driver)
        {
            driver.findElement(By.id("first-name")).sendKeys("Filip");

            driver.findElement(By.id("last-name")).sendKeys("Zilka");

            driver.findElement(By.id("job-title")).sendKeys("QA Engineer Junior");

            driver.findElement(By.id("radio-button-2")).click();

            driver.findElement(By.id("checkbox-1")).click();

            driver.findElement(By.cssSelector("option[value='1']")).click();

            driver.findElement(By.id("datepicker")).sendKeys("01/01/2025");
            driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

            driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        }
    public static void waitForTheAlert(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));

    }
    public static String getAlertBanner(WebDriver driver)
    {
       return driver.findElement(By.className("alert")).getText();
    }

}