import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PratikTestPage {

    private WebDriver driver;

    public PratikTestPage(WebDriver driver){
        this.driver=driver;
    }

    public void setName(String name){
        WebElement nameSpace= driver.findElement(By.id("firstName"));
        nameSpace.click();
        nameSpace.sendKeys(name);
    }

    public void setLastname(String lastname){
        WebElement lastNameSpace= driver.findElement(By.id("lastName"));
        lastNameSpace.click();
        lastNameSpace.sendKeys(lastname);
    }

    public void setEmail(String email){
        WebElement emailSpace= driver.findElement(By.id("userEmail"));
        emailSpace.click();
        emailSpace.sendKeys(email);
    }

    public String getName(){
        WebElement nameSpace= driver.findElement(By.id("firstName"));
        return nameSpace.getAttribute("value");
    }

    public String getLastName(){
        WebElement nameSpace= driver.findElement(By.id("lastName"));
        return nameSpace.getAttribute("value");
    }
    public String getEmail(){
        WebElement nameSpace= driver.findElement(By.id("userEmail"));
        return nameSpace.getAttribute("value");
    }


}
