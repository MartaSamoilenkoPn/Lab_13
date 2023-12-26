package Task2;

public class Authorization extends Авторизація {
    public boolean auth(DataBase dataBase) {
        dataBase.recieveStaticData();
        return true;
    }
}
