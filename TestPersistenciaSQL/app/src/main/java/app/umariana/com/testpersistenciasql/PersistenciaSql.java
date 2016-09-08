package app.umariana.com.testpersistenciasql;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PersistenciaSql extends AppCompatActivity implements View.OnClickListener {

    Button op_agregar, op_consultar, op_modificar, op_eliminar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persistencia_sql);

        op_agregar = (Button) findViewById(R.id.btn_agregar);
        op_agregar.setOnClickListener(this);

        op_consultar = (Button) findViewById(R.id.btn_consultar);
        op_consultar.setOnClickListener(this);

        op_modificar = (Button) findViewById(R.id.btn_modificar);
        op_modificar.setOnClickListener(this);

        op_eliminar = (Button) findViewById(R.id.btn_eliminar);
        op_eliminar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_agregar:
                Intent intentA = new Intent(this, OpcionAgregar.class);
                startActivity(intentA);
                break;
            case  R.id.btn_consultar:
                Intent intentC = new Intent(this, OpcionConsultar.class);
                startActivity(intentC);
                break;
            case R.id.btn_modificar:
                Intent intentM = new Intent(this, OpcionModificar.class);
                startActivity(intentM);
                break;
            case R.id.btn_eliminar:
                Intent intentE = new Intent(this, OpcionEliminar.class);
                startActivity(intentE);
                break;
            default:
                break;
        }
    }
}
