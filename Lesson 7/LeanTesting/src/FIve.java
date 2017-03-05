import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FIve{
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	String driverPath = "D:\\Учеба\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",driverPath);
	driver = new ChromeDriver();
    baseUrl = "https://leantesting.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

    @Test
  public void test2() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.id("UserForm_username")).clear();
    driver.findElement(By.id("UserForm_username")).sendKeys("ogkravchuk");
    driver.findElement(By.id("UserForm_password")).clear();
    driver.findElement(By.id("UserForm_password")).sendKeys("Lbyfvjrbtd1927");
    driver.findElement(By.xpath("//*[@type='submit']")).click();
    driver.findElement(By.id("Project_name")).sendKeys("Leantesting");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.id("Version_version_number")).sendKeys("New");
    driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
    driver.findElement(By.id("ProjectSection_name")).sendKeys("Automate");
    driver.findElement(By.xpath("//*[@data-dismiss='modal']")).click();
    driver.findElement(By.linkText("Finish")).click();
    driver.findElement(By.cssSelector("div.sprite-sidebar.sprite-sidebar-bug")).click();
    driver.findElement(By.cssSelector("button.btn-report-empty")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ReportBugFormModal_title")).sendKeys("Not send email.");
    new Select(driver.findElement(By.id("ReportBugFormModal_assigned_to_id"))).selectByVisibleText("Oleksii Kravchuk");
    new Select(driver.findElement(By.id("ReportBugFormModal_severity"))).selectByVisibleText("Critical");
    new Select(driver.findElement(By.id("ReportBugFormModal_bug_types_id"))).selectByVisibleText("Functional");
    new Select(driver.findElement(By.id("ReportBugFormModal_reproducibility"))).selectByVisibleText("Always");
    driver.findElement(By.id("ReportBugFormModal_description")).clear();
    driver.findElement(By.id("ReportBugFormModal_description")).sendKeys("Not send email for registration.");
    driver.findElement(By.id("ReportBugFormModal_expected_results")).clear();
    driver.findElement(By.id("ReportBugFormModal_expected_results")).sendKeys("ER:email send.\nAR:email not send.");
    driver.findElement(By.id("bug_steps")).clear();
    driver.findElement(By.id("bug_steps")).sendKeys("go to leantesting");
    driver.findElement(By.id("bug_steps")).clear();
    driver.findElement(By.id("bug_steps")).sendKeys("try to registration.");
    driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
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