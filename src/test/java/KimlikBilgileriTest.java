import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KimlikBilgileriTest extends BaseTest {

    PratikTestPage pratiktest=new PratikTestPage(driver);

    @Test
    public void setName(){
        pratiktest.setName("Onur");
        Assertions.assertEquals("Onur",pratiktest.getName(),"Hatalı name girişi..!");
    }

    @Test
    public void setLastName(){
        pratiktest.setLastname("Onlat");
        Assertions.assertEquals("Onlat",pratiktest.getLastName(),"Hatalı Last Name Girişi...");
    }

    @Test
    public void setEmail(){
        pratiktest.setEmail("bonlat96@hotmail.com");
        Assertions.assertEquals("bonlat96@hotmail.com",pratiktest.getEmail(),"Hatalı E-mail Girişi...");
    }
}
