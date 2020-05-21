package buttons.storytelleraman.com.labswitch;

public class Temp_DB {
    public static Database_handeler getDB_handler() {
        return DB_handler;
    }

    public static void setDB_handler(Database_handeler DB_handler) {
        Temp_DB.DB_handler = DB_handler;
    }

    public  static  Database_handeler DB_handler;

}
