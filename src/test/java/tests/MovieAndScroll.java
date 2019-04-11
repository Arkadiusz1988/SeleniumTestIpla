package tests;

import enums.LiveAndContentEnum;
import enums.MovieAndScrollEnum;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MovieAndScroll {

  @Test
  public void checkMovieAndScroll() {

    WebDriver driver = new ChromeDriver();

    driver.navigate().to("http://iplatest.azurewebsites.net");

    driver.manage().window().maximize();

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

    WebElement element3 =
        driver.findElement(
            By.xpath(
                "//*[contains(text()," + "'" + MovieAndScrollEnum.CanalName.getVal() + "'" + ")]"));

    element3.click();

    wait.until(
        ExpectedConditions.visibilityOfElementLocated(
            By.xpath(
                "//*[contains(text()," + "'" + MovieAndScrollEnum.ContentName.getVal() + "'" + ")]")));

    System.out.println("Current Url is: " + driver.getCurrentUrl());

    new Actions(driver).moveToElement(driver.findElement(By.xpath("//*[contains(text()," + "'" + MovieAndScrollEnum.ContentName.getVal() + "'" + ")]"))).click().perform();

    wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                      By.xpath(
                              "//*[contains(text()," + "'" + MovieAndScrollEnum.MovieName.getVal() + "'" + ")]")));

    Assert.assertEquals("G.I. Joe: Czas Kobry", driver.findElement(By.xpath("//*[contains(text()," + "'" + MovieAndScrollEnum.MovieName.getVal() + "'" + ")]")).getText());

  }

}
