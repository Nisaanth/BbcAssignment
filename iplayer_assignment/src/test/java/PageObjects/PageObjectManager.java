package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

  WebDriver driver;
  HomePagePf hp;

  public PageObjectManager(WebDriver driver) {
    this.driver = driver;
  }

  public HomePagePf getHomePagePf() {
    hp = new HomePagePf(driver);
    return hp;
  }

}
