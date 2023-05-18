package PursuitSoftware;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import resources.reusables.TapByCoordinates;

import java.time.Duration;

public class OtpBasedLogin extends BaseTest{

    @Test
    public void OtpBasedLoginTestPass() throws InterruptedException {
        TapByCoordinates coordinates=new TapByCoordinates(driver);
        WebElement ele=driver.findElement(By.xpath("//android.widget.EditText[@index='3']"));

        coordinates.tapElementAt(ele,0.5,0.5);

        ele.sendKeys("7980166363");
        driver.hideKeyboard();

        driver.findElement(By.xpath("//android.view.View[@index='5' and @content-desc='or Continue with']/android.view.View[@index='0' and @content-desc='Login']")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Close tab']")).click();
        Thread.sleep(10000);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        Thread.sleep(6000);
    }

    @Test
    public void OtpTimerTest(){

    }
}
