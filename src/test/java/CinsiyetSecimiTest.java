import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CinsiyetSecimiTest extends BaseTest {
    WebDriver driver=BaseTest.driver;

    @Test
    public void testGenderRadioButton() {

        // Radio button'un kendisini seçtik
        WebElement maleRadioButton = driver.findElement(By.id("gender-radio-1"));
        // "Male" radio button'u seçtik
        WebElement maleLabel= driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
        maleLabel.click();

        // Doğru seçildiğini doğrula
        Assertions.assertTrue(maleRadioButton.isSelected(), "Male radio button should be selected.");

        // Diğer radio button'ların seçilmediğini doğrula
        WebElement femaleRadioButton = driver.findElement(By.cssSelector("label[for='gender-radio-2']"));
        WebElement otherRadioButton = driver.findElement(By.cssSelector("label[for='gender-radio-3']"));

        Assertions.assertFalse(femaleRadioButton.isSelected(), "Female radio button should not be selected.");
        Assertions.assertFalse(otherRadioButton.isSelected(), "Other radio button should not be selected.");


    }
}
