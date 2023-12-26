package Task1;

public class Auth {
    public MyUser login() {
        return new MyTwitterUser(new TwitterUser());
    }
}
