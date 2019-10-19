import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.reporters.jq.BasePanel.C;

public class PierwszyTestSelenium {
    //WebDriver driver;
    ChromeOptions options;
    WebDriver driver  = new ChromeDriver();


    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Tester\\Desktop\\selenium\\chromedriver.exe");
        options= new ChromeOptions();
        options.addArguments("start-maximized");
    }
    // @Test
    // public void otwarciePrzegladarki(){

    //     driver.get("http:\\google.pl");
    // }

    // @AfterMethod
    // public void tearDown(){
    //     driver.close();
    // }

    @Test
    public void wyszukajLublin(){
        driver.get("http:\\google.pl");
        driver.findElement(By.cssSelector("[name='q']")).sendKeys("Lublin");
        driver.findElement(By.cssSelector("[name='q']")).sendKeys(Keys.RETURN);

        boolean nieZnaleziono = true;
       while (nieZnaleziono){
            if(driver.findElement(By.cssSelector("href='http://pl/wikipedia.org/wiki/Lublin")).isDisplayed()){
                nieZnaleziono = false;}
            else{
                try {
                    Thread.sleep(1000);

                }  catch(InterruptedException e)
                { e.printStackTrace();      }
        }
       }

        driver.findElement(By.cssSelector("[href='http://pl/wikipedia.org/wiki/Lublin'):first-child"));
            Assert.assertEquals(driver.findElement(By.cssSelector(".firstHeading")).getText(),"Lublin(edytuj)");

            //System.out.println(driver.findElement(By.cssSelector(".firstHeading")).getText());



}}

