package co.edu.uniquindio.trabajoUno.model;

public class Usuario {
    private int edad;

    public Usuario(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "edad=" + edad +
                '}';
    }
}
