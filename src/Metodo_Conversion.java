import java.util.Scanner;

public class Metodo_Conversion {

    public static void realizarConversion(Solicitudes_API api, String monedaBase, String monedaObjetivo) {
        // Llamada a la API para obtener la tasa de cambio
        Cambio cambio = api.solicitudDeCambio(monedaBase);

        // Mostrar el resultado de la conversión
        if (cambio != null && cambio.conversion_rates().containsKey(monedaObjetivo)) {
            double tasaCambio = cambio.conversion_rates().get(monedaObjetivo);

            // Pedir al usuario que ingrese la cantidad a convertir
            System.out.print("Ingrese el valor que deseas convertir: ");
            Scanner scanner = new Scanner(System.in);
            double cantidad = scanner.nextDouble();

            // Realizar la conversión
            double resultado = cantidad * tasaCambio;
            
            System.out.println("La tasa de cambio de " + monedaBase + " a " + monedaObjetivo + " es: " + tasaCambio);
            System.out.println("El valor convertido es: " + resultado);
        } else {
            System.out.println("No se pudo obtener la tasa de cambio.");
        }
    }
}

