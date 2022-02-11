@tag
Feature: Test BBC HomePage
Background: This is my background for all the testing
Given User opens the browser

  @bbc
  Scenario: Test Gmail, Images, About and Store links
    Given User opens BBC
    And User verifies the link News
    And User verifies the link Sport
    And User verifies the link Reel
    And User verifies the link Worklife
    Then Print out all above link values
    #And User verifies the link Travel
    #And User verifies the link Future
    #And User verifies the link Culture
    #And User verifies the link Home
    #And User verifies the link MoreLanguages
    #And User verifies the link Arabic
    #And User verifies the link Chinese
    #And User verifies the link Indonesian
    #And User verifies the link Kyrgyz
    #And User verifies the link Persian
    #And User verifies the link Somali
    #And User verifies the link Turkish
    #And User verifies the link Vietnamese
    #And User verifies the link Azeri
    #And User verifies the link French
    #And User verifies the link Japanese
    
    