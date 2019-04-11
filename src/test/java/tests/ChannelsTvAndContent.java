package tests;

import enums.ChannelsTvAndContentEnum;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChannelsTvAndContent {

    @Test
    public void checkChannelsTvAndContent(){

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://iplatest.azurewebsites.net");

        WebDriverWait wait = new WebDriverWait(driver, 10); //seconds

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("MainRulebook__buttons-container")));

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        WebElement element = driver.findElement(By.cssSelector("#container > div > div.mainbox > span > div > div.MainRulebook__buttons-container > span:nth-child(3) > button"));

        element.click();

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        WebElement element1 = driver.findElement(By.cssSelector("#container > div > div.mainbox > span > div > div:nth-child(15) > div > span:nth-child(2) > button"));

        element1.click();

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#container > div > div.mainbox > span > div > div.ErrorPrompt--section-right > span > span > button")));

        WebElement element2 = driver.findElement(By.cssSelector("#container > div > div.mainbox > span > div > div.ErrorPrompt--section-right > span > span > button"));

        element2.click();

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        WebElement element3 = driver.findElement(By.xpath("//*[contains(text(),"+"'"+ChannelsTvAndContentEnum.CanalName.getVal()+"'"+")]"));

        element3.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),"+"'"+ChannelsTvAndContentEnum.ContentName.getVal()+"'"+")]")));

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        WebElement element4 =
                driver.findElement(
                        By.xpath("//*[contains(text(),"+"'"+ChannelsTvAndContentEnum.ContentName.getVal()+"'"+")]"));

        WebElement parent = element4.findElement(By.xpath("./.."));
        WebElement parent1 = parent.findElement(By.xpath("../.."));
        WebElement parent2 = parent1.findElement(By.xpath("../.."));

        wait.until(ExpectedConditions.elementToBeClickable(parent2));

        parent2.click();

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'KUPUJĘ')]")));

        Assert.assertEquals("KUPUJĘ",driver.findElement(By.xpath("//*[contains(text(),'KUPUJĘ')]")).getText());

        WebElement element5 = driver.findElement(By.xpath("//*[contains(text(),'OGLĄDAJ')]"));

        element5.click();

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        driver.close();

    }
}
