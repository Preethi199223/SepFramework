package com.ots.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Testgrid {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        ChromeOptions opt = new ChromeOptions();

        String huburl = "http://3.87.224.17:4444/wd/hub";

        WebDriver driver = new RemoteWebDriver(new URL(huburl), opt);

        driver.get("https://www.google.com");
        System.out.println("Title is: " + driver.getTitle());

        Thread.sleep(5000);
        driver.quit();
    }
}
