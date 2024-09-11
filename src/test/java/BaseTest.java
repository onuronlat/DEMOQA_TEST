import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseTest {

    protected static WebDriver driver;

    @BeforeAll
    public static void setUpDriver(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        System.out.println("test başladı.");
    }

//    @AfterAll
//    public static void finishedTest(){
//       driver.quit();
//        System.out.println("test bitti.");
//    }

}
