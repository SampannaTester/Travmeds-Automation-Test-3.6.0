package PursuitSoftware;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class EmailSignup extends BaseTest{

    @Test
    public void EmailFieldTestOne() throws InterruptedException{
        driver.findElement(By.xpath("//android.view.View[@content-desc='Sign In with email']")).click();
        //Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@index='4']")).click();

        WebElement email=driver.findElement(By.xpath("//android.widget.EditText[@index='3']"));
        email.click();
        email.sendKeys("chatterjeesam0029@gmail.com");
        driver.hideKeyboard();


        WebElement password=driver.findElement(By.xpath("//android.widget.EditText[@index='5']"));
        password.click();
        password.sendKeys("123456");
        driver.hideKeyboard();

        WebElement confirmPassword=driver.findElement(By.xpath("//android.widget.EditText[@index='7']"));
        confirmPassword.click();
        confirmPassword.sendKeys("123456");
        driver.hideKeyboard();

        driver.findElement(AppiumBy.accessibilityId("Continue")).click();
        Thread.sleep(4000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.attributeContains(driver.findElement(By.xpath("//android.view.View[@content-desc='The email address is already in use by\n" +
                "another account.']")),"content-desc","The email address is already in use by\n" +
                "another account."));
        WebElement ele=driver.findElement(By.xpath("//android.view.View[@content-desc='The email address is already in use by\n" +
                        "another account.']"));
        //System.out.println(ele.getAttribute("content-desc"));
        Assert.assertEquals(ele.getAttribute("content-desc"),"The email address is already in use by\n" +
                "another account.");
        Thread.sleep(5000);

    }

    @Test
    public void EmailFieldTestTwo() throws InterruptedException{
        driver.findElement(By.xpath("//android.view.View[@content-desc='Sign In with email']")).click();
        //Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@index='4']")).click();

        WebElement email=driver.findElement(By.xpath("//android.widget.EditText[@index='3']"));
        email.click();
        email.sendKeys("@chatterjeesam0029gmail.com");
        driver.hideKeyboard();


        WebElement password=driver.findElement(By.xpath("//android.widget.EditText[@index='5']"));
        password.click();
        password.sendKeys("123456");
        driver.hideKeyboard();

        WebElement confirmPassword=driver.findElement(By.xpath("//android.widget.EditText[@index='7']"));
        confirmPassword.click();
        confirmPassword.sendKeys("123456");
        driver.hideKeyboard();

        driver.findElement(AppiumBy.accessibilityId("Continue")).click();
        Thread.sleep(4000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.attributeContains(driver.findElement(By.xpath("//android.view.View[@content-desc='The email address is badly formatted.']")),"content-desc","The email address is badly formatted."));
        WebElement ele=driver.findElement(By.xpath("//android.view.View[@content-desc='The email address is badly formatted.']"));
        //System.out.println(ele.getAttribute("content-desc"));
        Assert.assertEquals(ele.getAttribute("content-desc"),"The email address is badly formatted.");
        Thread.sleep(5000);

    }

    @Test
    public void PasswordFieldTestOne() throws InterruptedException{
        driver.findElement(By.xpath("//android.view.View[@content-desc='Sign In with email']")).click();
        //Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@index='4']")).click();

        WebElement email=driver.findElement(By.xpath("//android.widget.EditText[@index='3']"));
        email.click();
        email.sendKeys("chatterjeesam0025@gmail.com");
        driver.hideKeyboard();


        WebElement password=driver.findElement(By.xpath("//android.widget.EditText[@index='5']"));
        password.click();
        password.sendKeys("12345");
        driver.hideKeyboard();

        WebElement confirmPassword=driver.findElement(By.xpath("//android.widget.EditText[@index='7']"));
        confirmPassword.click();
        confirmPassword.sendKeys("12345");
        driver.hideKeyboard();

        driver.findElement(AppiumBy.accessibilityId("Continue")).click();
        Thread.sleep(4000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.attributeContains(driver.findElement(By.xpath("//android.view.View[@content-desc='Password should be at least 6\n" +
                "characters']")),"content-desc","Password should be at least 6\n" +
                "characters"));
        WebElement ele=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Password should be at least 6\n" +
                "characters\"]"));
        //System.out.println(ele.getAttribute("content-desc"));
        Assert.assertEquals(ele.getAttribute("content-desc"),"Password should be at least 6\n" +
                "characters");
        Thread.sleep(5000);

    }

    @Test
    public void PasswordFieldTestTwo() throws InterruptedException{
        driver.findElement(By.xpath("//android.view.View[@content-desc='Sign In with email']")).click();
        //Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@index='4']")).click();

        WebElement email=driver.findElement(By.xpath("//android.widget.EditText[@index='3']"));
        email.click();
        email.sendKeys("chatterjeesam0025@gmail.com");
        driver.hideKeyboard();


        WebElement password=driver.findElement(By.xpath("//android.widget.EditText[@index='5']"));
        password.click();
        password.sendKeys("123456");
        driver.hideKeyboard();

        WebElement confirmPassword=driver.findElement(By.xpath("//android.widget.EditText[@index='7']"));
        confirmPassword.click();
        confirmPassword.sendKeys("654321");
        driver.hideKeyboard();

        driver.findElement(AppiumBy.accessibilityId("Continue")).click();
        Thread.sleep(4000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.attributeContains(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Password doesn't match\"]")),"content-desc","Password doesn't match"));
        WebElement ele=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Password doesn't match\"]"));
        //System.out.println(ele.getAttribute("content-desc"));
        Assert.assertEquals(ele.getAttribute("content-desc"),"Password doesn't match");
        Thread.sleep(5000);

    }

    @Test
    public void GoogleLoginButtonTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//android.view.View[@content-desc='Sign In with email']")).click();
        //Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@index='4']")).click();

        driver.findElement(By.xpath("//android.widget.ImageView[@index='10']")).click();

        driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.google.android.gms:id/container']")).click();

        Thread.sleep(10000);
    }

}
