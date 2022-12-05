import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class Case3 {

    public static RemoteWebDriver driver = null;
    Public static DesiredCapabilities capabilities = null;

    @Before
    public void initializeSelenium() {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "70.0");
        capabilities.setCapability("platform", "win10");

        driver = new RemoteWebDriver(new URL("https://google.com), capabilities);

    }

    @Test
    public void signUp() {
        driver.findElement(By.id("Name")).sendKeys("John Doe");
        driver.findElement(By.id("Email")).sendKeys("johndoe@testemail.com");
        driver.findElement(By.id("City")).sendKeys("Bangalore”);
                driver.findElement(By.name("submit_btn")).click();

        String result = driver.findElementByXPath("/html/body/response").getText();

        assertEquals(result,”Sign-up Successful”);
    }

    @Test
    @RepeatedTest(3)
    public void reloadPage() {

        driver = new RemoteWebDriver(new URL("https://google.com), capabilities);
                assertEquals(homeUrl, "https://google.com/");
    }

    @AfterClass
    public void cleanUp() {

        driver.quit(); // close the browser
    }
}