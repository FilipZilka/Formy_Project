package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fiňo\\Desktop\\repository\\SeleniumSk8test\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dataField = driver.findElement(By.id("datepicker"));
        dataField.sendKeys("10/12/24");

        Thread.sleep(3000);

        dataField.sendKeys(Keys.RETURN);

        Thread.sleep(3000);

        driver.quit();
    }
}
