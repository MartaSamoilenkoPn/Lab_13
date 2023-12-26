package Task2;

public class DataBase extends БазаДаних {
    public String recieveUserData() {
        return отриматиДаніКористувача();
    }

    public String recieveStaticData() {
        return отриматиСтатистичніДані();
    }
}
