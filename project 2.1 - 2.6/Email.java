public class Email
{
    // the full email address of the sender
    private String sender;

    // the subject line of the email
    //  this can be blank, but it will never be null
    private String subject;
    
    // the time of sending, stored as a 3 or 4 digit integer in 24 hour time
    //  for example 1530 represents 3:30 PM, and 745 represents 7:45 AM.
    private int timestamp;
    
    // this is true if an attachement was included, false otherwise
    private boolean hasAttachments;

    // this is true if the email contains links, false otherwise
    private boolean hasLink;

    public Email(String send, String subj, int t, boolean a, boolean l)
    {
        sender = send;
        subject = subj;
        timestamp = t;
        hasAttachments = a;
        hasLinks = l;
    }

    public String getSender()
    {
        return sender;
    }

    public String getSubject()
    {
        return subject;
    }

    public int getTimestamp()
    {
        return timestamp;
    }

    public boolean getHasAttachments()
    {
        return hasAttachments;
    }

    public boolean getHasLinks()
    {
        return hasLinks;
    }

    public String toString()
    {
        return "From: " + sender + " at " + timestamp + " Subject: " + subject + (hasAttachments ? " (With attachements)" : "");
    }
}