package Utils;

// import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestContextSetup {

  public WebDriver driver;
  public Base base;
  public PageObjectManager poma;

  public TestContextSetup() throws Exception {
    base = new Base();
    poma = new PageObjectManager(base.WebDriver());
  }

}
