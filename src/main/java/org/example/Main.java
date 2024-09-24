package org.example;

import org.example.ayudas.Proveedor;
import org.example.ayudas.Repartidor;
import org.example.modelos.Cliente;
import org.example.modelos.Flor;

public class Main {
    public static void main(String[] args) {

        Cliente juanito = new Cliente();
        Cliente salome = new Cliente("1010", "Salome", 10, false, 0, 3, "No trabaja", true, "salo123", "123");

        Repartidor gertrudio = new Repartidor();
        Repartidor jhon = new Repartidor("2020", "Jhon",40,"moto", 3000, 3, "DCT22G", 10, "jhon2","321" );

        Flor eugenio = new Flor();
        Flor poeta = new Flor(1,"clavel",10,"Floristeria Marta", "azul", false, 100, true, 10000, false);

        Proveedor floristeriaMartha = new Proveedor();
        Proveedor floristeriaJhon = new Proveedor("3030","Floristeria Jhon", "Jhon", "Mula", "Medellin", 100, 100000, 4, "jhon213", "8282");

        System.out.println(juanito.getCedula() + " " + juanito.getNombre() + " " + juanito.getEdad() + " " + juanito.getTieneBono() + " " + juanito.getSalario()+ " " +juanito.getEstratoSocioeconomico()+ " " +juanito.getLugarTrabajo()+ " " +juanito.getEsRecurrente()+ " " +juanito.getUsuario()+ " " +juanito.getContraseña());
        System.out.println(salome.getCedula() + " " + salome.getNombre() + " " + salome.getEdad() + " " + salome.getTieneBono() + " " + salome.getSalario()+ " " +salome.getEstratoSocioeconomico()+ " " +salome.getLugarTrabajo()+ " " +salome.getEsRecurrente()+ " " +salome.getUsuario()+ " " +salome.getContraseña());

        System.out.println(gertrudio.getCedula() + " " + gertrudio.getNombre() + " " + gertrudio.getEdad() + " " + gertrudio.getVehiculo() + " " + gertrudio.getSalario() + " " + gertrudio.getEstratoSocioeconomico() + " " + gertrudio.getPlacaVehiculo() + " " + gertrudio.getCalificacion() + " " + gertrudio.getUsuario() + " " + gertrudio.getContraseña());
        System.out.println(jhon.getCedula() + " " + jhon.getNombre() + " " + jhon.getEdad() + " " + jhon.getVehiculo() + " " + jhon.getSalario() + " " + jhon.getEstratoSocioeconomico() + " " + jhon.getPlacaVehiculo() + " " + jhon.getCalificacion() + " " + jhon.getUsuario() + " " + jhon.getContraseña());

        System.out.println(eugenio.getId() + " " + eugenio.getEspecie() + " " + eugenio.getNumeroPetalos() + " " + eugenio.getFloristeria() + " " + eugenio.getColor() + " " + eugenio.getTieneEspinas() + " " + eugenio.getCantidadVentas() + " " + eugenio.getEsLocal() + " " + eugenio.getPrecio() + " " + eugenio.getEnExtincion());
        System.out.println(poeta.getId() + " " + poeta.getEspecie() + " " + poeta.getNumeroPetalos() + " " + poeta.getFloristeria() + " " + poeta.getColor() + " " + poeta.getTieneEspinas() + " " + poeta.getCantidadVentas() + " " + poeta.getEsLocal() + " " + poeta.getPrecio() + " " + poeta.getEnExtincion());

        System.out.println(floristeriaMartha.getNIT() + " " +
                floristeriaMartha.getNombre() + " " +
                floristeriaMartha.getRepresentante() + " " +
                floristeriaMartha.getMedioTransporte() + " " +
                floristeriaMartha.getLocacion() + " " +
                floristeriaMartha.getCantidad() + " " +
                floristeriaMartha.getValorFlor() + " " +
                floristeriaMartha.getCalificacion() + " " +
                floristeriaMartha.getUsuario() + " " +
                floristeriaMartha.getContraseña());

        // Impresión de los atributos de floristeriaJhon
        System.out.println(floristeriaJhon.getNIT() + " " +
                floristeriaJhon.getNombre() + " " +
                floristeriaJhon.getRepresentante() + " " +
                floristeriaJhon.getMedioTransporte() + " " +
                floristeriaJhon.getLocacion() + " " +
                floristeriaJhon.getCantidad() + " " +
                floristeriaJhon.getValorFlor() + " " +
                floristeriaJhon.getCalificacion() + " " +
                floristeriaJhon.getUsuario() + " " +
                floristeriaJhon.getContraseña());
    }


}