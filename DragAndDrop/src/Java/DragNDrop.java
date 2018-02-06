package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragNDrop {

    WebDriver w;

    @Test
    public void ScrollBy_Page() throws Exception {

        System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to("http://jqueryui.com/resources/demos/droppable/default.html");
        w.manage().deleteAllCookies();
        Thread.sleep(3000);


        WebElement DraggableElement=w.findElement(By.id("draggable"));

        WebElement DroppableElement=w.findElement(By.id("droppable"));

        //Using Action class for drag and drop.
        Actions act=new Actions(w);

        //Dragged and dropped.
        act.dragAndDrop(DraggableElement, DroppableElement).build().perform();

    }

}
