package co.edu.uniquindio.trabajoUno.model;

public class Propietario {
    private String nombre;
    private String email;
    private String celular;
    private String cedula;

    public Propietario(String nombre, String email, String celular, String cedula) {
        this.nombre = nombre;
        this.email = email;
        this.celular = celular;
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                '}';
    }
}
