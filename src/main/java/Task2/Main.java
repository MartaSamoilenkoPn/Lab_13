package Task2;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();

        Authorization authorization = new Authorization();
        if (authorization.auth(dataBase)) {
            ReportBuilder reportBuilder = new ReportBuilder(dataBase);
        }
    }
}
