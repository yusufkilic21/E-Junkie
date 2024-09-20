package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static JavascriptExecutor js;
    //bunun sartı extends olması ve basta yer alması

    static //tearstart
    {
        driver=new ChromeDriver();

        wait =new WebDriverWait(driver, Duration.ofSeconds(20));
        js=(JavascriptExecutor)driver;
    }

    public static void BaslangıcIslemlerı()
    {
        WebDriver driver=new ChromeDriver();

        //drıver.manage().wındow().maxımıze();//ekranı max yapıyor.
         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); //20 sn muhlet: sayfayı yukeleme muhletı
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //20 sn muhlet : elementı bulma muhletı
    }


    public static void BekleKapat()
    {
        Myfunc.Bekle(3);
        driver.quit();
    }











}
