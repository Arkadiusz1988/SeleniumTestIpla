package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.lang3.time.StopWatch;


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

        StopWatch pageLoad = new StopWatch();

        pageLoad.start();

        driver.navigate().to("http://iplatest.azurewebsites.net");

        WebDriverWait wait = new WebDriverWait(driver, 10); //seconds

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("MainRulebook__buttons-container")));

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        WebElement element = driver.findElement(By.cssSelector("#container > div > div.mainbox > span > div > div.MainRulebook__buttons-container > span:nth-child(3) > button"));

        element.click();

        // Check the url of the page
        System.out.println("Current Url is: " + driver.getCurrentUrl());

        long pageLoadTime_ms1 = pageLoad.getTime();
        long pageLoadTime_Seconds1 = pageLoadTime_ms1 / 1000;
        System.out.println("Total Page Load Time: " + pageLoadTime_ms1 + " milliseconds");
        System.out.println("Total Page Load Time: " + pageLoadTime_Seconds1 + " seconds");

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

        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'DZISIAJ 8 kwietnia')]")));

        System.out.println("Current Url is: " + driver.getCurrentUrl());

        Assert.assertEquals("http://iplatest.azurewebsites.net/channels-live",driver.getCurrentUrl());

        Assert.assertEquals("DZISIAJ 8 kwietnia", driver.findElement(By.xpath("//*[contains(text(),'DZISIAJ 8 kwietnia')]"))
            .getText());

        WebElement element4 =
        driver.findElement(
            By.xpath("//*[contains(text(),'Liga czeska / AC Sparta Praga - FC Fastav Zlin')]"));

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

        pageLoad.stop();
        long pageLoadTime_ms = pageLoad.getTime();
        long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
        System.out.println("Total Page Load Time: " + pageLoadTime_ms + " milliseconds");
        System.out.println("Total Page Load Time: " + pageLoadTime_Seconds + " seconds");

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

    // Check the url of the page
    System.out.println("Current Url is: " + driver.getCurrentUrl());

    WebElement element1 =
        driver.findElement(
            By.cssSelector(
                "#container > div > div.mainbox > span > div > div:nth-child(15) > div > span:nth-child(2) > button"));

    element1.click();

    System.out.println("Current Url is: " + driver.getCurrentUrl());

    WebDriverWait wait1 = new WebDriverWait(driver, 10); // seconds

    wait1.until(
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

    WebDriverWait wait2 = new WebDriverWait(driver, 10); // seconds

    wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Logowanie IPLA')]")));

    Assert.assertEquals("Logowanie IPLA", driver.findElement(By.xpath("//*[contains(text(),'Logowanie IPLA')]"))
            .getText());

    Assert.assertEquals("Logowanie Plus", driver.findElement(By.xpath("//*[contains(text(),'Logowanie Plus')]"))
            .getText());

    Assert.assertEquals("Logowanie Cyfrowy Polsat", driver.findElement(By.xpath("//*[contains(text(),'Logowanie Cyfrowy Polsat')]"))
            .getText());

    Assert.assertEquals("Logowanie Facebook", driver.findElement(By.xpath("//*[contains(text(),'Logowanie Facebook')]"))
            .getText());

//    Assert.assertEquals("Zarejestruj się", driver.findElement(By.xpath("//*[contains(text(),'Zarejestruj się')]"))
//            .getText());

//    Assert.assertEquals("Anuluj", driver.findElement(By.xpath("//*[contains(text(),'Anuluj')]"))
//            .getText());

    WebElement element4 = driver.findElement(By.xpath("//*[contains(text(),'Logowanie IPLA')]"));

    element4.click();

    wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#container > div > div.mainbox > span > div > div.Login--flex > form > fieldset > span")));

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

    wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#container > div > div.mainbox > span > span > div > div > img")));

    Assert.assertEquals("http://iplatest.azurewebsites.net/ipla", driver.getCurrentUrl());

  }
}
