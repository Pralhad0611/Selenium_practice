package Java;
import org.monte.media.math.Rational;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.monte.media.FormatKeys.*;
import org.monte.screenrecorder.ScreenRecorder;
import java.awt.*;
import static org.monte.media.FormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;


public class VideoRecord {

    WebDriver w;

    public ScreenRecorder screenRecorder;


    @Test
    public void Video_Record() throws Exception {

        VideoRecord videoRecord = new VideoRecord();
        videoRecord.startRecording(); //Started recording

        System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
        w = new ChromeDriver();
        w.manage().window().maximize();
        w.navigate().to("http://localhost:9000");
        w.manage().deleteAllCookies();
        Thread.sleep(2000);

        w.findElement(By.id("userName")).clear();
        Thread.sleep(200);

        w.findElement(By.id("userName")).sendKeys("IDLO85421");
        Thread.sleep(200);

        w.findElement(By.id("password")).clear();
        Thread.sleep(200);

        w.findElement(By.id("password")).sendKeys("KOLPYG456");
        Thread.sleep(200);

        w.findElement(By.xpath("//html/body/div[2]/div/div/div/div/form/button")).click();
        Thread.sleep(5000);
        videoRecord.stopRecording(); //Stopped recording
    }


    public void startRecording() throws Exception
    {
        GraphicsConfiguration gc = GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getDefaultScreenDevice()
                .getDefaultConfiguration();

        this.screenRecorder = new ScreenRecorder(gc,
                new org.monte.media.Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
                new org.monte.media.Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                        CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                        DepthKey, 24, FrameRateKey, Rational.valueOf(15),
                        QualityKey, 1.0f,
                        KeyFrameIntervalKey, 15 * 60),
                new org.monte.media.Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black",FrameRateKey, Rational.valueOf(30)),
                null);
        this.screenRecorder.start();
    }

    public void stopRecording() throws Exception
    {
        this.screenRecorder.stop();
    }

}
