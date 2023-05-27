import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Selenium {
    public static void main(String[] args) throws InterruptedException {
//      System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver_113.exe");
//      WebDriver browser = new ChromeDriver();
//      browser.manage().window().maximize();
//
//      Selenium demo test sajta https://www.saucedemo.com/
//
//      browser.get("https://www.saucedemo.com/");
//      browser.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
//      browser.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
//      browser.findElement(By.cssSelector("#login-button")).click();
//
//      browser.findElement(By.cssSelector(".inventory_list>div:nth-child(2) button")).click();
//      Thread.sleep(2000);
//      browser.quit();

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver_113.exe");
        WebDriver browser = new ChromeDriver();
        //Smanjujemo dimenziju browser-a kako bi mogli da izazovemo problem sa dugmetom okje se nevidi
        Dimension dimension = new Dimension(800,600);
        browser.manage().window().setSize(dimension);

//      Ovde se koristi klasa Actions koja nam omogućava da manipulišemo stranicom i da izvodimo hover
//      i scroll ili kliktanje na dugmiće gore i dole. scrollByAmount prima dva parametra:
//      pomeranje po x osi (levo je minus broj a desno plus broj) i po y osi
//      (gore je minus broj a dole plus broj).

//      browser.get("https://www.google.com/");
//      browser.findElement(By.cssSelector("[name='q']")).sendKeys("Torte");
//      Actions actions = new Actions(browser);
//      actions.scrollByAmount(0,50).perform();
//      browser.findElement(By.cssSelector("[name='btnK']")).click();


//      Korišćenjem slanja dugmeta enter zaobilazimo problem sa scroll-om
        browser.get("https://www.google.com/");
        browser.findElement(By.cssSelector("[name='q']")).sendKeys("Torte");
        browser.findElement(By.cssSelector("[name='btnK']")).sendKeys(Keys.ENTER);

        browser.quit();




    }
}
