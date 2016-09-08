package app.umariana.com.testpersistenciasql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by davidguerrero on 29/08/16.
 */
public class BaseDeDatosHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "db_empresa";
    public static final int DB_VERSION = 1;

    public BaseDeDatosHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ControladorSQL.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST " + ControladorSQL.TABLE_NAME);
        onCreate(db);
    }
}
