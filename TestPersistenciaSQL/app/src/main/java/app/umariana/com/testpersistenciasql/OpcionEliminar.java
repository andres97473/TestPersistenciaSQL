package app.umariana.com.testpersistenciasql;

import android.content.Context;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class OpcionEliminar extends AppCompatActivity implements View.OnClickListener {

    private Button btn_eliminar_inf;
    private ControladorSQL controladorSQL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcion_eliminar);

        controladorSQL = new ControladorSQL(this);
        btn_eliminar_inf = (Button) findViewById(R.id.btn_eliminar_inf);
        btn_eliminar_inf.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_eliminar_inf:
                AlertDialog.Builder msj_eliminar_todo = new AlertDialog.Builder(this);
                msj_eliminar_todo.setMessage("¿Desea agregar gran cantidad de información?");
                msj_eliminar_todo.setTitle("Agregar grande cantidad de información");
                msj_eliminar_todo.setIcon(android.R.drawable.ic_dialog_alert);
                msj_eliminar_todo.setCancelable(false);
                msj_eliminar_todo.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        controladorSQL.eliminarInformacion();
                        Toast.makeText(getApplicationContext(), "Toda la información se ha eliminado correctamente", Toast.LENGTH_SHORT).show();
                    }
                });
                msj_eliminar_todo.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                msj_eliminar_todo.show();
                break;
            default:
                break;
        }
    }
}
