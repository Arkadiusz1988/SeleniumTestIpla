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

public class Login {


    @Test
    public void checkLogin() throws ATUTestRecorderException {

        WebDriver driver = new ChromeDriver();

        ATUTestRecorder recorder = new ATUTestRecorder("/home/arkadiusz/Pulpit/zadania/SeleniumTest/testsRecord","Login",false);

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

        WebElement element3 = driver.findElement(By.xpath("//*[contains(text(),'Zaloguj się')]"));

        element3.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Logowanie IPLA')]")));

        Assert.assertEquals("Logowanie IPLA", driver.findElement(By.xpath("//*[contains(text(),'Logowanie IPLA')]"))
                .getText());

        Assert.assertEquals("Logowanie Plus", driver.findElement(By.xpath("//*[contains(text(),'Logowanie Plus')]"))
                .getText());

        Assert.assertEquals("Logowanie Cyfrowy Polsat", driver.findElement(By.xpath("//*[contains(text(),'Logowanie Cyfrowy Polsat')]"))
                .getText());

        Assert.assertEquals("Logowanie Facebook", driver.findElement(By.xpath("//*[contains(text(),'Logowanie Facebook')]"))
                .getText());


        WebElement element4 = driver.findElement(By.xpath("//*[contains(text(),'Logowanie IPLA')]"));

        element4.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#container > div > div.mainbox > span > div > div.Login--flex > form > fieldset > span")));

        WebElement element5 =
                driver.findElement(
                        By.cssSelector(
                                "#container > div > div.mainbox > span > div.route-content.Login > div.Login--flex > form > fieldset > span > div:nth-child(1) > span > input"));
        element5.sendKeys("arek@arek4.com");

        WebElement element6 =
                driver.findElement(
                        By.cssSelector(
                                "#container > div > div.mainbox > span > div.route-content.Login > div.Login--flex > form > fieldset > span > div:nth-child(2) > span > input"));
        element6.sendKeys("haslohaslo");

        WebElement element7 =
                driver.findElement(
                        By.cssSelector(
                                "#container > div > div.mainbox > span > div.route-content.Login > div.Login--flex > form > fieldset > span > div.Login-Button--wrapper > span"));
        element7.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Proszę zapoznać się z regulaminami')]")));

        Assert.assertEquals("Proszę zapoznać się z regulaminami", driver.findElement(By.xpath("//*[contains(text(),'Proszę zapoznać się z regulaminami')]")).getText());

        driver.close();

        recorder.stop();
    }

}
