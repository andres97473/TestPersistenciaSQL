package app.umariana.com.testpersistenciasql;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class OpcionModificar extends AppCompatActivity implements View.OnClickListener{

    Button btn_modNombre, btn_modFechaIngreso, btn_modSalario, btn_modEstado, btn_modTodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcion_modificar);

        //------------BOTONES---------------
        btn_modNombre = (Button) findViewById(R.id.btn_mod_nombre);
        btn_modNombre.setOnClickListener(this);

        btn_modFechaIngreso = (Button) findViewById(R.id.btn_mod_fecha_ingreso);
        btn_modFechaIngreso.setOnClickListener(this);

        btn_modSalario = (Button) findViewById(R.id.btn_mod_salario);
        btn_modSalario.setOnClickListener(this);

        btn_modEstado = (Button) findViewById(R.id.btn_mod_estado);
        btn_modEstado.setOnClickListener(this);

        btn_modTodo = (Button) findViewById(R.id.btn_mod_todo);
        btn_modTodo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_mod_nombre:
                AlertDialog.Builder msj_modNombre = new AlertDialog.Builder(this);
                msj_modNombre.setMessage("¿Desea modificar el nombre de todos los empleados?");
                msj_modNombre.setTitle("Modificar nombre de empleados");
                msj_modNombre.setIcon(android.R.drawable.ic_dialog_alert);
                msj_modNombre.setCancelable(false);
                msj_modNombre.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Codigo modificar nombre
                        Toast.makeText(getApplicationContext(), "Nombre de los empleados modificado correctamente", Toast.LENGTH_SHORT).show();
                    }
                });
                msj_modNombre.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                msj_modNombre.show();
                break;
            case R.id.btn_mod_fecha_ingreso:
                AlertDialog.Builder msj_modFechaIngreso = new AlertDialog.Builder(this);
                msj_modFechaIngreso.setMessage("¿Desea modificar fecha de ingreso de todos los empleados?");
                msj_modFechaIngreso.setTitle("Modificar fecha de ingreso de empleados");
                msj_modFechaIngreso.setIcon(android.R.drawable.ic_dialog_alert);
                msj_modFechaIngreso.setCancelable(false);
                msj_modFechaIngreso.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Codigo modificar fecha de ingreso
                        Toast.makeText(getApplicationContext(), "Fecha de ingreso de los empleados modificada correctamente", Toast.LENGTH_SHORT).show();
                    }
                });
                msj_modFechaIngreso.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                msj_modFechaIngreso.show();
                break;
            case R.id.btn_mod_salario:
                AlertDialog.Builder msj_modSalario = new AlertDialog.Builder(this);
                msj_modSalario.setMessage("¿Desea modificar el salario de todos los empleados?");
                msj_modSalario.setTitle("Modificar salario de empleados");
                msj_modSalario.setIcon(android.R.drawable.ic_dialog_alert);
                msj_modSalario.setCancelable(false);
                msj_modSalario.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Codigo modificar salario
                        Toast.makeText(getApplicationContext(), "Salario de los empleados modificado correctamente", Toast.LENGTH_SHORT).show();
                    }
                });
                msj_modSalario.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                msj_modSalario.show();
                break;
            case R.id.btn_mod_estado:
                AlertDialog.Builder msj_modEstado = new AlertDialog.Builder(this);
                msj_modEstado.setMessage("¿Desea modificar el estado de todos los empleados?");
                msj_modEstado.setTitle("Modificar estado de empleados");
                msj_modEstado.setIcon(android.R.drawable.ic_dialog_alert);
                msj_modEstado.setCancelable(false);
                msj_modEstado.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Codigo modificar estado
                        Toast.makeText(getApplicationContext(), "Estado de los empleados modificado correctamente", Toast.LENGTH_SHORT).show();
                    }
                });
                msj_modEstado.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                msj_modEstado.show();
                break;
            case R.id.btn_mod_todo:

                break;
            default:
                break;
        }
    }
}
