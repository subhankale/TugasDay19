package com.juaracoding.appium;

import com.juaracoding.appium.pages.Calculator2;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertEquals;

public class TestCalculator2 {
    private static AndroidDriver<MobileElement> driver;
    private Calculator2 calculator2;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel_3a_API_30");
        capabilities.setCapability("uuid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        calculator2 = new Calculator2(driver);
    }

    @Test
    public void testAdd() {
        calculator2.calcAdd();
        System.out.println("Hasil = "+calculator2.getTxtResult());
        assertEquals(calculator2.getTxtResult(), "12");
    }

    @AfterClass
    public void closeApp() {
        driver.quit();
    }
}
