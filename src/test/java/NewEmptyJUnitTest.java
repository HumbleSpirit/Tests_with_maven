/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 *
 * @author sergey
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    private WebDriver driver;
    private WebDriver wait;
    
    @Before
    public void setUp() {
        driver = new ChromeDriver();
    
    }
    
    @Test
    public void MyFirstTest () throws InterruptedException {
        driver.get("http://bash.im");
        driver.findElement(By.id("text")).sendKeys("185");
        driver.findElement(By.xpath("//*[@id=\"search\"]/button")).click();
        
    }
    
    @After
    public void tearDown() {
         driver.quit();
        driver = null;
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
