import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        GestionEstacionamiento gestion = new GestionEstacionamiento();
        Scanner teclado = new Scanner(System.in);
        boolean seguir = true;

        while (seguir) {
            System.out.println("""
                    1. Registrar Estacionamiento
                    2. Registrar Entrada/Salida de Vehículo
                    3. Mostrar Detalle de un Estacionamiento
                    4. Mostrar Consolidado
                    5. Reiniciar Estacionamiento
                    6. Salir
                    """);

            int op = teclado.nextInt();
            teclado.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Ingrese ID del estacionamiento: ");
                    String id = teclado.nextLine();
                    gestion.registrarEstacionamiento(id);
                }
                case 2 -> {
                    System.out.print("Ingrese ID del estacionamiento: ");
                    String id = teclado.nextLine();
                    System.out.print("Tipo de vehículo (Automóvil, Motocicleta, Camión): ");
                    String tipoVehiculo = teclado.nextLine();
                    System.out.print("Horas estacionado: ");
                    int horas = teclado.nextInt();
                    gestion.registrarEntradaSalida(id, tipoVehiculo, horas);
                }
                case 3 -> {
                    System.out.print("Ingrese ID del estacionamiento: ");
                    String id = teclado.nextLine();
                    gestion.mostrarDetalle(id);
                }
                case 4 -> gestion.mostrarConsolidado();
                case 5 -> {
                    System.out.print("Ingrese ID del estacionamiento a reiniciar: ");
                    String id = teclado.nextLine();
                    gestion.reiniciarEstacionamiento(id);
                }
                case 6 -> {
                    System.out.println("Saliendo...");
                    seguir = false;
                }
                default -> System.out.println("Opción no válida, intenta de nuevo.");
            }
        }

    }
}