package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTestIpla4 {

    @Test
    public void checkSignUp() {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://iplatest.azurewebsites.net");

        WebDriverWait wait = new WebDriverWait(driver, 10); // seconds

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.className("MainRulebook__buttons-container")));

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        WebElement element =
                driver.findElement(
                        By.cssSelector(
                                "#container > div > div.mainbox > span > div > div.MainRulebook__buttons-container > span:nth-child(3) > button"));

        element.click();

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        WebElement element1 =
                driver.findElement(
                        By.cssSelector(
                                "#container > div > div.mainbox > span > div > div:nth-child(15) > div > span:nth-child(2) > button"));

        element1.click();

        System.out.println("Current Url is: " + driver.getCurrentUrl());


        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector(
                                "#container > div > div.mainbox > span > div > div.ErrorPrompt--section-right > span > span > button")));

        WebElement element2 =
                driver.findElement(
                        By.cssSelector(
                                "#container > div > div.mainbox > span > div > div.ErrorPrompt--section-right > span > span > button"));

        element2.click();

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        WebElement element3 = driver.findElement(By.xpath("//*[contains(text(),'Zaloguj się')]"));

        element3.click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Logowanie IPLA')]")));

        driver.switchTo().activeElement();

        new Actions(driver).moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Zarejestruj się')]"))).click().perform();

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Rejestracja IPLA')]")));

        WebElement element4 =
                driver.findElement(
                        By.xpath("//*[contains(text(),'Rejestracja IPLA')]"));

        element4.click();

        WebElement element5 =
                driver.findElement(
                        By.cssSelector("#container > div > div.mainbox > span > div > div > form > div > span:nth-child(1) > div:nth-child(1) > span > div"));

        element5.click();

        WebElement element6 =
                driver.findElement(
                        By.cssSelector("#container > div > div.mainbox > span > div > div > form > div > span:nth-child(1) > span > button"));

        element6.click();

        WebElement element7 =
                driver.findElement(
                        By.cssSelector(
                                "#container > div > div.mainbox > span > div > div.RegisterUser--flex > form > span > div:nth-child(1) > span > input"));
        element7.sendKeys(System.currentTimeMillis()+"arek@arek2.com");

        WebElement element8 =
                driver.findElement(
                        By.cssSelector(
                                "#container > div > div.mainbox > span > div > div.RegisterUser--flex > form > span > div:nth-child(2) > span > input"));
        element8.sendKeys("haslohaslo");

        WebElement element9 =
                driver.findElement(
                        By.cssSelector(
                                "#container > div > div.mainbox > span > div > div.RegisterUser--flex > form > span > div:nth-child(3) > span > input"));
        element9.sendKeys("haslohaslo");

        WebElement element10 =
                driver.findElement(
                        By.cssSelector(
                                "#container > div > div.mainbox > span > div > div.RegisterUser--flex > form > span > div.RegisterUser-Button--wrapper > span > button"));
        element10.click();

        System.out.println("Current Url is: " + driver.getCurrentUrl());
    }

}
