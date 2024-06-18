package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class OpenModalAndWaits {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fiňo\\Desktop\\repository\\SeleniumSk8test\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");



        WebElement openModal = driver.findElement(By.id("modal-button"));
        openModal.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement okButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ok-button")));

        okButton.click();

        driver.quit();
    }
}
