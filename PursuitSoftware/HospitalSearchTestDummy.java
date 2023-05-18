package PursuitSoftware;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class HospitalSearchTestDummy extends BaseTest{

    @Test
    public void HospitalSearchSectionTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.findElement(By.xpath("//android.view.View[@content-desc='Continue as Guest']")).click();


        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(AppiumBy.accessibilityId("Hospitals\n" +
                "Near You")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.attributeContains(driver.findElement(AppiumBy.className("android.widget.EditText")),"text","Search"));

        WebElement ele=driver.findElement(By.xpath("//android.widget.EditText[@text='Search']"));
        ele.click();
        ele.sendKeys("Kolkata");
        driver.hideKeyboard();
        Thread.sleep(20000);
        driver.findElement(By.xpath("//android.view.View[@index='2']/android.view.View[@index='3' and @clickable='true']")).click();
        System.out.println(1);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));


    }


}
