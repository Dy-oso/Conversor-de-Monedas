import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
//        Solicitudes_API solicitud = new Solicitudes_API();
//        Cambio cambio= solicitud.solicitudDeCambio("USD");
//        System.out.println(cambio);

        Scanner scanner = new Scanner(System.in);
        Solicitudes_API api = new Solicitudes_API();  // Instancia de tu clase para las solicitudes API
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Salir");
            System.out.print("Elija una opción válida: ");

            // Leer la opción seleccionada
            opcion = scanner.nextInt();

            // Procesar la opción seleccionada
            switch (opcion) {
                case 1:
                    // Dólar a Peso argentino (USD -> ARS)
                    Metodo_Conversion.realizarConversion(api, "USD", "ARS");
                    break;
                case 2:
                    // Peso argentino a Dólar (ARS -> USD)
                    Metodo_Conversion.realizarConversion(api, "ARS", "USD");
                    break;
                case 3:
                    // Dólar a Real brasileño (USD -> BRL)
                    Metodo_Conversion.realizarConversion(api, "USD", "BRL");
                    break;
                case 4:
                    // Real brasileño a Dólar (BRL -> USD)
                    Metodo_Conversion.realizarConversion(api, "BRL", "USD");
                    break;
                case 5:
                    // Dólar a Peso colombiano (USD -> COP)
                    Metodo_Conversion.realizarConversion(api, "USD", "COP");
                    break;
                case 6:
                    // Peso colombiano a Dólar (COP -> USD)
                    Metodo_Conversion.realizarConversion(api, "COP", "USD");
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

            System.out.println("************************************\n");

        } while (opcion != 7);  // Repetir hasta que el usuario elija salir

        scanner.close();
    }
}

