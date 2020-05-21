package buttons.storytelleraman.com.labswitch;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database_handeler extends SQLiteOpenHelper {

    private static String key_ip="IP";
    private static String key_name="SysName";

    private static String key_table="Add_System_Table";

    public Database_handeler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String create_table="CREATE TABLE  "+key_table+"("+key_ip+" INTEGER PRIMARY KEY,"+key_name+" TEXT"+")";
        sqLiteDatabase.execSQL(create_table);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public  int insertSystem(User_DB user){
        int i=0;
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(key_ip,user.getIP_address());
        contentValues.put(key_name,user.getSystem_name());
        sqLiteDatabase.insert(key_table,null,contentValues);
        i=1;
        return i;
    }
}
