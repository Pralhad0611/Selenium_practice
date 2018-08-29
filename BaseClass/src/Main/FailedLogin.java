package Main;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FailedLogin extends BaseClass {
    @Test(description="This TC will perform valid login")
    public void loginToApplication() throws Throwable
    {
        Thread.sleep(5000);
        w.findElement(By.id("username")).sendKeys("8369808142");

        w.findElement(By.id("password")).sendKeys("1234");

        w.findElement(By.id("signin")).click();

        w.navigate().back();

        Thread.sleep(5000);
    }


    @Test(description="This TC will perform invalid login")
    public void loginToApplication1()
    {
        w.findElement(By.id("username")).sendKeys("admin1");

        w.findElement(By.id("password")).sendKeys("admin2");

        w.findElement(By.id("signin")).click();
    }
    /*@Test(description="This TC will perform valid login")
     public void loginToApplication() throws Throwable
    {
        w.findElement(By.name("name")).sendKeys("Admin1");

        w.findElement(By.name("email")).sendKeys("admin1");

        w.findElement(By.xpath("//html/body/form/div[3]/button")).click();

        w.navigate().back();

        Thread.sleep(5000);
    }


    @Test(description="This TC will perform invalid login")
    public void loginToApplication1()
    {
        w.findElement(By.name("name")).sendKeys("admin1");

        w.findElement(By.name("email")).sendKeys("admin2");

        w.findElement(By.xpath("//html/body/form/div[3]/button")).click();
    }*/
}
