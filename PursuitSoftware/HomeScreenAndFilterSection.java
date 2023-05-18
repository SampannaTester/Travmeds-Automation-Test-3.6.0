package PursuitSoftware;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeScreenAndFilterSection extends BaseTest{

    @Test
    public void LocationPermissionTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//android.view.View[@content-desc='Continue as Guest']")).click();
        //Below line of code is clicking the Allow location button in location permission
        //driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        //Thread.sleep(5000)
        String text=driver.findElement(By.id("com.android.permissioncontroller:id/permission_message")).getText();
        String expected="Allow travmeds to access this device’s location?";
        Assert.assertEquals(text,expected);

    }

    @Test
    public void TravmedsLogoTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//android.view.View[@content-desc='Continue as Guest']")).click();
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        Thread.sleep(5000);
        WebElement ele=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='TRAVMEDS']"));
        Assert.assertTrue(ele.isDisplayed());
    }

    @Test
    public void MedicineSearchTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//android.view.View[@content-desc='Continue as Guest']")).click();
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        //Thread.sleep(10000);
        //driver.switchTo().alert().accept();
        WebElement ele=driver.findElement(By.xpath("//android.widget.EditText[@index='1' and @text='Search Here']"));
        ele.click();
        ele.sendKeys(".");
        driver.findElement(By.xpath("//android.view.View[@index='2']")).click();
        Thread.sleep(10000);
    }

    @Test
    public void SearchButtonTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//android.view.View[@content-desc='Continue as Guest']")).click();
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        //Thread.sleep(10000);
        //driver.switchTo().alert().accept();
        WebElement ele=driver.findElement(By.xpath("//android.widget.EditText[@index='1' and @text='Search Here']"));
        ele.click();
        ele.sendKeys("");
        driver.findElement(By.xpath("//android.view.View[@index='2']")).click();
        ele.sendKeys("paracetamol");
        driver.findElement(By.xpath("//android.view.View[@index='2']")).click();
        Thread.sleep(10000);
    }

    @Test
    public void FilterButtonTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//android.view.View[@content-desc='Continue as Guest']")).click();
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        //Thread.sleep(10000);
        //driver.switchTo().alert().accept();
