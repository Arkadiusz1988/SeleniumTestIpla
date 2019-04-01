package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTests {


    @Test
    public void startWebDriver(){

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://iplatest.azurewebsites.net");

        Assert.assertTrue("Title should start",driver.getTitle().startsWith("IPLA"));

        driver.close();
    }

    @Test
    public void checkRegulationsRodoChanels_liveAndContent(){

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://iplatest.azurewebsites.net");

        WebDriverWait wait = new WebDriverWait(driver, 10); //seconds

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("MainRulebook__buttons-container")));

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        WebElement element = driver.findElement(By.cssSelector("#container > div > div.mainbox > span > div > div.MainRulebook__buttons-container > span:nth-child(3) > button"));

        element.click();

        // Check the url of the page
        System.out.println("Current Url is: " + driver.getCurrentUrl());

        WebElement element1 = driver.findElement(By.cssSelector("#container > div > div.mainbox > span > div > div:nth-child(15) > div > span:nth-child(2) > button"));

        element1.click();

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        WebDriverWait wait1 = new WebDriverWait(driver, 10); //seconds

        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#container > div > div.mainbox > span > div > div.ErrorPrompt--section-right > span > span > button")));

        WebElement element2 = driver.findElement(By.cssSelector("#container > div > div.mainbox > span > div > div.ErrorPrompt--section-right > span > span > button"));

        element2.click();

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        WebElement element3 = driver.findElement(By.xpath("//*[contains(text(),'Live')]"));

        element3.click();

        WebDriverWait wait2 = new WebDriverWait(driver, 5); //seconds

        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'DZISIAJ 1 kwietnia')]")));

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        Assert.assertEquals("http://iplatest.azurewebsites.net/channels-live",driver.getCurrentUrl());

        Assert.assertEquals("DZISIAJ 1 kwietnia", driver.findElement(By.xpath("//*[contains(text(),'DZISIAJ 1 kwietnia')]"))
            .getText());

        WebElement element4 = driver.findElement(By.xpath("//*[contains(text(),'Liga Siatkówki Kobiet / ŁKS Commercecon Łódź - BKS')]"));

        WebElement parent = element4.findElement(By.xpath("./.."));
        WebElement parent1 = parent.findElement(By.xpath("../.."));
        WebElement parent2 = parent1.findElement(By.xpath("../.."));

        WebDriverWait wait3 = new WebDriverWait(driver, 5); //seconds

        wait3.until(ExpectedConditions.elementToBeClickable(parent2));

        parent2.click();

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        WebDriverWait wait4 = new WebDriverWait(driver, 5); //seconds

        wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'KUPUJĘ')]")));

        Assert.assertEquals("KUPUJĘ",driver.findElement(By.xpath("//*[contains(text(),'KUPUJĘ')]")).getText());

        WebElement element5 = driver.findElement(By.xpath("//*[contains(text(),'OGLĄDAJ')]"));

        element5.click();

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        driver.close();

    }

}
