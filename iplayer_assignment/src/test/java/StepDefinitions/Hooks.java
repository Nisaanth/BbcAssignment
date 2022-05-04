package StepDefinitions;

import Utils.TestContextSetup;
import io.cucumber.java.After;

public class Hooks {

  TestContextSetup tcs;

  public Hooks(TestContextSetup tcs) {
    this.tcs = tcs;
  }

  @After
  public void afterScenario() throws Exception {
    tcs.base.WebDriver().quit();
  }

}
