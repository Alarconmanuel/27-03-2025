public class Estacionamiento {
    protected String id;
    protected int totalVehiculos;
    protected int totalHoras;
    protected int ingresosTotales;


    public Estacionamiento(String id, int totalVehiculos, int totalHoras, int ingresosTotales) {
        this.id = id;
        this.totalVehiculos = totalVehiculos;
        this.totalHoras = totalHoras;
        this.ingresosTotales = ingresosTotales;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setTotalVehiculos(int totalVehiculos) {
        this.totalVehiculos = totalVehiculos;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }

    public int getIngresosTotales() {
        return ingresosTotales;
    }

    public void setIngresosTotales(int ingresosTotales) {
        this.ingresosTotales = ingresosTotales;
    }

    @Override
    public String toString() {
        return "Estacionamiento{" +
                "id='" + id + '\'' +
                ", totalVehiculos=" + totalVehiculos +
                ", totalHoras=" + totalHoras +
                ", ingresosTotales=" + ingresosTotales +
                '}';
    }

    public void registrarEntradaSalida(String tipoVehiculo, int horas) {
        int tarifa;
        switch (tipoVehiculo) {
            case "Automóvil" -> tarifa = 160;
            case "Motocicleta" -> tarifa = 110;
            case "Camión" -> tarifa = 250;
            default -> {
                System.out.println("Tipo de vehículo no válido.");
                return;
            }
        }

        int costo = tarifa * horas;
        totalVehiculos++;
        totalHoras += horas;
        ingresosTotales += costo;
    }

    public void mostrarDetalle() {
        System.out.println("Estacionamiento " + id + ":");
        System.out.println("Total vehículos estacionados: " + totalVehiculos);
        System.out.println("Tiempo total de uso: " + totalHoras + " horas");
        System.out.println("Ingresos totales: $" + ingresosTotales + " pesos");
    }

    public void reiniciar() {
        totalVehiculos = 0;
        totalHoras = 0;
        ingresosTotales = 0;
    }
}
