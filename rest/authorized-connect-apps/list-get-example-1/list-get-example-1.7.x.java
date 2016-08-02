// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.rest.Twilio;
import com.twilio.rest.reader.api.v2010.account.AuthorizedConnectAppReader;
import com.twilio.rest.resource.ResourceSet;
import com.twilio.rest.resource.api.v2010.account.AuthorizedConnectApp;

public class Example {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  public static final String AUTH_TOKEN = "your_auth_token";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    ResourceSet<AuthorizedConnectApp> authorizedApps = new AuthorizedConnectAppReader().execute();

    // Loop over authorizedApps and print out a property for each one.
    for (AuthorizedConnectApp authorizedApp : authorizedApps) {
      System.out.println(authorizedApp.getConnectAppHomepageUrl());
    }
  }
}