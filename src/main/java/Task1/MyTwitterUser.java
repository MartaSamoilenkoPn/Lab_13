package Task1;

import java.time.LocalDateTime;

public class MyTwitterUser implements MyUser {
    private final TwitterUser twitterUser;
    public MyTwitterUser(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    @Override
    public String getEmail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public LocalDateTime getLastActiveTime() {
        return twitterUser.getLastActiveTime();
    }
}
