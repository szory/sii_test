package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {

    String url;

    public WebDriverFactory(String url){
        this.url = url;
    };

    public WebDriver getWebDriverHandler(){
        WebDriver driver;
        System.out.println("INSIDE_BEFORE");

        String drv_path = "C:\\Instalki\\Tools\\Selenium\\chromeDriver\\chromedriver_85.exe";

        System.setProperty("webdriver.chrome.driver", drv_path);

        ChromeOptions options = new ChromeOptions();
        options.setCapability("platform", "ANY");

        driver = new ChromeDriver(options);
        //driver.manage().window().maximize();
        driver.get(url);

        return driver;
    }
}
