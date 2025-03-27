import java.util.ArrayList;
import java.util.List;

public class GestionEstacionamiento {
    private List<Estacionamiento> estacionamientos;


    public GestionEstacionamiento() {
        this.estacionamientos = new ArrayList<>();
    }

    public void registrarEstacionamiento() {
        String id = "";
        System.out.println("Estacionamiento " + id + " registrado.");
    }

    public void registrarEntradaSalida(String id, String tipoVehiculo, int horas) {
        for (Estacionamiento e : estacionamientos) {
            if (e.getId().equals(id)) {
                e.registrarEntradaSalida(tipoVehiculo, horas);
                return;
            }
        }
        System.out.println("Estacionamiento no encontrado.");
    }

    public void mostrarDetalle(String id) {
        for (Estacionamiento e : estacionamientos) {
            if (e.getId().equals(id)) {
                e.mostrarDetalle();
                return;
            }
        }
        System.out.println("Estacionamiento no encontrado.");
    }

    public void mostrarConsolidado() {
        int totalVehiculos = 0;
        int totalHoras = 0;
        int ingresosTotales = 0;

        for (Estacionamiento e : estacionamientos) {
            totalVehiculos += e.totalVehiculos;
            totalHoras += e.totalHoras;
            ingresosTotales += e.ingresosTotales;
        }

        System.out.println("Consolidado de todos los estacionamientos:");
        System.out.println("Total vehículos estacionados: " + totalVehiculos);
        System.out.println("Tiempo total de uso: " + totalHoras + " horas");
        System.out.println("Ingresos totales: $" + ingresosTotales + " pesos");
    }

    public void reiniciarEstacionamiento(String id) {
        for (Estacionamiento e : estacionamientos) {
            if (e.getId().equals(id)) {
                e.reiniciar();
                return;
            }
        }
        System.out.println("Estacionamiento no encontrado.");
    }
}