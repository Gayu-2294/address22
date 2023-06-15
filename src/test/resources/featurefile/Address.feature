Feature:
   check the functionlity of deliver to location
Scenario:
to validate the user address via pincode
Given :user launch the amazon url
When :user click the deliver to button
And :user send the valid pincode in the popup textbox
Then :user click the search button and able to see the location
