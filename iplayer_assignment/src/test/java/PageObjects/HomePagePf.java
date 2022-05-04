package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePf {

  WebDriver driver;

  public HomePagePf(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy(id = "nav-accessible-title")
  WebElement iPlayerTitle;

  @FindBy(xpath = "//h2[@class='section__header__title typo typo--bold typo--heron']")
  WebElement sectionTitle;

  @FindBy(xpath = "//nav[@aria-labelledby='nav-accessible-title']")
  WebElement iPlayerNavbar;

  @FindAll(@FindBy(xpath = "//section[@class='section']/div/div[2]/div"))
  List<WebElement> section;

  @FindAll(@FindBy(xpath = "//h2[@class='section__header__title typo typo--bold typo--heron']"))
  List<WebElement> sections;

  @FindAll(@FindBy(xpath = "//div[@class='carrousel__inner']/ul//li[@class='carrousel__item gel-1/2 gel-1/3@m gel-1/4@xl']/div/a"))
  List<WebElement> carouselItem;

  @FindAll(@FindBy(xpath = "//section[@aria-label='Most Popular']/div/div[2]/div/div/ul/li/div/a"))
  List<WebElement> mostPopularItems;

  @FindAll(@FindBy(xpath = "//div[@class='carrousel__inner']/ul//li[@class='carrousel__item gel-1/2 gel-1/3@m gel-1/4@xl']/div//a[@data-bbc-container='module-popular-most-popular']"))
  List<WebElement> mostPopularCarouselItem;

  @FindBy(xpath = "//section[@aria-label='Most Popular']/div/div[2]/div/div/div/div/button[2]")
  WebElement forwardCarouselBtn;

  @FindAll(@FindBy(xpath = "//section[@class='section']/div/div[2]/div"))
  List<WebElement> sectionCarousel;

  @FindBy(xpath = "//button[@data-bbc-content-label='channels']")
  WebElement channelsBtn;

  @FindBy(xpath = "//a[@href='/bbcone']")
  WebElement bbcLnk;

  public WebElement getIPlayerTitle() {
    return iPlayerTitle;
  }

  public WebElement getSectionTitle() {
    return sectionTitle;
  }

  public WebElement getIPlayerNavbar() {
    return iPlayerNavbar;
  }

  public List<WebElement> getSection() {
    return section;
  }

  public List<WebElement> getSections() {
    return sections;
  }

  public List<WebElement> getCarouselItem() {
    return carouselItem;
  }

  public List<WebElement> getMostPopularCarouselItem() {
    return mostPopularCarouselItem;
  }

  public WebElement getForwardCarouselBtn() {
    return forwardCarouselBtn;
  }

  public List<WebElement> getSectionCarousel() {
    return sectionCarousel;
  }

  public WebElement getChannelBtn() {
    return channelsBtn;
  }

  public WebElement getBbcLnk() {
    return bbcLnk;
  }

  public List<WebElement> getMostPopularItems() {
    return mostPopularItems;
  }

}
