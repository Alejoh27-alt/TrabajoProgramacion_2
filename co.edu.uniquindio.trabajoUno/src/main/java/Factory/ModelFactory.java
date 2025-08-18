package Factory;


import co.edu.uniquindio.trabajoUno.model.EmpresaTransporte;
import co.edu.uniquindio.trabajoUno.model.Propietario;
import co.edu.uniquindio.trabajoUno.model.VehiculoCarga;
import co.edu.uniquindio.trabajoUno.model.VehiculoTransporte;

public class ModelFactory {
    private static ModelFactory instance;

    EmpresaTransporte empresaTransporte;

    private ModelFactory() {
    }

    public static ModelFactory getInstance() {
        if(instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    public EmpresaTransporte inicializarDatos() {
        EmpresaTransporte empresa = new EmpresaTransporte();
        empresa.setNombre("La carreta");
        VehiculoCarga vehiculoCarga = new VehiculoCarga();
        vehiculoCarga.setCapacidadCarga(200);
        VehiculoCarga vehiculoCarga2 = new VehiculoCarga();
        vehiculoCarga2.setCapacidadCarga(500);
        VehiculoTransporte vehiculoTransporte = new VehiculoTransporte();
//        VehiculoTransporte.s(10);
        Propietario propietario = new Propietario();
        propietario.setNombre("Pedro");
        propietario.setVehiculo(vehiculoCarga);
        propietario.getListaVehiculosCarga().add(vehiculoCarga2);
        empresa.getListaVehiculosCarga().add(vehiculoCarga);
        empresa.getListaVehiculosTransporte().add(vehiculoTransporte);
        empresa.getListaPropietarios().add(propietario);
        this.empresaTransporte = empresa;

        return empresa;
    }

    public EmpresaTransporte getEmpresaTransporte() {
        return empresaTransporte;
    }


    public void crearPropietarioVehiculoCarga(String propietario, String vehiculo) {
        getEmpresaTransporte().crearPropietarioVehiculoCarga(propietario, vehiculo);
    }
//    public void crearPropieatioVehiculoTransporte(String propietario, String vehiculo) {
//        getEmpresaTransporte().crearPropieatioVehiculoTransporte(propietario, vehiculo);
//    }
}
