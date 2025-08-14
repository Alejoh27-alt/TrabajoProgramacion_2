package model;

public class VehiculoCarga {
    public Double capacidadCarga;
    public int numeroEje;

    public VehiculoCarga(Double capacidadCarga, int numeroEje) {
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
}
