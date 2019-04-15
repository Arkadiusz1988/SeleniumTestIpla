package tests;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuestMode {

    @Test
    public void checkGuestMode() throws ATUTestRecorderException {

        WebDriver driver = new ChromeDriver();

        ATUTestRecorder recorder = new ATUTestRecorder("/home/arkadiusz/Pulpit/zadania/SeleniumTest/testsRecord","GuestModeTest",false);

        recorder.start();

        driver.navigate().to("http://iplatest.azurewebsites.net/regulations");
        Assert.assertEquals("The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.",driver.findElement(By.xpath("//*[contains(text(),'The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.')]")).getText());

        driver.navigate().to("http://iplatest.azurewebsites.net/rodo");
        Assert.assertEquals("The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.",driver.findElement(By.xpath("//*[contains(text(),'The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.')]")).getText());

        driver.navigate().to("http://iplatest.azurewebsites.net/ipla");
        Assert.assertEquals("The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.",driver.findElement(By.xpath("//*[contains(text(),'The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.')]")).getText());

        driver.navigate().to("http://iplatest.azurewebsites.net/login-menu");
        Assert.assertEquals("The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.",driver.findElement(By.xpath("//*[contains(text(),'The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.')]")).getText());

        driver.navigate().to("http://iplatest.azurewebsites.net/channels-tv");
        Assert.assertEquals("The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.",driver.findElement(By.xpath("//*[contains(text(),'The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.')]")).getText());

        driver.navigate().to("http://iplatest.azurewebsites.net/packets");
        Assert.assertEquals("The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.",driver.findElement(By.xpath("//*[contains(text(),'The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.')]")).getText());

        driver.navigate().to("http://iplatest.azurewebsites.net/vod/119647");
        Assert.assertEquals("The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.",driver.findElement(By.xpath("//*[contains(text(),'The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.')]")).getText());

        driver.navigate().to("http://iplatest.azurewebsites.net/vod/1754");
        Assert.assertEquals("The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.",driver.findElement(By.xpath("//*[contains(text(),'The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.')]")).getText());

        driver.navigate().to("http://iplatest.azurewebsites.net/vod/1757");
        Assert.assertEquals("The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.",driver.findElement(By.xpath("//*[contains(text(),'The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.')]")).getText());

        driver.navigate().to("http://iplatest.azurewebsites.net/vod/5001096");
        Assert.assertEquals("The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.",driver.findElement(By.xpath("//*[contains(text(),'The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.')]")).getText());

        driver.navigate().to("http://iplatest.azurewebsites.net/vod/5002787");
        Assert.assertEquals("The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.",driver.findElement(By.xpath("//*[contains(text(),'The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.')]")).getText());

        driver.navigate().to("http://iplatest.azurewebsites.net/vod/5002788");
        Assert.assertEquals("The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.",driver.findElement(By.xpath("//*[contains(text(),'The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.')]")).getText());

        driver.navigate().to("http://iplatest.azurewebsites.net/vod/5002789");
        Assert.assertEquals("The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.",driver.findElement(By.xpath("//*[contains(text(),'The resource you are looking for has been removed, had its name changed, or is temporarily unavailable.')]")).getText());

        driver.close();

        recorder.stop();
    }


}
