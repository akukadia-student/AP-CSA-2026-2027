# Email Filtering

You have been tasked with writing a program that can help to identify and flag phishing and malicious emails received by students and faculty at Pallotti. You have been provided with an `Email` class which will be used to represent a singular email received by an individual.

## Email Class

An `Email` object contains four pieces of data:
- `sender` - A String containing the full email address of the sender
- `subject` - A String containing the subject line of the email
- `timestamp` - An integer representing the time the email was sent, in 24 hour time
- `hasAttachments` - A boolean that indicates if an attachment was included on the email
- `hasLinks` - A boolean that indicates if an email includes any external links

## InboxFilter class

You will write a new class called `InboxFilter` that will contain methods to flag emails as suspicious. 

### checkIsSuspicious method

Write a class method in the `InboxFilter` class that returns a boolean and takes a single parameter of the `Email` object.

An email should be considered suspicious if all three of the following are true:
- The email was sent outside of working hours (7:30 AM - 4:00 PM).
- The email was sent by an address that is not in the organization (does not end in "@pallottihs.info" or "@pallottihs.org").
- The email does not contain a subject line.

## checkIsMalicious method

Write a class method in the `InboxFilter` class that returns a boolean and takes a single parameter of the `Email` object.

An email is should be considered malicious if any of the following are true:
- The email was sent by an address that is not in the organization (does not end in "@pallottihs.info" or "@pallottihs.org") and contains attachments.
- The email was sent by an account pretending to be a Pallotti account (ends in @pallottihs, but is not .org or .info) and contains either links or attachments.

## checkIsPhishing method

Write a class method in the `InboxFilter` class that returns a boolean and takes a single parameter of the `Email` object.

An email is considered phishing if all the following criteria are met:
- The subject contains the words "urgent" or "immediate".
- The email contains links.

## flags attribute of Email class

For this, you will need to modify the `Email` class to contain a new String attribute called `flags`. This will contain any indicators that the filter has caught. It should start as the empty string (it should never be null).

You will also need to add a mutator method to the `Email` class to set the value of `flags`.

Finally, you should modify the `toString` method so that the flags are printed in brackets (the square ones that look like "[]") at the very beginning of the message.

## applyFilters method

Write a class method in the `InboxFilter` class that does not return anything and takes an `Email` object as a parameter.

This method should create a string for the filter, and it should use the previous three methods to determine if an email is suspicious, malicious, or phishing. It will then add a letter to a flag string ("S" for suspicious, "M" for malicious, and "P" for phishing), and write the flags to the `Email` object.