package SQL;

public class Usuario {

    private int id;
    private int dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private double saldo;

    public Usuario(int id, int dni, String nombre, String apellido1, String apellido2, String direccion, double saldo) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString(){
        return "ID: "+id+" | DNI: "+dni+" | NOMBRE "+nombre+" | PRIMER APELLIDO: "+apellido1+" | SEGUNDO APELLIDO: "+apellido2+" | DIRECCION: "+direccion+" | SALDO: "+saldo;
    }
}
