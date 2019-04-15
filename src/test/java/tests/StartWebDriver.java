package tests;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class StartWebDriver {

    @Test
    public void startWebDriver() throws ATUTestRecorderException {

        WebDriver driver = new ChromeDriver();

        ATUTestRecorder recorder = new ATUTestRecorder("/home/arkadiusz/Pulpit/zadania/SeleniumTest/testsRecord","WebDriverTest",false);

        recorder.start();

        driver.navigate().to("http://iplatest.azurewebsites.net");

        Assert.assertTrue("Title should start",driver.getTitle().startsWith("IPLA"));

        driver.close();

        recorder.stop();
    }
}
