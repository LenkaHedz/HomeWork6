package ua.training.model;

public enum DBRecords {
    // nick name, password
    ONE("lenka", "12345"),
    TWO("vova", "678910");

    private final String login;    // логин
    private final String password; // пароль

    DBRecords(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public String login() { return login; }
    public String password() { return password; }

    public static boolean checkLogin(String login){
        for (DBRecords row : DBRecords.values()) {
            if(row.login.equals(login)){
                return true;
            }
        }
        // добавляем в DB???
        return false;
    }

    @Override
    public String toString() {
        return DBRecords.this.name() +" {" +
                "login=" + login +
                ", password=" + password +
                '}';
    }
}
