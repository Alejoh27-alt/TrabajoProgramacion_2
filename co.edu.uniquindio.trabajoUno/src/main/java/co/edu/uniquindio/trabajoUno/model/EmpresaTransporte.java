package co.edu.uniquindio.trabajoUno.model;
import java.util.List;
import java.util.ArrayList;

public class EmpresaTransporte {
    private String nombre;

    private List<Propietario> propietariolist = new ArrayList<>();
    private List<Usuario> usuariolist = new ArrayList<>();
    private List<VehiculoCarga> vehiculoCargaList = new ArrayList<>();
    private List<VehiculoTransporte> vehiculoTransporteList = new ArrayList<>();

    public EmpresaTransporte(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Propietario> getPropietariolist() {
        return propietariolist;
    }

    public void setPropietariolist(List<Propietario> propietariolist) {
        this.propietariolist = propietariolist;
    }
    public List<Usuario> getUsuariolist() {
        return usuariolist;
    }
    public void setUsuariolist(List<Usuario> usuariolist) {
        this.usuariolist = usuariolist;
    }
    public List<VehiculoCarga> getVehiculoCargaList() {
        return vehiculoCargaList;
    }

    public List<VehiculoTransporte> getVehiculoTransporteList() {
        return vehiculoTransporteList;
    }

    public void setVehiculoCargaList(List<VehiculoCarga> vehiculoCargaList) {
        this.vehiculoCargaList = vehiculoCargaList;
    }

    public void setVehiculoTransporteList(List<VehiculoTransporte> vehiculoTransporteList) {
        this.vehiculoTransporteList = vehiculoTransporteList;
    }

    public void CrearPropietario (String nombre, String email, String celular, String cedula){
        Propietario propietario = new Propietario(nombre, email, celular, cedula);
        propietariolist.add(propietario);
    }
    public void CrearUsuario (int edad){
        Usuario usuario = new Usuario(edad);
        usuariolist.add(usuario);
    }
    public void CrearVehiculoTransporte (int maximoPasajero, String color, String placa, String marca, String modelo){
        VehiculoTransporte vehiculoTransporte = new VehiculoTransporte(maximoPasajero, color, placa, marca, modelo);
        vehiculoTransporteList.add(vehiculoTransporte);
    }
    public void CrearVehiculoCarga (Double capacidadCarga, int numeroEje, String color, String placa, String marca, String modelo){
        VehiculoCarga vehiculoCarga = new VehiculoCarga(capacidadCarga, numeroEje, color, placa, marca, modelo);
        vehiculoCargaList.add(vehiculoCarga);

    }


}
