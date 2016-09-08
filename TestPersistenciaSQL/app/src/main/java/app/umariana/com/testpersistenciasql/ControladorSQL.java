package app.umariana.com.testpersistenciasql;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by davidguerrero on 29/08/16.
 */
public class ControladorSQL {

    public static final String TABLE_NAME = "empleados";
    public static final String ID_EMPLEADO = "_id";
    public static final String NOMBRE_EMPLEADO = "nombre";
    public static final String APELLIDO_EMPLEADO = "apellido";
    public static final String SEXO_EMPLEADO = "sexo";
    public static final String FECHA_NACIMIENTO_EMPLEADO = "fecha_nacimiento";
    public static final String FECHA_INGRESO_EMPLEADO = "fecha_ingreso";
    public static final String SALARIO_EMPLEADO = "salario";
    public static final String ESTADO_EMPLEADO = "estado";

    public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" +
            ID_EMPLEADO + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            NOMBRE_EMPLEADO + " TEXT NOT NULL, " +
            APELLIDO_EMPLEADO + " TEXT NOT NULL, " +
            SEXO_EMPLEADO + " VARCHAR(1) NOT NULL, " +
            FECHA_NACIMIENTO_EMPLEADO + " DATETIME NOT NULL, " +
            FECHA_INGRESO_EMPLEADO + " DATETIME NOT NULL, " +
            SALARIO_EMPLEADO + " FLOAT NOT NULL, " +
            ESTADO_EMPLEADO + " BOOLEAN NOT NULL);";

    private BaseDeDatosHelper bd_helper;
    private SQLiteDatabase db;

    public ControladorSQL(Context miContext) {
        bd_helper = new BaseDeDatosHelper(miContext);
        db = bd_helper.getWritableDatabase();
    }

    private ContentValues contentValues (String nombre, String apellido, String sexo, long fechaNacimiento, long fehcaIngreso, float salario, boolean estado){
        ContentValues cv = new ContentValues();
        cv.put(NOMBRE_EMPLEADO, nombre);
        cv.put(APELLIDO_EMPLEADO, apellido);
        cv.put(SEXO_EMPLEADO, sexo);
        cv.put(FECHA_NACIMIENTO_EMPLEADO, fechaNacimiento);
        cv.put(FECHA_INGRESO_EMPLEADO, fehcaIngreso);
        cv.put(SALARIO_EMPLEADO, salario);
        cv.put(ESTADO_EMPLEADO, estado);
        return cv;
    }

    public void insertarDatos(String nombre, String apellido, String sexo, long fechaNacimiento, long fehcaIngreso, float salario, boolean estado){
        db.insert(TABLE_NAME, null, contentValues(nombre,apellido,sexo,fechaNacimiento,fehcaIngreso,salario,estado));
    }

    public Cursor leerDatos(){
        String[] columnas = new String[] {
                ID_EMPLEADO,
                NOMBRE_EMPLEADO,
                APELLIDO_EMPLEADO,
                SEXO_EMPLEADO,
                FECHA_NACIMIENTO_EMPLEADO,
                FECHA_INGRESO_EMPLEADO,
                SALARIO_EMPLEADO,
                ESTADO_EMPLEADO };
        return db.query(TABLE_NAME, columnas, null, null, null, null, null);
    }

    public int actualizarDatos( ){
        return 0;
    }

    public void eliminarDatos(int id){
        db.delete(TABLE_NAME, ID_EMPLEADO + "=?", new String[]{String.valueOf(id)});
    }

    public void eliminarInformacion(){
        db.delete(TABLE_NAME, null, null);
    }

    public void modificarNombre(){}
    public void modificarFechaIngreso(){}
    public void modificarSalario(){}
    public void modificarEstado(){}

}
