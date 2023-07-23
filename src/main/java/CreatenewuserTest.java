// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class CreatenewuserTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void createnewuser() throws InterruptedException {
    driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
    driver.manage().window().setSize(new Dimension(1920, 1051));
    driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();
    driver.findElement(By.id("signupName")).sendKeys("Kate");
    driver.findElement(By.id("signupLastName")).sendKeys("Alimova");
    driver.findElement(By.id("signupEmail")).sendKeys("kate.alimova@gmail.com");
    driver.findElement(By.id("signupPassword")).sendKeys("5bdyE2oLDD2gYcZ");
    driver.findElement(By.id("signupRepeatPassword")).sendKeys("5bdyE2oLDD2gYcZ");
    driver.findElement(By.cssSelector(".modal-content button.btn-primary")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("nav > div.sidebar_btn-group > a:nth-child(1)")).click();
    Thread.sleep(1000);
    assertEquals(driver.findElement(By.cssSelector(".profile_name")).getText(), "Kate Alimova");
    driver.findElement(By.cssSelector("nav > div.sidebar_btn-group > a:nth-child(2)")).click();
    driver.findElement(By.cssSelector("div.-remove-account button.btn-danger-bg")).click();
    driver.findElement(By.cssSelector("app-remove-account-modal button.btn-danger")).click();
    Thread.sleep(2000);
    assertTrue(driver.findElement(By.cssSelector(".hero-descriptor_btn")).isDisplayed());
  }
}
