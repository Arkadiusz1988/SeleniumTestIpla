package tests;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import enums.SideBarEnum;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SideBar {

  @Test
  public void checkSideBar() throws ATUTestRecorderException {

    WebDriver driver = new ChromeDriver();

    ATUTestRecorder recorder = new ATUTestRecorder("/home/arkadiusz/Pulpit/zadania/SeleniumTest/testsRecord","SideBarTest",false);

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

    WebElement element3 =
        driver.findElement(
            By.xpath(
                "//*[contains(text()," + "'" + SideBarEnum.CanalName1.getVal() + "'" + ")]"));
    element3.click();
    System.out.println("Current Url is: " + driver.getCurrentUrl());

    WebElement element4 =
              driver.findElement(
                      By.xpath(
                              "//*[contains(text()," + "'" + SideBarEnum.CanalName2.getVal() + "'" + ")]"));
    element4.click();
    System.out.println("Current Url is: " + driver.getCurrentUrl());

    WebElement element5 =
              driver.findElement(
                      By.xpath(
                              "//*[contains(text()," + "'" + SideBarEnum.CanalName3.getVal() + "'" + ")]"));
    element5.click();
    System.out.println("Current Url is: " + driver.getCurrentUrl());

    WebElement element6 =
              driver.findElement(
                      By.xpath(
                              "//*[contains(text()," + "'" + SideBarEnum.CanalName4.getVal() + "'" + ")]"));
    element6.click();
    System.out.println("Current Url is: " + driver.getCurrentUrl());

    WebElement element7 =
              driver.findElement(
                      By.xpath(
                              "//*[contains(text()," + "'" + SideBarEnum.CanalName5.getVal() + "'" + ")]"));
    element7.click();
    System.out.println("Current Url is: " + driver.getCurrentUrl());

    WebElement element8 =
              driver.findElement(
                      By.xpath(
                              "//*[contains(text()," + "'" + SideBarEnum.CanalName6.getVal() + "'" + ")]"));
    element8.click();
    System.out.println("Current Url is: " + driver.getCurrentUrl());

    WebElement element9 =
              driver.findElement(
                      By.xpath(
                              "//*[contains(text()," + "'" + SideBarEnum.CanalName7.getVal() + "'" + ")]"));
    element9.click();
    System.out.println("Current Url is: " + driver.getCurrentUrl());

    WebElement element10 =
              driver.findElement(
                      By.xpath(
                              "//*[contains(text()," + "'" + SideBarEnum.CanalName8.getVal() + "'" + ")]"));
    element10.click();
    System.out.println("Current Url is: " + driver.getCurrentUrl());

    WebElement element11 =
              driver.findElement(
                      By.xpath(
                              "//*[contains(text()," + "'" + SideBarEnum.CanalName9.getVal() + "'" + ")]"));
    element11.click();
    System.out.println("Current Url is: " + driver.getCurrentUrl());

    WebElement element12 =
              driver.findElement(
                      By.xpath(
                              "//*[contains(text()," + "'" + SideBarEnum.CanalName10.getVal() + "'" + ")]"));
    element12.click();
    System.out.println("Current Url is: " + driver.getCurrentUrl());

    WebElement element13 =
              driver.findElement(
                      By.xpath(
                              "//*[contains(text()," + "'" + SideBarEnum.CanalName11.getVal() + "'" + ")]"));
    element13.click();
    System.out.println("Current Url is: " + driver.getCurrentUrl());

    WebElement element14 =
              driver.findElement(
                      By.xpath(
                              "//*[contains(text()," + "'" + SideBarEnum.CanalName12.getVal() + "'" + ")]"));
    element14.click();
    System.out.println("Current Url is: " + driver.getCurrentUrl());

    driver.close();

    recorder.stop();

  }
}
