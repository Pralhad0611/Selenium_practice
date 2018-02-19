package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;

public class DragNDrop {

    WebDriver w;
    String  filelocation = System.getProperty("user.dir");

    @Test
    public void Drag_NDrop() throws Exception {

        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to("http://jqueryui.com/resources/demos/droppable/default.html");
        w.manage().deleteAllCookies();
        Thread.sleep(3000);


        WebElement DraggableElement=w.findElement(By.id("draggable"));

        WebElement DroppableElement=w.findElement(By.id("droppable"));


        Actions act=new Actions(w);


        act.dragAndDrop(DraggableElement, DroppableElement).build().perform();

    }

}
