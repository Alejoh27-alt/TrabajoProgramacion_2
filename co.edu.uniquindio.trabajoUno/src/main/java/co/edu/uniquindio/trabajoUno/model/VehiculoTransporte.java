package co.edu.uniquindio.trabajoUno.model;

public class VehiculoTransporte extends Vehiculo {
    private int numeroMaximoPasajeros;

    public VehiculoTransporte() {
    }

    public VehiculoTransporte(String placa, String modelo, String marca, String color, int numeroMaximoPasajeros) {
        super(placa, modelo, marca, color);
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    }

    public int getNumeroMaximoPasajeros() {
        return numeroMaximoPasajeros;
    }

    public void setNumeroMaximoPasajeros(int numeroMaximoPasajeros) {
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    }

    @Override
    public void encender() {
        System.out.println("No me encendio......ayuda");
    }

}
