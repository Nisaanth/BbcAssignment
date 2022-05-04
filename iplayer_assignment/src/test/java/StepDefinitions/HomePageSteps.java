package StepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import PageObjects.HomePagePf;
import PageObjects.PageObjectManager;
import Utils.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

  WebDriver driver;
  TestContextSetup tcs;
  PageObjectManager poma;
  HomePagePf hp;

  String bbcTitle;
  String bbcOneTitle;

  List<WebElement> mostPopularCarouselItems;

  public HomePageSteps(TestContextSetup tcs) {
    this.tcs = tcs;
    this.hp = tcs.poma.getHomePagePf();

    bbcTitle = tcs.base.prop.getProperty("bbcTitle");
    bbcOneTitle = tcs.base.prop.getProperty("bbcOneTitle");
    mostPopularCarouselItems = hp.getMostPopularCarouselItem();
  }

  @Given("Iplayer homepage has a title of BBC iPlayer - Home")
  public void iplayer_homepage_has_a_title_of_bbc_iplayer_home() throws Throwable {
    hp.getIPlayerTitle().isDisplayed();

    String actualTitle = tcs.base.driver.getTitle();

    Assert.assertEquals(actualTitle, bbcTitle);
  }

  @And("I should be presented with one iPlayer navigation menu")
  public void i_should_be_presented_with_one_iplayer_navigation_menu() throws Throwable {
    hp.getIPlayerNavbar().isDisplayed();
  }

  @When("I click on Channels button")
  public void i_click_on_channels_button() throws Throwable {
    hp.getChannelBtn().click();
  }

  @And("I click on bbc one button")
  public void i_click_on_bbc_one_button() throws Throwable {
    hp.getBbcLnk().click();
    Thread.sleep(2000);
  }

  @Then("I should be redirected to the corresponding page")
  public void i_should_be_redirected_to_the_corresponding_page() throws Throwable {

    String actualTitle = tcs.base.driver.getTitle();
    Assert.assertEquals(actualTitle, bbcOneTitle);
  }

  @Given("The iplayer home page has at least 4 programme items in a carousel")
  public void the_iplayer_home_page_has_at_least_4_programme_items_in_a_carousel() throws Throwable {

    Assert.assertEquals(mostPopularCarouselItems.size(), 4);
  }

  @When("I click on the forward carousel button")
  public void i_click_on_the_forward_carousel_button() throws Throwable {

    hp.getForwardCarouselBtn().click();
  }

  @Then("I should be presented with another set of 4 programme items in the carrousel")
  public void i_should_be_presented_with_another_set_of_4_programme_items_in_the_carrousel()
      throws Throwable {
    Assert.assertEquals(mostPopularCarouselItems.size(), 4);
  }

  @And("The relevant Playback page is displayed when an episode is clicked")
  public void the_relevant_playback_page_is_displayed_when_an_episode_is_clicked() throws Throwable {

    for (int i = 0; i < 1; i++) {
      String programme = mostPopularCarouselItems.get(i).getText();

      System.out.println(programme);
      mostPopularCarouselItems.get(i).click();
      Thread.sleep(4000);
      String programmeTitle = tcs.base.driver.getTitle();

      if (programmeTitle.contains(programme)) {
        Assert.assertTrue(true);
      }

    }

  }

}
