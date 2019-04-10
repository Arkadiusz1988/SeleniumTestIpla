package tests;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import enums.LiveAndContentEnum;
import enums.SportAndPlayerContent;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class SeleniumTests {


    @Test
    public void startWebDriver(){

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://iplatest.azurewebsites.net");

        Assert.assertTrue("Title should start",driver.getTitle().startsWith("IPLA"));

        System.out.println(System.currentTimeMillis());

        driver.close();
    }

    @Test
    public void checkLiveAndContent(){

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

        WebElement element3 = driver.findElement(By.xpath("//*[contains(text(),"+"'"+LiveAndContentEnum.CanalName.getVal()+"'"+")]"));

        element3.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),"+"'"+LiveAndContentEnum.Today.getVal()+"'"+")]")));

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        Assert.assertEquals("http://iplatest.azurewebsites.net/channels-live",driver.getCurrentUrl());

         Assert.assertEquals(
        LiveAndContentEnum.Today.getVal(),
        driver.findElement(By.xpath("//*[contains(text(),"+"'"+LiveAndContentEnum.Today.getVal()+"'"+")]")).getText());

        WebElement element4 =
        driver.findElement(
            By.xpath("//*[contains(text(),"+"'"+LiveAndContentEnum.Content.getVal()+"'"+")]"));

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

  @Test
  public void checkLogin() {

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
    element5.sendKeys("arek@arek.com");

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

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#container > div > div.mainbox > span > span > div > div > img")));

    Assert.assertEquals("http://iplatest.azurewebsites.net/ipla", driver.getCurrentUrl());

  }

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

    @Test
    public void checkSportAndPlayerContent() throws ATUTestRecorderException, InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://iplatest.azurewebsites.net");

       // driver.manage().window().maximize();

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

        WebElement element3 = driver.findElement(By.xpath("//*[contains(text(),"+"'"+SportAndPlayerContent.CanalName.getVal()+"'"+")]"));

        element3.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),"+"'"+SportAndPlayerContent.ContentName.getVal()+"'"+")]")));

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        WebElement element4 =
                driver.findElement(
                        By.xpath("//*[contains(text(),"+"'"+SportAndPlayerContent.ContentName.getVal()+"'"+")]"));

        WebElement parent = element4.findElement(By.xpath("./.."));
        WebElement parent1 = parent.findElement(By.xpath("../.."));
        WebElement parent2 = parent1.findElement(By.xpath("../.."));

        wait.until(ExpectedConditions.elementToBeClickable(parent2));

        parent2.click();

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),"+"'"+SportAndPlayerContent.ContentSecondName.getVal()+"'"+")]")));

        WebElement element5 =
                driver.findElement(
                        By.xpath("//*[contains(text(),"+"'"+SportAndPlayerContent.ContentSecondName.getVal()+"'"+")]"));

        element5.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),"+"'"+SportAndPlayerContent.WatchLater.getVal()+"'"+")]")));

        WebElement element6 = driver.findElement(By.xpath("//*[contains(text(),"+"'"+SportAndPlayerContent.WatchLater.getVal()+"'"+")]"));

        element6.click();


        ATUTestRecorder recorder = new ATUTestRecorder("/home/arkadiusz/Pulpit/zadania/SeleniumTest","Test",false);

        recorder.start();

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        TimeUnit.SECONDS.sleep(15);

        recorder.stop();

    }


}
