import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DockerRun {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities().chrome();
        URL url = new URL("http://192.168.99.100:4444/wd/hub");
        WebDriver driver = new RemoteWebDriver(url,cap);
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
       // driver.quit();


    }
}
