
Feature: Scroll
Backgroung:When the clicks on views link
 @popup
  Scenario: Scroll down 
    When the user scroll down 
    Then the user should see TextClock link
   
 Scenario: Scroll up 
  When the user scroll 
  Then The Animation link should be displayed

