Feature:Popup
@popup
Scenario: popup window
When a user taps on Preference link
And taps on Preference dependencies link
And tick on Wifi checkbox
And taps on WIFI settings
And add text as "Testing" on popup window
And click OK 
Then the user should see added text on popup window
