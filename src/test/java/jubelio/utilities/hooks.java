package jubelio.utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import jubelio.config.env;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class hooks extends env {
    @Before
    public void before () {
        System.out.println("==================TESTING START================");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @After
    public void after () throws InterruptedException {
//        Thread.sleep(1000);
//        driver.quit();
    }
}
