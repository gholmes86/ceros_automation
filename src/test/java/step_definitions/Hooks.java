package step_definitions;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

  public static WebDriver driver;

  @Before
  /**
   * Delete all cookies at the start of each scenario to avoid shared state between tests
   */
  public void openBrowser() throws MalformedURLException, IOException {
    String sysUser = System.getProperty("user.name");
    String osName = System.getProperty("os.name");

    WebDriverManager.chromedriver().setup();
    WebDriverManager.firefoxdriver().setup();
    WebDriverManager.operadriver().setup();
    WebDriverManager.phantomjs().setup();
//    WebDriverManager.edgedriver().setup();
    WebDriverManager.iedriver().setup();

    String browser = System.getProperty("BROWSER");
    if (browser == null) {
      browser = System.getenv("BROWSER");
      if (browser == null) {
        browser = "chrome";
      }
    }
    System.out.println("openBrowser: browser " + browser);
    switch (browser) {
      case "chrome":
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("download.prompt_for_download", "false");
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("plugins.always_open_pdf_externally", true);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        // options.addArguments("--disable-extensions");
     //   options.addArguments("--start-maximized");
        options.addArguments("--no-sandbox");
        options.addArguments("disable-gpu");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--always-authorize-plugins=false");
        options.addArguments("window-size=1400,2100");
     //   options.addArguments("headless");
        driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        driver.manage().window().setSize(new Dimension(1280, 1024));
        break;
      case "firefox":
        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().setSize(new Dimension(1280, 1024));
        driver.manage().window().maximize();
        break;
      case "ie":
        driver = new InternetExplorerDriver();
        break;
      case "safari":
        driver = new SafariDriver();
        break;
      default:
        driver = new ChromeDriver();
        break;
    }
    System.out.println("Opening Browser...." + browser);
  }

  @After
  /**
   * Embed a screenshot in test report if test is marked as failed
   */
  public void embedScreenshot(Scenario scenario) {

    if (scenario.isFailed()) {
      byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
      scenario.embed(screenshot, "image/png");
    }
    if (driver != null) {
      driver.quit();

    }

  }
}