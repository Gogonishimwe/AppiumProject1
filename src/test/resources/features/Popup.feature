Feature:Popup

Scenario:popup windowe
When a user tap on Preference link
And taps on Preference dependencies link
And tick on checkbox
And taps on WIFI settings
And add <text> on popup window
And click OK 
And taps again on WIFI settings
Then the user should see added <text> on popup window

Example:
|text|
|Testing|