package co.edu.uniquindio.trabajoUno.model;

public class  Vehiculo {
    private String modelo;
    private String color;
    private String placa;
    private String marca;

    public Vehiculo(String modelo, String color, String placa, String marca) {
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
