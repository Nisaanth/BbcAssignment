Feature: Feauture to validate the Home Page elements

  Scenario: Validate title of BBC iPlayer Home
    Given Iplayer homepage has a title of BBC iPlayer - Home
    And I should be presented with one iPlayer navigation menu
    When I click on Channels button
    And I click on bbc one button
    Then I should be redirected to the corresponding page

  Scenario: user flow journey to validate whether there are 4 items in a carousel every time the user clicks  on the forward Button
    Given The iplayer home page has at least 4 programme items in a carousel
    When I click on the forward carousel button
    Then I should be presented with another set of 4 programme items in the carrousel
    And The relevant Playback page is displayed when an episode is clicked
