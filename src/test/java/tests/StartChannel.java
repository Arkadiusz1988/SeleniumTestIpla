package tests;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartChannel {


    @Test
    public void checkStartChannel() throws ATUTestRecorderException {

        WebDriver driver = new ChromeDriver();

        ATUTestRecorder recorder = new ATUTestRecorder("/home/arkadiusz/Pulpit/zadania/SeleniumTest/testsRecord","StartChannelTest",false);

        recorder.start();

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

        WebElement element3 = driver.findElement(By.xpath("//*[contains(text(),'Start')]"));

        element3.click();

        Assert.assertEquals("http://iplatest.azurewebsites.net/", driver.getCurrentUrl());

        driver.close();

        recorder.stop();
    }
}
