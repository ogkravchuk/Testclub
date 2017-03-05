package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class 1 {
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
  public void test1() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("span.other-project-tagline.jsl10n")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//body[@id='www-wikipedia-org']/div[6]/div[3]/div[4]/a/div[2]/span[2]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//body[@id='www-wikipedia-org']/div[6]/div[3]/div[7]/a/div[2]/span")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//body[@id='www-wikipedia-org']/div[6]/div[3]/div[10]/a/div[2]/span")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//body[@id='www-wikipedia-org']/div[6]/div[3]/div[2]/a/div[2]/span[2]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//body[@id='www-wikipedia-org']/div[6]/div[3]/div[5]/a/div[2]/span")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//body[@id='www-wikipedia-org']/div[6]/div[3]/div[8]/a/div[2]/span")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//body[@id='www-wikipedia-org']/div[6]/div[3]/div[11]/a/div[2]/span")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//body[@id='www-wikipedia-org']/div[6]/div[3]/div[3]/a/div[2]/span[2]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//body[@id='www-wikipedia-org']/div[6]/div[3]/div[6]/a/div[2]/span[2]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//body[@id='www-wikipedia-org']/div[6]/div[3]/div[9]/a/div[2]/span")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//body[@id='www-wikipedia-org']/div[6]/div[3]/div[12]/a/div[2]/span")).click();
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
