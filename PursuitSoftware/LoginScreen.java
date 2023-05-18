package PursuitSoftware;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import resources.reusables.TapByCoordinates;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class LoginScreen extends BaseTest{
    String[] countries={"+91 India","+1 United States of America","+1 Canada"};

    @Test
    public void LoginScreenTestIndia(){


        WebElement ele=driver.findElement(By.xpath("//android.widget.EditText[@index='3']"));
        TapByCoordinates coordinates=new TapByCoordinates(driver);
        coordinates.tapElementAt(ele,0.5,0.5);
        ele.sendKeys("7980166363");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='+1']")).click();

        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc="+countries[0]+"]")).click();

        driver.findElement(By.xpath("//android.view.View[@content-desc='Login']")).click();

    }

    @Test
    public void ContinueAsGuest(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//android.view.View[@content-desc='Continue as Guest']")).click();


        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test
    public void ContinueWithEmail() throws InterruptedException{
        driver.findElement(By.xpath("//android.view.View[@content-desc='Sign In with email']")).click();
        Thread.sleep(10000);
    }
    @Test
    public void ContinueWithGoogle() throws InterruptedException {
        driver.findElement(By.xpath("//android.view.View[@content-desc='or Continue with']/android.widget.ImageView[1]"))
                .click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.attributeContains(driver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']")), "index", "0"));
        driver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']")).click();
        Thread.sleep(5000);
    }
    @Test
    public void ShowInfoButton() throws  InterruptedException{
        driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@content-desc='OK']")).click();
        Thread.sleep(2000);
    }

}
