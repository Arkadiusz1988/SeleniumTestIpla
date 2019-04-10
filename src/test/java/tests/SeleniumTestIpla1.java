package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTestIpla1 {

    @Test
    public void startWebDriver(){

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://iplatest.azurewebsites.net");

        Assert.assertTrue("Title should start",driver.getTitle().startsWith("IPLA"));

        //System.out.println(System.currentTimeMillis());

        driver.close();
    }
}
