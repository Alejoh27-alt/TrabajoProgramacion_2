package co.edu.uniquindio.trabajoUno.model;

public class VehiculoCarga extends Vehiculo {
    private Double capacidadCarga;
    private int numeroEje;

    public VehiculoCarga(Double capacidadCarga, int numeroEje, String color, String placa, String marca, String modelo) {
        super(placa, color, marca, modelo);
        this.capacidadCarga = capacidadCarga;
        this.numeroEje = numeroEje;
    }
    public Double getCapacidadCarga() {
        return capacidadCarga;
    }
    public void setCapacidadCarga(Double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    public int getNumeroEje() {
        return numeroEje;
    }
    public void setNumeroEje(int numeroEje) {
        this.numeroEje = numeroEje;
    }

    @Override
    public String toString() {
        return "VehiculoCarga{" +
                "capacidadCarga=" + capacidadCarga +
                ", numeroEje=" + numeroEje +
                '}';
    }
}
