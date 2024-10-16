import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Solicitudes_API {
        //Metodo para realizar la solicitud de cambio de moneda a la Api
    Cambio solicitudDeCambio(String numeroDeMoneda){
        // La URL de la API donde se realiza la solicitud
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/9f14b7909f4bbeea31b10cd9/latest/" + numeroDeMoneda);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build(); // Crea la solicitud GET a la API

        HttpResponse<String> response = null;
        try {
            // Enviar la solicitud y capturar la respuesta como una cadena de texto (JSON)
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        System.out.println("Respuesta de la API: " + response.body()); sirve para provar la solicitud

        // Deserializar el JSON a un objeto de la clase 'Cambio'
        return new Gson().fromJson(response.body(), Cambio.class);

    }

}
