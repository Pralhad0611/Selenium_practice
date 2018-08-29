package Main;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class sikuliBasic

    {

    public static void main(String[] args) throws FindFailed, InterruptedException {

// We have to create Screen class object to access method
        WebDriver w;

        String filelocation = System.getProperty("user.dir");
       Screen screen = new org.sikuli.script.Screen();

        String SikuliGmail = filelocation + File.separator + "Docs_files" + File.separator + "SikuliImgs" + File.separator + "gmail1.png";
        String SikuliGmail12 = filelocation + File.separator + "Docs_files" + File.separator + "SikuliImgs" + File.separator + "gmail2.png";
        String MailID = filelocation + File.separator + "Docs_files" + File.separator + "SikuliImgs" + File.separator + "MailID.png";
        String nxtBttn = filelocation + File.separator + "Docs_files" + File.separator + "SikuliImgs" + File.separator + "nextBttn.png";

// Create object of Pattern class and specify the images path

        Pattern image = new Pattern(SikuliGmail);
        Pattern image12 = new Pattern(SikuliGmail12);
        Pattern skMailID = new Pattern(MailID);
        Pattern skNxtBttn = new Pattern(nxtBttn);

       /* Pattern image1 = new Pattern("C:\\images\\uname.PNG");

        Pattern image2 = new Pattern("C:\\images\\password.PNG");

        Pattern image3 = new Pattern("C:\\images\\click.PNG");*/

        String ChrmDrvr = filelocation + File.separator + "Drivers" + File.separator + "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChrmDrvr);
        w = new ChromeDriver();
        w.manage().window().maximize();
       // WebDriver driver=new FirefoxDriver();
        w.get("http://www.google.com");

        screen.wait(image, 10);
        screen.click(image);

        screen.wait(image12, 2000);
        screen.click(image12);

        Thread.sleep(2000);
        screen.find(skMailID);
        screen.type(skMailID, "abcd@gmail.com");

        screen.wait(skNxtBttn, 2000);
        screen.click(skNxtBttn);

    }
}
