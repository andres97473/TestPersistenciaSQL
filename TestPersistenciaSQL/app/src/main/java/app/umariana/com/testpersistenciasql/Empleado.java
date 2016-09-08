package app.umariana.com.testpersistenciasql;

/**
 * Created by davidguerrero on 29/08/16.
 */
public class Empleado {

    int id, salario;
    String nombre, apellido;
    long fechaNacimiento, fechaIngreso;
    String sexo;
    boolean estado = true;

    public Empleado() {
    }

    public Empleado(int id) {
        this.id = id;
    }

    public Empleado(int salario, String nombre, String apellido, long fechaNacimiento, long fechaIngreso, String sexo, boolean estado) {
        this.salario = salario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.sexo = sexo;
        this.estado = estado;
    }

    public Empleado(int id, int salario, String nombre, String apellido, long fechaNacimiento, long fechaIngreso, String sexo, boolean estado) {
        this.id = id;
        this.salario = salario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.sexo = sexo;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(long fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(long fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
