package model;

public class Propietario {
    public String nombre;
    public String email;
    public String celular;
    public String cedula;

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
}