//        WebElement ele=driver.findElement(By.xpath("//android.widget.EditText[@index='1' and @text='Search Here']"));
//        ele.click();
//        ele.sendKeys("");
//        driver.findElement(By.xpath("//android.view.View[@index='2']")).click();
//        ele.sendKeys("paracetamol");
//        driver.findElement(By.xpath("//android.view.View[@index='2']")).click();
        driver.findElement(By.xpath("//android.widget.ImageView[@index='3']")).click();
        Thread.sleep(10000);
    }
    @Test
    public void NavigationMenuTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//android.view.View[@content-desc='Continue as Guest']")).click();
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        driver.findElement(By.xpath("//android.widget.Button[@index='0']")).click();
        Thread.sleep(10000);
    }
    @Test
    public void PharmaciesNearYouTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//android.view.View[@content-desc='Continue as Guest']")).click();
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        driver.findElement(By.xpath("//android.widget.ImageView[@index='5']")).click();
        Thread.sleep(20000);
    }
    @Test
    public void DoctorsNearYouTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//android.view.View[@content-desc='Continue as Guest']")).click();
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        driver.findElement(By.xpath("//android.widget.ImageView[@index='9']")).click();
        driver.findElement(By.xpath("//android.view.View[@content-desc='Filter']")).click();
        Thread.sleep(40000);
    }
    @Test
    public void HospitalsNearYouTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//android.view.View[@content-desc='Continue as Guest']")).click();
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        driver.findElement(By.xpath("//android.widget.ImageView[@index='7']")).click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.attributeContains(driver.findElement(By.xpath("//android.widget.EditText[@index='1']")),"text","Search"));
        WebElement ele=driver.findElement(By.xpath("//android.widget.EditText[@index='1']"));
        ele.click();
        ele.sendKeys("Kolkata");
        driver.findElement(By.xpath("//android.view.View[@index='3']")).click();
        Thread.sleep(20000);

    }
    @Test
    public void BottomNavigationTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//android.view.View[@content-desc='Continue as Guest']")).click();
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();

        driver.findElement(AppiumBy.accessibilityId("Tab 2 of 4")).click();
        //Thread.sleep(4000);
        driver.findElement(AppiumBy.accessibilityId("Tab 3 of 4")).click();
        //Thread.sleep(4000);
        driver.findElement(By.xpath("//android.view.View[@content-desc='Tab 4 of 4' and @index='3']")).click();
        //Thread.sleep(4000);
        driver.findElement(AppiumBy.accessibilityId("Tab 1 of 4")).click();


    }

    @Test
    public void CountryFilterTest() throws InterruptedException {
        //This below line of code will make the driver wait for 20 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//android.view.View[@content-desc='Continue as Guest']")).click();
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        Thread.sleep(15000);
        driver.findElement(By.xpath("//android.widget.ImageView[@index='3']")).click();

        driver.findElement(By.xpath("//android.widget.ImageView[@index='2']")).click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4));
        wait.until(ExpectedConditions.attributeContains(driver.findElement(AppiumBy.accessibilityId("OK")),"content-desc","OK"));
        driver.findElement(AppiumBy.accessibilityId("OK")).click();

        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='India']")).click();

        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Canada']")).click();
        Thread.sleep(5000);
        driver.findElement(AppiumBy.accessibilityId("APPLY")).click();
    }

    @Test
    public void PrescriptionTypeTestOne() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//android.view.View[@content-desc='Continue as Guest']")).click();
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        driver.findElement(By.xpath("//android.widget.ImageView[@index='3']")).click();
        driver.findElement(AppiumBy.accessibilityId("PRESCRIPTION")).click();
        driver.findElement(AppiumBy.accessibilityId("Required")).click();
        driver.findElement(AppiumBy.accessibilityId("Not Required")).click();
        driver.findElement(AppiumBy.accessibilityId("OK")).click();
        driver.findElement(AppiumBy.accessibilityId("Not Available")).click();
        driver.findElement(AppiumBy.accessibilityId("OK")).click();
        Thread.sleep(10000);

    }
    @Test
    public void PrescriptionTypeTestTwo() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//android.view.View[@content-desc='Continue as Guest']")).click();
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        driver.findElement(By.xpath("//android.widget.ImageView[@index='3']")).click();
        driver.findElement(AppiumBy.accessibilityId("PRESCRIPTION")).click();
        driver.findElement(AppiumBy.accessibilityId("Not Required")).click();
        driver.findElement(AppiumBy.accessibilityId("Required")).click();
        driver.findElement(AppiumBy.accessibilityId("OK")).click();
        driver.findElement(AppiumBy.accessibilityId("Not Available")).click();
        driver.findElement(AppiumBy.accessibilityId("OK")).click();
        Thread.sleep(10000);

    }

    @Test
    public void PrescriptionTypeTestThree() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//android.view.View[@content-desc='Continue as Guest']")).click();
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        driver.findElement(By.xpath("//android.widget.ImageView[@index='3']")).click();
        driver.findElement(AppiumBy.accessibilityId("PRESCRIPTION")).click();
        driver.findElement(AppiumBy.accessibilityId("Not Available")).click();
        driver.findElement(AppiumBy.accessibilityId("Required")).click();
        driver.findElement(AppiumBy.accessibilityId("OK")).click();
        driver.findElement(AppiumBy.accessibilityId("Not Required")).click();
        driver.findElement(AppiumBy.accessibilityId("OK")).click();
        Thread.sleep(10000);

    }

    @Test
    public void ProductFormTestOne(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//android.view.View[@content-desc='Continue as Guest']")).click();
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        driver.findElement(By.xpath("//android.widget.ImageView[@index='3']")).click();
        driver.findElement(AppiumBy.accessibilityId("PRODUCT FORM")).click();
        driver.findElement(AppiumBy.accessibilityId("Tablet")).click();
        driver.findElement(AppiumBy.accessibilityId("Solution")).click();
        driver.findElement(AppiumBy.accessibilityId("Capsule")).click();
        driver.findElement(AppiumBy.accessibilityId("Injection")).click();
        driver.findElement(AppiumBy.accessibilityId("OK")).click();
    }


}
