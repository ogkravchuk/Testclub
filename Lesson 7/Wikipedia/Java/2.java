package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class 2 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.wikipedia.org/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test2() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("#js-link-box-uk > strong")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("#js-link-box-ru > strong")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("#js-link-box-en > strong")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("#js-link-box-ja > strong")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("#js-link-box-de > strong")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("#js-link-box-es > strong")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("#js-link-box-fr > strong")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("#js-link-box-it > strong")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("#js-link-box-fr > strong")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("#js-link-box-pt > strong")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("#js-link-box-zh > strong")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
