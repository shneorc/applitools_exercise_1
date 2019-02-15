import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;


public class UntitledTestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("http://newtours.demoaut.com/");
    driver.findElement(By.linkText("REGISTER")).click();
    driver.findElement(By.name("firstName")).click();
    driver.findElement(By.name("firstName")).clear();
    driver.findElement(By.name("firstName")).sendKeys("Shneor");
    driver.findElement(By.name("lastName")).clear();
    driver.findElement(By.name("lastName")).sendKeys("Cheshin");
    driver.findElement(By.name("phone")).clear();
    driver.findElement(By.name("phone")).sendKeys("490200601");
    driver.findElement(By.name("address1")).clear();
    driver.findElement(By.name("address1")).sendKeys("32");
    driver.findElement(By.name("address2")).clear();
    driver.findElement(By.name("address2")).sendKeys("Seagrass Avenue");
    driver.findElement(By.name("city")).clear();
    driver.findElement(By.name("city")).sendKeys("VINCENTIA");
    driver.findElement(By.name("state")).clear();
    driver.findElement(By.name("state")).sendKeys("NSW");
    driver.findElement(By.name("postalCode")).clear();
    driver.findElement(By.name("postalCode")).sendKeys("2540");
    new Select(driver.findElement(By.name("country"))).selectByVisibleText("AUSTRALIA");
    driver.findElement(By.id("userName")).click();
    driver.findElement(By.id("userName")).clear();
    driver.findElement(By.id("userName")).sendKeys("shneor.spam@gmail.com");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("1234");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("shneor.spam@gmail.com");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("confirmPassword")).click();
    driver.findElement(By.name("confirmPassword")).clear();
    driver.findElement(By.name("confirmPassword")).sendKeys("1234");
    driver.findElement(By.name("register")).click();
	//wait for last page to completly load
    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    
  }
  
  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
