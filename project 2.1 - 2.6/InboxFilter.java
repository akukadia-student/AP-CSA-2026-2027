public class InboxFilter {
    public static void main(String[] args) {
        Email e = new Email("arkin.kukadia@pallottihs.com", "immediate action", 100, true, true);
        System.out.println(e);
        Email m = new Email("arkin.kukadia27@pallottihs.com", "Teams meeting", 1300, false, false);
        System.out.println(m);
        Email p = new Email("arkin.kukadia@pallottihs.info", "immediate message", 1000, true, true);
        System.out.println(p);
    }

    public static boolean checkIsSuspicious(Email email)
    {
        boolean one = email.getTimestamp() < 730 || email.getTimestamp() > 1600;
        String emailAddress = email.getSender();
        String organization = emailAddress.substring(emailAddress.indexOf("@"));
        boolean two = !(organization.equals("@pallottihs.info") || organization.equals("@pallottihs.org"));
        boolean three = email.getSubject().length() == 0;
        return one && two && three;
    }

    public static boolean checkIsMalicious(Email email)
    {
        String emailAddress = email.getSender();
        String organization = emailAddress.substring(emailAddress.indexOf("@"));
        boolean one = !(organization.equals("@pallottihs.info") || organization.equals("@pallottihs.org"));
        String school = organization.substring(organization.indexOf("."));
        if (one && email.getHasAttachments())
            return true;
        else if (!school.equals(".org") && !school.equals(".info") && (email.getHasAttachments() || email.getHasLinks()))
            return true;
        else
            return false;
    }

    public static boolean checkIsPhishing(Email email)
    {
        boolean one = email.getSubject().indexOf("urgent") != -1 || email.getSubject().indexOf("immediate") != -1;
        boolean two = email.getHasLinks();
        return one && two;
    }

    public static void applyFilters(Email email)
    {
        String s = "";
        if (checkIsSuspicious(email))
        {
            s += "S";
        }
        if (checkIsMalicious(email))
        {
            s += "M";
        }
        if (checkIsPhishing(email))
        {
            s += "P";
        }
        email.setFlags(s);
    }
}