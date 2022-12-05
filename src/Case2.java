import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Case2{
    private static ChromeDriver driver;
    WebElement element;

    @BeforeClass
    public static void openBrowser(){
        driver = new ChromeDriver(); //Initialising the browser driver
    }

    @Test
    public void validUserCredentials(){ //To test successful login

        System.out.println("This is the test code " + new Object(){}.getClass().getEnclosingMethod().getName());
        driver.get("https://start-time.kz");
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
        driver.findElement(By.id("exampleInputEmail1")).sendKeys("dilmurat.user@gmail.com"); //Sending ID
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("dilmurat123"); // Sending PWD
        driver.findElement(By.find_element_by_xpath("button[@type='submit']")).click();
        try{
            element = driver.findElement (By.className(".mat-focus-indicator.mat-menu-item.ng-tns-c73-6"));
        }catch (Exception e){
        }
        Assert.assertNotNull(element); //Checking the element presence
        System.out.println("Test End " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Test
    public void WrongUserCredentials()
    {
        System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
        driver.get("https://start-time.kz");
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
        driver.findElement(By.id("exampleInputEmail1")).sendKeys("dilmurat.user@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("dilmurat123"); //Entering wrong pwd
        driver.findElement(By.find_element_by_xpath("button[@type='submit']")).click(););
        try{
            element = driver.findElement (By.className(".mat-focus-indicator.mat-menu-item.ng-tns-c73-6"));
        }catch (Exception e){
        }
        Assert.assertNotNull(element);
        System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit(); //Closing the driver once the tests are executed
    }
}