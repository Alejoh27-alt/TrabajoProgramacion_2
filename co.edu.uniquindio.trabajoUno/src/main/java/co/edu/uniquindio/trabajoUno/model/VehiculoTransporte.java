package co.edu.uniquindio.trabajoUno.model;

public class VehiculoTransporte extends Vehiculo {
    private int maximoPasajero;

    public VehiculoTransporte(int maximoPasajero, String color, String placa, String marca, String modelo) {
        super(color, placa, marca, modelo);
        this.maximoPasajero = maximoPasajero;
    }

    public int getMaximoPasajero() {
        return maximoPasajero;
    }
    public void setMaximoPasajero(int maximoPasajero) {
        this.maximoPasajero = maximoPasajero;
    }

    @Override
    public String toString() {
        return "VehiculoTransporte{" +
                "maximoPasajero=" + maximoPasajero +
                '}';
    }
}
