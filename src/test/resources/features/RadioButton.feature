Feature: Radio Buttons
@popup
    Scenario: Select with Radio Buttons
        When a user tapson views link
        And the user scrollDown to RadionGroup link
        And the user chooses dinner with RadionButtons from Views-RadionButtons
        Then the item should be selcted
        And the user taps on clear
        Then the selected item should be disappear.