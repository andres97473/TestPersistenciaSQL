package app.umariana.com.testpersistenciasql;

import android.annotation.TargetApi;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class OpcionConsultar extends AppCompatActivity {

    private ListView lista;
    private ControladorSQL controlador;
    private Cursor cursor;
    private SimpleCursorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcion_consultar);

        controlador = new ControladorSQL(this);
        lista = (ListView) findViewById(R.id.lista_empleados);

        listarDatos();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.eliminar_unidad) {
            eliminar1x1();
            Toast.makeText(getApplicationContext(),"Se eliminó", Toast.LENGTH_SHORT).show();
            adapter.changeCursor(cursor);
            startActivity(new Intent(this,OpcionConsultar.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public void listarDatos(){
        String[] from = new  String[] {
                controlador.ID_EMPLEADO,
                controlador.NOMBRE_EMPLEADO,
                controlador.APELLIDO_EMPLEADO,
                controlador.SEXO_EMPLEADO,
                controlador.FECHA_NACIMIENTO_EMPLEADO,
                controlador.FECHA_INGRESO_EMPLEADO,
                controlador.SALARIO_EMPLEADO,
                controlador.ESTADO_EMPLEADO };

        int[] to = new int[]{
                R.id.empleado_id,
                R.id.empleado_nombre,
                R.id.empleado_apellido,
                R.id.empleado_sexo,
                R.id.empleado_fecha_nacimiento,
                R.id.empleado_fecha_ingreso,
                R.id.empleado_salario,
                R.id.empleado_estado };

        cursor = controlador.leerDatos();
        adapter = new SimpleCursorAdapter(this, R.layout.formato_fila, cursor, from, to, 0);
        lista.setAdapter(adapter);
    }

    public void eliminar1x1(){
        cursor = controlador.leerDatos();
        cursor.moveToFirst();
        int id = Integer.parseInt(cursor.getString(0));
        controlador.eliminarDatos(id);
        if (cursor.moveToNext()){
            eliminar1x1();
        }
    }
}
