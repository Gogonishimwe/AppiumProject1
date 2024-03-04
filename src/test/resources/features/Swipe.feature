Feature: Swipe gesture

Scenario:swipe two images right -> swipe two images back (left)
When a user tap on views link
And taps Gallery link
And taps on Photos link
 And swipe two images left
 And swipe two images right 
Then two images should be in focus