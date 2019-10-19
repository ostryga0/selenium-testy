import org.testng.Assert;
import org.testng.annotations.*;

public class KlasaTestowa {

    String imie="Michał";

    @BeforeClass
    public  void setUp(){
        imie="Balbina";
    }
    @Test
    public void PierwszyTest (){
        System.out.println("to jest mój pierwszy test");
        Assert.assertEquals(1,1);
    }
    @Test
    public void CzyImieToBalbina(){
        Assert.assertEquals("Balbina","Balbina");
    }

    @AfterMethod
        public void tearDown(){
            Assert.assertEquals(imie,"Balbina1");
        }

    }



