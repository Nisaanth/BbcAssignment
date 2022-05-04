package Utils;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

  public WebDriver driver;
  public Properties prop;

  public WebDriver WebDriver() throws Exception {

    FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/global.properties");
    prop = new Properties();
    prop.load(fis);

    String browser_prop = prop.getProperty("browser");
    String browser_maven = System.getProperty("browser");

    String browser = browser_maven != null ? browser_maven : browser_prop;

    String url = prop.getProperty("url");

    if (driver == null) {
      if (browser.equalsIgnoreCase("chrome")) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
      } else if (browser.equalsIgnoreCase("firefox")) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
      } else if (browser.equalsIgnoreCase("msedge")) {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
      } else if (browser.equalsIgnoreCase("safari")) {
        driver = new SafariDriver();
      } else {
        throw new Exception("No driver is selected");
      }

      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();

      driver.get(url);
    }
    return driver;
  }

}
