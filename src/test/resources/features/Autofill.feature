Feature:Autofill
@popup
Scenario:Autofill

When a user tapp on views link
And taps on auto complete link
And taps  on screen top link
And tap on country input field
And tap a text "rw"
Then the countries that start with 'rw' should be displayed

