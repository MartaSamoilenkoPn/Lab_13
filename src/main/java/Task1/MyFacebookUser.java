package Task1;

import java.time.LocalDateTime;

public class MyFacebookUser implements MyUser {
    private final FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public LocalDateTime getLastActiveTime() {
        return facebookUser.getUserActiveTime().atStartOfDay();
    }
}
