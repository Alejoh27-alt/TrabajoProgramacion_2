package co.edu.uniquindio.trabajoUno;

import Factory.ModelFactory;
import co.edu.uniquindio.trabajoUno.model.EmpresaTransporte;



import co.edu.uniquindio.trabajoUno.model.*;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        EmpresaTransporte empresaTransporte = modelFactory.inicializarDatos();
        crearPropietarioVehiculoCarga(modelFactory);
        calcularTotalPasajerosTransportados(empresaTransporte);
    }

    private static void calcularTotalPasajerosTransportados(EmpresaTransporte empresaTransporte) {

    }

    private static void crearPropietarioVehiculoCarga(ModelFactory modelFactory) {
        String propietario = "Pepe";
        String vehiculo = "ARM 2232";
        modelFactory.crearPropietarioVehiculoCarga(propietario, vehiculo);
    }
//    private static void crearPropieatioVehiculoTransporte(ModelFactory modelFactory) {
//        String propietario = "Alejo";
//        String vehiculo = "AAA 2232";
//        modelFactory.crearPropieatioVehiculoTransporte(propietario, vehiculo);
//    }
}