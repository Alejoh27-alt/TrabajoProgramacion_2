package co.edu.uniquindio.trabajoUno;

import model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmpresaTransporte nombreEmpresa = new EmpresaTransporte("La Carreta");
        Propietario propietarioUno = new Propietario("Jose","jose@gmail.com", "33333", "111");
        Usuario usuarioUno = new Usuario(18);
        VehiculoCarga vehiculoCargaUno = new VehiculoCarga(18.2, 7);
        VehiculoTransporte vehiculoTransporteUno = new VehiculoTransporte(8);

        System.out.println(nombreEmpresa);
        System.out.println(propietarioUno);
        System.out.println(usuarioUno);
        System.out.println(vehiculoCargaUno);
        System.out.println(vehiculoTransporteUno);
    }
}