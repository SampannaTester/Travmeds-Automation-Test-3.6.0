package PursuitSoftware;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignInWithEmail extends BaseTest{

    @Test
    public void SignInWithEmailTestPass() throws InterruptedException{
        driver.findElement(By.xpath("//android.view.View[@content-desc='Sign In with email']")).click();
        //Thread.sleep(10000);

        WebElement email=driver.findElement(By.xpath("//android.widget.EditText[@index='1']"));
        email.click();
        email.sendKeys("chatterjeesam0029@gmail.com");
        driver.hideKeyboard();


        WebElement password=driver.findElement(By.xpath("//android.widget.EditText[@index='2']"));
        password.click();
        password.sendKeys("Login@1234!");
        driver.hideKeyboard();

        driver.findElement(AppiumBy.accessibilityId("Continue")).click();

        Thread.sleep(20000);

    }

    @Test
    public void SignInWithEmailTestFail() throws InterruptedException{
        driver.findElement(By.xpath("//android.view.View[@content-desc='Sign In with email']")).click();
        //Thread.sleep(10000);

        WebElement email=driver.findElement(By.xpath("//android.widget.EditText[@index='1']"));
        email.click();
        email.sendKeys("chatterjeesam0029@gmail.com");
        driver.hideKeyboard();


        WebElement password=driver.findElement(By.xpath("//android.widget.EditText[@index='2']"));
        password.click();
        password.sendKeys("Login@12345!");
        driver.hideKeyboard();

        driver.findElement(AppiumBy.accessibilityId("Continue")).click();
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.attributeContains(driver.findElement(By.xpath("//android.view.View[@index='1']")),"content-desc","The password is invalid or the user\n" +
                "does not have a password."));
        //Not getting how to do the assertion here
        Thread.sleep(10000);

    }

    @Test
    public void EmailRegistrationPage() throws InterruptedException{
        driver.findElement(By.xpath("//android.view.View[@content-desc='Sign In with email']")).click();
        //Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@index='4']")).click();

        WebElement email=driver.findElement(By.xpath("//android.widget.EditText[@index='3']"));
        email.click();
        email.sendKeys("sampanna0028@yahoo.com");
        driver.hideKeyboard();


        WebElement password=driver.findElement(By.xpath("//android.widget.EditText[@index='5']"));
        password.click();
        password.sendKeys("Login@12345!");
        driver.hideKeyboard();

        WebElement confirmPassword=driver.findElement(By.xpath("//android.widget.EditText[@index='7']"));
        confirmPassword.click();
        confirmPassword.sendKeys("Login@12345!");
        driver.hideKeyboard();

        driver.findElement(AppiumBy.accessibilityId("Continue")).click();
        Thread.sleep(5000);

    }


}
