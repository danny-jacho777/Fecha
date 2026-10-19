import java.util.Scanner;

public class PruebaFecha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CONFIGURACIÓN DE FECHA ===");
        System.out.print("Ingrese el mes (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el día (1-31): ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();

        Fecha fecha = new Fecha(mes, dia, anio);

        System.out.print("\nFecha ingresada: ");
        fecha.mostrarFecha();

        scanner.close();
    }
}